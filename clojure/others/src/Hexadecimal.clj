(ns hexadecimal
  (:require [clojure.string :as str]))


(defn check [letter]
  (cond
    (= letter "A") 10
    (= letter "B") 11
    (= letter "C") 12
    (= letter "D") 13
    (= letter "E") 14
    (= letter "F") 15))


(defn convert-hex [chr] ;; <- arglist goes here
  ;; your code goes here
  (if (Character/isDigit (apply char chr))
    (Integer/parseInt chr)
    (check (str/upper-case chr))))

(convert-hex "0")

(defn map-hex [char]
  (map-indexed list (map #(convert-hex %) (str/split char #""))))



(defn hex-to-int [char] ;; <- arglist goes here
  ;; your code goes here
  (if (= 1 (count char))
    (convert-hex char)
    (let [count (dec (count char))]
      (reduce + (map (fn [a b] (* b (Math/pow 16 (- count a)))) (map-hex char))))))

(defn check [char]
  (let [count (count "10")]
    (fn [a b] (* a (Math/pow 16 (- count b)))) char))
(check (1 0))
(count "10")
((fn [a b c] (+ a b c)) 2 4 6)






