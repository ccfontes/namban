(defproject namban "0.1.0-alpha"
  :description "Convert text between different japanese scripts."
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:dev {:dependencies [[midje "1.6-beta1"]]
                   :plugins [[codox "0.6.6"] [lein-midje "3.1.2"]]
                   :codox {:sources ["src"]
                           :output-dir "doc/api"}}}
  :jvm-opts ["-Dfile.encoding=utf-8"]
  :source-paths ["src"])