(ns rna-transcription
  (:require [clojure.string :as str]))

(defn convert [RNA]
  (cond
    (= "C" RNA) "G"
    (= "G" RNA) "C"
    (= "A" RNA) "U"
    (= "T" RNA) "A"))

(defn transcribe [dna]
  (str/join (map #(convert %) (str/split dna #""))))


(defn to-rna [dna] ;; <- arglist goes here
  ;; your code goes here
  (if (= (count dna) (count (transcribe dna)))
    (transcribe dna)
    (throw (AssertionError. "AssertionError"))))

(to-rna "XCGFGGTDTTAA")