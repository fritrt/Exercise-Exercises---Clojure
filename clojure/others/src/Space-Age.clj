(ns space-age)

(def earth-years (/ 1 31557600))

(defn on-mercury [num] ;; <- arglist goes here
  ;; your code goes here
  (* num (* earth-years (/ 1 0.2408467))))

(defn on-venus [num] ;; <- arglist goes here
  ;; your code goes here
  (* num (* earth-years (/ 1 0.61519726))))

(defn on-earth [num] ;; <- arglist goes here
      ;; your code goes here
  (* num earth-years))

(defn on-mars [num] ;; <- arglist goes here
  ;; your code goes here
  (* num (* earth-years (/ 1 1.8808158))))

(defn on-jupiter [num] ;; <- arglist goes here
  ;; your code goes here
  (* num (* earth-years (/ 1 11.862615))))

(defn on-saturn [num] ;; <- arglist goes here
  ;; your code goes here
  (* num (* earth-years (/ 1 29.447498))))

(defn on-uranus [num] ;; <- arglist goes here
  ;; your code goes here
  (* num (* earth-years (/ 1 84.016846))))

(defn on-neptune [num] ;; <- arglist goes here
  ;; your code goes here
  (* num (* earth-years (/ 1 164.79132))))
