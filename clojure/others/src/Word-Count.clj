(ns word-count
  (:require [clojure.string :as s]))

(defn word-count [data] ;; <- arglist goes here
  ;; your code goes here
  (reduce #(assoc %1 %2 (inc (%1 %2 0)))
          {}
          (s/trim data)))

(s/split  #"\n")