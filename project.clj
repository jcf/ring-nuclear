(defproject listora/ring-nuclear "0.2.0-SNAPSHOT"
  :description "Ring middleware that constantly throws"
  :url "https://github.com/listora/ring-nuclear"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-core "1.3.0-RC1"]]
  :deploy-repositories [["releases" :clojars]]
  :plugins [[codox "0.8.5"]]
  :codox {:project {:name "Ring-Nuclear"}}
  :profiles {:dev {:dependencies [[ring-mock "0.1.5"]]}})
