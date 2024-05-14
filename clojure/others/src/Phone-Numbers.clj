(ns phone-number
  (:require [clojure.string :as str]))

(defn clean [num]
  (->> num
       (re-seq #"\d+") 
       (str/join)))

(def default (str/join (repeat 10 "0")))

(defn valid-exchange-10 [num]
  (if (some #(= % (Integer/parseInt (subs (clean num) 3 4))) (range 2 10 1))
    (clean num)
    default))

(defn valid-exchange-11 [num]
  (if (some #(= % (Integer/parseInt (subs (clean num) 4 5))) (range 2 10 1))
    (str/join (rest (clean num)))
    default))

(defn valid-area-11 [num]
  (if (some #(= % (Integer/parseInt (subs (clean num) 1 2))) (range 2 10 1))
    (valid-exchange-11 num)
    default))

(defn valid-11 [num] 
  (if (= \1 (first (clean num)))
    (valid-area-11 num)
    default))

(defn valid-10 [num]
  (if (some #(= % (Integer/parseInt (subs (clean num) 0 1))) (range 2 10 1))
    (valid-exchange-10 num)
    default))

(defn check [num]
  (let [phone (clean num)]
    (cond
      (= 11 (count phone)) (valid-11 num)
      :else (valid-10 num))))

(defn number [num]
  (let [phone (clean num)]
    (if (some #(= % (count phone)) [10 11])
      (check num)
      default)))







