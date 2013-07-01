package com.github.scala.common

import scala.collection.immutable.Queue
import scala.language.implicitConversions

class FiniteQueue[A](q: Queue[A]) {
  def enqueueFinite[B >: A](elem: B, maxSize: Int): Queue[B] = {
    var ret = q.enqueue(elem)
    while (ret.size > maxSize)
      ret = ret.dequeue._2

    ret
  }
}

object FiniteQueue {
  implicit def queue2finitequeue[A](q: Queue[A]) = new FiniteQueue[A](q)
}