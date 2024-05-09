(ns trinary
  (:require [clojure.string :as str]))

(defn to-decimal [num] ;; <- arglist goes here
      ;; your code goes here
  (let [n (- (count (split num)) 1)]
    ))

(to-decimal "1")
(int? (Integer/parseInt ""))
(every? true? (map #(Character/isDigit %) [\1 \b]))
(map #(char (Integer/parseInt %)) (str/split "12" #""))

(defn split [num]
  (map #(Integer/parseInt %) (str/split num #"")))

(every? true? (map #(int? %) (str/split "carrot" #"")))
(Character/isLetter \c)
(int? "c")
(defn validate [num]
  (if (every? false? (map #(int? %) (str/split num #"")))
    false))
(every? false? (map #(int? %) (str/split "c" #"")))
(every? true? (map #(>= 2 %) (str/split "c")))
(validate "12")
(every? false? (map #(int? %) (str/split "12" #"")))
(validate "102012")
(every? false? (map #(int? %) (str/split "c" #"")))

(int? "a")
(split "12")
(range 10 -1 -1)
