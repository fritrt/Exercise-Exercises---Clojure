(ns anagram
  (:require [clojure.string :as str]))


(defn map-word [word]
  (sort (str/split (str/lower-case word) #"")))

(defn anagram-of-word?
  "Returns true if prospect is an anagram of word"
  [word prospect]
  (if (not= (str/lower-case word) (str/lower-case prospect))
    (= (map-word word) (map-word prospect))
    false))

(defn anagrams-for [word prospect-list] ;; <- arglist goes here
  ;; your code goes here 
  (filter (partial anagram-of-word? word) prospect-list))

(anagrams-for "diaper" ["hello" "world" "zombies" "pants"])
(anagrams-for "ant" ["tan" "stand" "at"])




  (true? (anagram-of-word? "ant" "tan"))
  (true? (anagram-of-word? "Ant" "Tan"))
(false? (anagram-of-word? "banana" "banana"))
(false? (anagram-of-word? "banana" "BANANA"))