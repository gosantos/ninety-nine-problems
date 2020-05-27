(ns ninety-nine-problems.core-test
  (:require [clojure.test :refer :all]
            [ninety-nine-problems.core :refer :all]))

(defn last-element-from-a-list [list]
  (if (= 1 (count list))
    (nth list 0)
    (last-element-from-a-list (rest list))
    ))

(deftest last-element-from-a-list-test
  (is (= 4 (last-element-from-a-list [1 2 3 4])))
  (is (= 1 (last-element-from-a-list [1]))))
