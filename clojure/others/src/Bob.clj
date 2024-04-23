(ns bob
  (:require [clojure.string :as str]))

(defn yell? [s]
  (= s (re-matches #"[A-Z\s,!,0-9]+" s)))

(defn response-for [s] ;; <- arglist goes here
    ;; your code goes here
  (let [word (str/split s #"")]
    (cond
      (and (yell? s) (= "?" (last word))) "Calm down, I know what I'm doing!"
      (= "?" (last word)) "Sure."
      (and (yell? s)) "Whoa, chill out!"
      (empty? word) "Fine. Be that way!"
      :else "Whatever.")))
(yell? "ZOMG THE %^*@#$(*^ ZOMBIES ARE COMING!!11!!1!")
(yell? "WHAT THE HELL WERE YOU THINKING?")
(response-for "WHAT THE HELL WERE YOU THINKING?")
(response-for "WATCH OUT!")
(response-for "1, 2, 3 GO!")
(response-for "1, 2, 3")
(response-for "ZOMG THE %^*@#$(*^ ZOMBIES ARE COMING!!11!!1!")
(every-pred)