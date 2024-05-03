(ns beer-song
  (:require [clojure.string :as s]))

(defn verse [num]
  (cond 
    (> num 2) (str num " bottles of beer on the wall, " num " bottles of beer.\n" 
         "Take one down and pass it around, " (dec num) " bottles of beer on the wall.\n\n")
    (= num 2) (str num " bottles of beer on the wall, " num " bottles of beer.\n"
         "Take one down and pass it around, " (dec num) " bottle of beer on the wall.\n")
    (= num 0) (str "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n")
    :else (str num " bottle of beer on the wall, " num " bottle of beer.\n"
               "Take it down and pass it around, no more bottles of beer on the wall.\n")))


(defn sing
  "Given a start and an optional end, returns all verses in this interval. If
  end is not given, the whole song from start is sung."
  ([start]
   (apply str (map #(verse %) (reverse (range (+ start 1))))))
  ([start end]
   (apply str (map #(verse %) (reverse (range end (+ start 1)))))))

(sing 3)

(reverse (range 6 (+ 8 1)))
(reverse (range 0 (+ 3 1)))
(reverse (take 4 (range)))

"8 bottles of beer on the wall, 8 bottles of beer.\nTake one down and pass it around, 7 bottles of beer on the wall.\n\n7 bottles of beer on the wall, 7 bottles of beer.\nTake one down and pass it around, 6 bottles of beer on the wall.\n\n6 bottles of beer on the wall, 6 bottles of beer.\nTake one down and pass it around, 5 bottles of beer on the wall.\n"
"8 bottles of beer on the wall, 8 bottles of beer.\nTake one down and pass it around, 7 bottles of beer on the wall.\n7 bottles of beer on the wall, 7 bottles of beer.\nTake one down and pass it around, 6 bottles of beer on the wall.\n6 bottles of beer on the wall, 6 bottles of beer.\nTake one down and pass it around, 5 bottles of beer on the wall.\n"

"3 bottles of beer on the wall, 3 bottles of beer.\nTake one down and pass it around, 2 bottles of beer on the wall.\n\n2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n\n1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n\nNo more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
"3 bottles of beer on the wall, 3 bottles of beer.\nTake one down and pass it around, 2 bottles of beer on the wall.\n2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\nNo more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"