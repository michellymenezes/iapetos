(defproject iapetos "0.1.8-SNAPSHOT"
  :description "A Clojure Prometheus Client"
  :url "https://github.com/xsc/iapetos"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"
            :year 2016
            :key "mit"}
  :dependencies [[org.clojure/clojure "1.8.0" :scope "provided"]
                 [io.prometheus/simpleclient "0.1.0"]
                 [io.prometheus/simpleclient_common "0.1.0"]
                 [io.prometheus/simpleclient_pushgateway "0.1.0"]
                 [io.prometheus/simpleclient_hotspot "0.1.0" :scope "provided"]]
  :profiles {:dev
             {:dependencies [[org.clojure/test.check "0.9.0"]
                             [aleph "0.4.3"]]
              :global-vars {*warn-on-reflection* true}}
             :codox
             {:plugins [[lein-codox "0.10.0"]]
              :dependencies [[codox-theme-rdash "0.1.2"]]
              :codox {:project {:name "iapetos"}
                      :metadata {:doc/format :markdown}
                      :themes [:rdash]
                      :source-uri "https://github.com/xsc/iapetos/blob/v{version}/{filepath}#L{line}"
                      :namespaces [iapetos.core
                                   iapetos.export
                                   iapetos.standalone
                                   #"^iapetos\.collector\..+"]}}}
  :aliases {"codox" ["with-profile" "+codox" "codox"]}
  :pedantic? :abort)
