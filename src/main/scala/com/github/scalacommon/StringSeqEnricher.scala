package com.github.scalacommon

import scala.collection.mutable.ListBuffer
import scala.collection.mutable

class StringSeqEnricher(underlying: Seq[String]) {

  def distinctLowercase: Seq[String] = {
    val b = new ListBuffer[String]
    val seen = mutable.HashSet[String]()
    for (x <- underlying) {
      if (!seen(x.toLowerCase)) {
        b += x
        seen += x.toLowerCase
      }
    }
    b.result
  }

}

object StringSeqEnricher {
  implicit def toStringSeqEnricher(str: Seq[String]) = new StringSeqEnricher(str)
}
