(ns ninety-nine-problems.core-test
  (:require [clojure.test :refer :all]
            [ninety-nine-problems.core :refer :all]))

(deftest last-element-from-a-list-test
  (is (= 4 (last-element-from-a-list [1 2 3 4])))
  (is (= 1 (last-element-from-a-list [1])))
  (is (= [] (last-element-from-a-list []))))
