(ns reframe-auth0.events
    (:require [re-frame.core :as re-frame]
              [reframe-auth0.db :as db]))

(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))
