(ns pangram
  (:require [clojure.string :as str]))

(defn pangram? [s] ;; <- arglist goes here
  ;; your code goes here
  (let [sentence (vec (str/lower-case (str/replace s #"[^a-zA-Z]" "")))]
    (= 26 (count (set sentence)))))

(pangram? "the2quick brown fox jumps over the lazy dog")

