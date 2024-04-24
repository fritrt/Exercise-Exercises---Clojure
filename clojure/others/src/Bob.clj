(ns bob
  (:require [clojure.string :as str]))

(def yell? #(re-matches #"(?=.*[A-Z])[^a-z]+" %))
(def question? #(str/ends-with? % "?"))
(def yell-a-question? #(and (yell? %) (question? %)))
(def no-response? str/blank?)


(defn response-for [s] ;; <- arglist goes here
    ;; your code goes here
  (cond
    (yell-a-question? s) "Calm down, I know what I'm doing!"
    (question? (str/trim s)) "Sure."
    (yell? s) "Whoa, chill out!"
    (no-response? s) "Fine. Be that way!"
    :else "Whatever."))


(str/trim "Okay if like my  spacebar  quite a bit?   ")
(response-for "WHAT THE HELL WERE YOU THINKING?")
(response-for "WATCH OUT!")
(response-for "1, 2, 3 GO!")
(response-for "1, 2, 3")
(response-for "ZOMG THE %^*@#$(*^ ZOMBIES ARE COMING!!11!!1!")
(response-for "Okay if like my  spacebar  quite a bit?   ")