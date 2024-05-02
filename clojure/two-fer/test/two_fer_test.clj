(ns two-fer-test
  (:require [clojure.test :refer [deftest is are
                                  testing]]
            two-fer))

(deftest two-fer-test
  (testing 
   (is (= (two-fer/two-fer) "One for you, one for me."))))





