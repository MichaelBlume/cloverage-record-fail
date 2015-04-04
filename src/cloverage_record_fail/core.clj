(ns cloverage-record-fail.core)

(defrecord Foo [])

(defmacro make-foo [] (Foo.))

(def foo (make-foo))
