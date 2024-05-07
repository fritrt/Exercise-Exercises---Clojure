(ns beer-song
  (:require [clojure.string :as s]))

(defn verse [num]
  (cond 
    (> num 2) (str num " bottles of beer on the wall, " num " bottles of beer.\n" 
         "Take one down and pass it around, " (dec num) " bottles of beer on the wall.\n")
    (= num 2) (str num " bottles of beer on the wall, " num " bottles of beer.\n"
         "Take one down and pass it around, " (dec num) " bottle of beer on the wall.\n")
    (= num 0) (str "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n")
    :else (str num " bottle of beer on the wall, " num " bottle of beer.\n"
               "Take it down and pass it around, no more bottles of beer on the wall.\n")))


(defn sing
  "Given a start and an optional end, returns all verses in this interval. If
  end is not given, the whole song from start is sung."
  ([start]
   (s/join "\n" (map #(verse %) (range start (dec 0) -1))))
  ([start end]
   (s/join "\n" (map #(verse %) (range start (dec end) -1)))))

(sing 3)

(reverse (range 6 (+ 8 1)))
(reverse (range 0 (+ 3 1)))
(reverse (take 4 (range)))

(range 8 (dec 6) -1)
(range 3  -1)