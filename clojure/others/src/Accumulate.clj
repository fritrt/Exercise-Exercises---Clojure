(ns accumulate
  (:require [clojure.string :as str]))

(defn- square [n] (* n n))

(defn- to-s [xs] (apply str xs))

(defn accumulate [operation list] ;; <- arglist goes here
      ;; your code goes here
  (map operation list))

(accumulate square [1 2 3])