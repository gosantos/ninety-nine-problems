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

(deftest find-element-test
  (is (= 2 (find-k-element [1 2 3 4] 2)))
  (is (= 4 (find-k-element [1 2 3 4] 4)))
  (is (= 1 (find-k-element [1 2 3 4] 1)))
  (is (= nil (find-k-element [1] 2)))
  (is (= nil (find-k-element [] 2))))

(deftest list-size-test
  (is (= 4 (list-size [1 2 3 4])))
  (is (= 1 (list-size [1])))
  (is (= 0 (list-size []))))
