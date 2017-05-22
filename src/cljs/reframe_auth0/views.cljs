(ns reframe-auth0.views
  (:require [re-frame.core :as re-frame]
            [reframe-auth0.auth0 :as auth0]))

(defn button [text on-click]
  [:button
   {:type     "button"
    :on-click on-click}
   text])

(def login-button
  (button "Log in" #(.show auth0/lock)))

(def logout-button
  (button "Log out" #(re-frame/dispatch [::auth0/logout])))

(defn main-panel []
  (let [name (re-frame/subscribe [:name])
        user-name (re-frame/subscribe [::auth0/user-name])]
    (fn []
      (if @user-name
        [:div
         [:div "Hello " @user-name " from " @name]
         logout-button]
        [:div
         [:div "Hello from " @name]
         login-button]))))
