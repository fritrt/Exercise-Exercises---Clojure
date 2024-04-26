(ns pig-latin
  (:require [clojure.string :as str]))


(defn first-2 [s]
  (take 2 (str/split s #"")))

(defn last [s]
  (drop 2 (str/split s #"")))

(defn rule-1? [s]
  (= (subs s 0 1) (re-matches #"[aeiou]" (subs s 0 1))))

(rule-1? "ask")

(defn rule-2? [s]
  (= (subs s 0 2) (re-matches #"[bcdfghjklmnpqrstvwxyz]" (subs s 0 2))))

(rule-2? "ask")

(defn rule-3? [s]
  (boolean (or 
            (some #(re-matches #"[bcdfghjklmnpqrstvwxyz]" (str %)) (first-2 s))
            (some #(re-matches #"[qu]" (str %)) (first (last s)))
            )))

(rule-3? "square")

(defn rule-4? [s]
  (boolean (or
            (some #(re-matches #"[bcdfghjklmnpqrstvwxyz]" (str %)) (first-2 s))
            (some #(re-matches #"[y]" (str %)) (first (last s))))))

(rule-4? "rhythm")

(defn translate [s] ;; <- arglist goes here
      ;; your code goes here
  (cond
    (rule-1? s) "ay"
    (rule-2? s) "nay")
    :else "nope")

(translate "ask")

(def s "xray")
(str/join "" (first-2 s))
