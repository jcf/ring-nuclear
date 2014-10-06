(ns ring.middleware.nuclear-test
  (:require [clojure.test :refer :all]
            [ring.middleware.nuclear :refer :all]
            [ring.mock.request :refer [request header]]))

(def ^:private default-response
  {:status 200 :headers {} :body "Body"})

(def ^:private handler
  (wrap-nuclear (constantly default-response)))

(deftest ^:unit test-get-nuclear
  (testing "when nuclear is enabled"
    (let [get-fn #(handler (request :get %))]
      (is (thrown? clojure.lang.ExceptionInfo (get-fn "/nuclear")))
      (is (= (get-fn "/") default-response)))))
