(ns proverb
  (:require [clojure.string :as str]))

(defn mid [list]
  (map #(str " the " % " was lost.") (clojure.core/rest list)))

(defn start [list] 
  (map #(str "For want of a " %) list))

(defn end [list]
  (str "And all for the want of a " (first list) "."))

(defn recite [list] ;; <- arglist goes here
    ;; your code goes here
  (if (empty? list)
    ""
    (str/join "\n" (conj (mapv str (start list) (mid list)) (end list)))))

