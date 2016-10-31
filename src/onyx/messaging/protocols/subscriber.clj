(ns onyx.messaging.protocols.subscriber
  (:refer-clojure :exclude [key]))

(defprotocol Subscriber
  (sub-info [this])
  (equiv-meta [this sub-info])
  (key [this])
  (start [this])
  (stop [this])
  (poll-messages! [this])
  (poll-replica! [this])
  (set-replica-version! [this new-replica-version])
  (set-epoch! [this new-epoch])
  (get-recover [this])
  (completed? [this])
  (unblock! [this])
  (blocked? [this])
  (heartbeat! [this])
  (poll-heartbeats! [this]))
