(ns pig-latin
  (:require [clojure.string :as str]))

(def vowel #{"a" "e" "i" "o" "u" "ae" "xr" "yt"})
(def consonant #{"b" "c" "d" "f" "g" "h" "j" "k" 
                 "l" "m" "n" "p" "q" "r" "s" "t" "v" "w" "x" "y" "z"})

(defn split [word]
  (str/split word #""))

(defn rule1 [word]
  (or (->> (split word)
            (first)
            (vowel)
            (boolean)) 
      (->> (split word)
           (take 2)
           (str/join "")
           (vowel)
           (boolean))))


(defn rule2 [word]
  (and (->> (split word)
            (first)
            (consonant)
            (boolean))
       (->> (split word)
            (second)
            (consonant)
            (boolean))))

(rule2 "chair")

(defn rule3 [word]
  (and (->> (split word)
            (first)
            (consonant)
            (boolean)) 
       (->> (split word)
            (second)
            (consonant)
            (boolean))))

(defn translate [word]
  (cond
    (true? (rule1 word)) (str word "ay")
    (true? (rule2 word)) (str (str/join "" (drop 2 (split word))) (str/join "" (take 2 (split word))) "ay") 
    (true? (rule3 word)) (str (str/join "" (rest (split word))) (str (take 2 (split word))) "ay")
    :else false))

(translate "rhythm")
(translate "therapy")


