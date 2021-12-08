(ns basic-http-server.dev-middleware
  (:require
    [ring.middleware.reload :refer [wrap-reload]]
    [prone.middleware :refer [wrap-exceptions]]))

(defn wrap-dev [handler]
  (-> handler
      wrap-reload
      (wrap-exceptions {:app-namespaces ['basic-http-server]})))
