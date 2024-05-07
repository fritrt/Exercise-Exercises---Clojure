(ns gigasecond
  (:import [java.time LocalDateTime]))


(defn from [year month day]  ;; <- arglist goes here
    ;; your code goes here
  (let [dt (java.time.LocalDateTime/of year month day 0 0 0)
        dt (.plusSeconds dt 1000000000)]
    [(.getYear dt)
     (.getMonthValue dt)
     (.getDayOfMonth dt)]))

(from 2011 4 25)




