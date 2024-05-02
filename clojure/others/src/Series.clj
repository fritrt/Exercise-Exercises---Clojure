(ns series
  (:require [clojure.string :as str]))



(defn slices [string length]
  (cond 
    (empty? string) []
    (= 0 length) [""]
    (> length (count string)) []
    :else 
    (map #(apply str %) (partition length 1 string))))

(slices "12345" 3)
(slices "123" 3)



