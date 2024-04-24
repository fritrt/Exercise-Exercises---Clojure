(ns hamming
  (:require [clojure.string :as str])
  (:require [clojure.set :as set]))

(def split #(str/split % #""))

(split "ACT")
(defn distance [strand1 strand2] ; <- arglist goes here
  ;; your code goes here
  (if (= (count strand1) (count strand2)) 
    (count (filter not (map = strand1 strand2)))))

(distance "AGT" "GGA")

(distance "AAAC" "TAGGGGAGGCTAGCGGTAGGAC")