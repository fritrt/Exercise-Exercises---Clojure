(ns rotational-cipher
  (:require [clojure.string :as str]))

(def alphabet
  "abcdefghijklmnopqrstuvwxyz")

(defn rotate-char [given-letter n]
  (let [index (str/index-of alphabet given-letter)]
    (cond 
      index (get alphabet (mod (+ index n) 26))
      :else given-letter)))

(rotate-char "a" 1)
(defn rotate [plain-text n]
  (apply str (map #(rotate-char % n) plain-text)))

(rotate "aa" 0)
(rotate "a" 1)
(rotate "n" 13)
(rotate "a" 26)


