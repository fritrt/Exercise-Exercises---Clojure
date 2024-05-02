(ns secret-handshake
  (:require [clojure.string :as str]))

(def actions
  {00001 "wink", 
   00010 "double blink", 
   00100 "close your eyes", 
   01000 "jump", 
   10000 ""})

(actions 00010)
(defn commands [num] ;; <- arglist goes here
      ;; your code goes here
  (reverse (str/split (Long/toBinaryString num) #"")))

(get (vec (commands 10)) 0)
(commands 10)
