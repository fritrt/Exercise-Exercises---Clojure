(ns protein-translation
  (:require [clojure.string :as s]))


(defn list-of-protein [RNA]
  (map #(cond
          (= % "AUG") "Methionine"
          (or (= % "UUU") (= % "UUC")) "Phenylalanine"
          (or (= % "UUA") (= % "UUG")) "Leucine"
          (or (= % "UCU") (= % "UCC") (= % "UCA") (= % "UCG")) "Serine"
          (or (= % "UAU") (= % "UAC")) "Tyrosine"
          (or (= % "UGU") (= % "UGC")) "Cysteine"
          (= % "UGG") "Tryptophan"
          :else "STOP")
       (let [codons (partition 3 RNA)]
         (map #(apply str %) codons))))

(defn translate-codon [RNA]
  (last (list-of-protein RNA)))


(defn translate-rna [RNA] ;; <- arglist goes here
  ;; your code goes here
  (take-while #(not= % "STOP")
              (list-of-protein RNA)))





