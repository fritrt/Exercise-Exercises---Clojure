(ns roman-numerals
  (:require [clojure.string :as str]))

(defn romans [num]
  (cond
    (= num 1) "I"
    (= num 2) "II"
    (= num 3) "III"
    (= num 4) "IV"
    (= num 5) "V"
    (= num 6) "VI"
    (= num 7) "VII"
    (= num 8) "VIII"
    (= num 9) "IX"
    (= num 10) "X"
    (= num 50) "L"
    (= num 100) "C"
    (= num 500) "D"
    (= num 1000) "M"
    :else 0))
(defn by-1 [num]
  (romans num))

(defn by-10 [num]
  (str/join (repeat (quot num 10) (romans 10))))

(defn by-50 [num]
  (str/join (repeat (quot num 50) (romans 50))))




(defn numerals [num] ;; <- arglist goes here
      ;; your code goes here
  (fn [n]
    (loop)
    recur))

(quot 27 10)
(numerals 77)
