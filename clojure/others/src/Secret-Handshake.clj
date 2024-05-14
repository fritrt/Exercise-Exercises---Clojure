(ns secret-handshake)

(def numbers->commands
  {0 "wink", 
   1 "double blink", 
   2 "close your eyes", 
   3 "jump"})


(defn commands [num] ;; <- arglist goes here
      ;; your code goes here
  (let [commands (->> (range 4)
                      (filter #(bit-test num %))
                      (map numbers->commands))]
    (if (bit-test num 4)
      (reverse commands)
      commands)))


(commands 32)

(range 4)

