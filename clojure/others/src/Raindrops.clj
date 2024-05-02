(ns raindrops
  (:require [clojure.string :as str]))

(defn sound-for-3 [num]
  (if (= 0 (mod num 3)) 
    "Pling" 
    nil))

(defn sound-for-5 [num]
  (if
   (= 0 (mod num 5)) "Plang"
   nil))

(defn sound-for-7 [num]
  (if
   (= 0 (mod num 7)) "Plong"
    nil))

(defn check-all-3 [num]
  (str (sound-for-3 num) (sound-for-5 num) (sound-for-7 num)))

(defn convert [num] ;; <- arglist goes here
      ;; your code goes here
  (if (empty? (check-all-3 num))
    (str num)
    (check-all-3 num)))

(convert 30)

(str "Pling" "Plong")

;; another solution

(defn convert2 [num]
  (let [sounds (str
                (if (= 0 (mod num 3)) "Pling" nil)
                (if (= 0 (mod num 5)) "Plang" nil)
                (if (= 0 (mod num 7)) "Plong" nil))]
    (if (empty? sounds)
      (str num)
      sounds)))

(convert2 16)
  