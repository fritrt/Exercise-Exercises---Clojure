(ns trinary
  (:require [clojure.string :as str]))

(defn validate [num]
  (try
    (do
      (Integer/parseInt num)
      true)
    (catch Exception e
      false)))

(defn split [num]
  (mapv #(Integer/parseInt %) (str/split num #"")))

(defn inner [num]
  (mapv #(int (Math/pow 3 %)) (range (dec (count num)) -1 -1)))

(defn value [num]
  (if (= 1 (count num))
    (Integer/parseInt num)
    (reduce + (map * (inner num) (split num)))))

(defn to-decimal [num] ;; <- arglist goes here
      ;; your code goes here
  (if (validate num)
    (value num)
    0))



