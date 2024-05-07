(ns isbn-verifier
  (:require [clojure.string :as str]))

(defn num [str] 
  (str/split (str/replace str "-" "") #""))


(defn convert [str]
  (if (= "X" (last (num str)))
    (assoc (num str) 9 "10")
    (num str)))


(defn every-char [str]
  (map #(Character/isDigit (apply char %)) (num str)))


(defn validation [str]
  (cond
    (and (every? true? (every-char str)) 
         (= 10 (count (num str)))) true
    (and (every? true? (take 9 (every-char str))) 
         (= "X" (last (num str))) 
         (= 10 (count (num str)))) true
    :else false))


(defn isbn? [isbn] ;; <- arglist goes here
  ;; your code goes here
  (if (true? (validation isbn))
    (== 0 (mod (reduce + 
                       (map * (range 10 0 -1) 
                            (map #(Integer/parseInt %) 
                                 (convert isbn)))) 
               11))
    false))




