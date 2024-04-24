(ns nth-prime)



(defn nth-prime 
    "Returns the prime number in the nth position."
  [n] ;; <- arglist goes here
  ;; your code goes here
  (let [limit (* n n)  ; Start with an estimate of the upper limit
        primes (loop [nums (set (range 2 limit))
                      primes []]
                 (if (empty? nums)
                   primes
                   (let [p (first nums)]
                     (recur (clojure.set/difference nums (set (range (* p p) limit p)))
                            (conj primes p)))))]
    (nth primes (dec n))))

(nth-prime 1)