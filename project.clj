(defproject org.iplantc/iplant-de "1.4.2-SNAPSHOT"
  :description  "Project for generating discovery environment RPMs."
  :dependencies  [[org.iplantc.de/de-web "1.4.2-SNAPSHOT" :extension "war"]
                  [org.mortbay.jetty/jetty-runner "8.1.7.v20120910"]]
  :plugins      [[org.iplantc/lein-iplant-rpm "1.4.0-SNAPSHOT"]]
  :iplant-rpm   {:summary      "iPlant Discovery Environment"
                 :provides     "iplant-de"
                 :dependencies ["iplant-service-config >= 0.1.0-5"]
                 :config-files ["log4j.properties"]
                 :config-path  "conf"
                 :type         :jetty
                 :zk-service   "discoveryenvironment"}
  :repositories {"iplantCollaborative"
                 "http://projects.iplantcollaborative.org/archiva/repository/internal/"})
