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

(deftest reverse-list-test
  (is (= [4 3 2 1] (reverse-list [1 2 3 4])))
  (is (= [1] (reverse-list [1])))
  (is (= [] (reverse-list []))))

(deftest palindrome-test
  (is (= true (palindrome [2 3 3 2])))
  (is (= true (palindrome [1])))
  (is (= true (palindrome [])))
  (is (= false (palindrome [2 3]))))

(deftest flat-list-test
  (is (= [2 3 3 4 5 5 5 5 6 7 2] (my-flatten [2 [3 [3 [[[[4 [5 [5 [5 [[5 6 7]]]]]]]]]]] 2])))
  (is (= [2 3 3 2] (my-flatten [2 [3 [3]] 2])))
  (is (= [1] (my-flatten [1])))
  (is (= [] (my-flatten [])))
  (is (= [2 3] (my-flatten [2 3]))))
