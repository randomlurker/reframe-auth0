(ns reframe-auth0.core
    (:require [reagent.core :as reagent]
              [re-frame.core :as re-frame]
              [reframe-auth0.events]
              [reframe-auth0.subs]
              [reframe-auth0.auth0]
              [reframe-auth0.views :as views]
              [reframe-auth0.config :as config]))


(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (re-frame/dispatch-sync [:initialize-db])
  (dev-setup)
  (mount-root))
