(ns isogram
  (:require [clojure.string :as str]))

(defn clean [str]
  (str/lower-case (str/replace str #"[ -]" "")))

(defn isogram? [word] ;; <- arglist goes here
  ;; your code goes here
  (= (count (clean word)) (count (set (clean word)))))

