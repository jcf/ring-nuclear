(ns ring.middleware.nuclear
  "This middleware causes any request to /nuclear to result in an uncaught
  exception.")

(def ^:private warheads
  ["Brighton, we have a problem."
   "http://j.mp/1iHpKa3"
   "http://j.mp/1o6Ns4C"
   "http://j.mp/1pSQL4a"])

(defn- nuclear? [req]
  (= (:uri req) "/nuclear"))

(defn wrap-nuclear
  "Adds a decision point to the middleware stack where by any request to
  /nuclear throws and exception. "
  [handler]
  (fn nuclear-handler [req]
    (if (nuclear? req)
      (throw (ex-info (str "We just went nuclear! " (rand-nth warheads)) {}))
      (handler req))))
