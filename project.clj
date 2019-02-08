(defproject test-system-properties "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/tools.logging  "0.4.1"]
                 [org.slf4j/jcl-over-slf4j   "1.7.25"]
                 [ch.qos.logback/logback-classic "1.2.3"]
                 [org.slf4j/slf4j-api "1.7.25"]
                 [org.slf4j/jul-to-slf4j "1.7.25"]
                 [org.slf4j/log4j-over-slf4j "1.7.25"]]
  :main ^:skip-aot test-system-properties.core
  :target-path "target/%s"
  :jvm-opts ["-Droot-level-logging=DEBUG"]
  :profiles {:uberjar {:aot :all}})
