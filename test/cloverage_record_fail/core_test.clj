(ns cloverage-record-fail.core-test
  (:require [clojure.test :refer :all]
            [cloverage-record-fail.core :refer :all])
  (:import [cloverage_record_fail.core Foo])
  )

(deftest test-embedded-record
  (is (instance? Foo foo)))
