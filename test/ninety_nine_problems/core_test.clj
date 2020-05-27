(ns ninety-nine-problems.core-test
  (:require [clojure.test :refer :all]
            [ninety-nine-problems.core :refer :all]))

(deftest last-element-from-a-list-test
  (is (= 4 (get-last-element [1 2 3 4])))
  (is (= 1 (get-last-element [1])))
  (is (= [] (get-last-element []))))

(deftest last-element-from-a-list-test
  (is (= [3 4] (get-last-two-elements [1 2 3 4])))
  (is (= [] (get-last-two-elements [1])))
  (is (= [] (get-last-two-elements []))))
