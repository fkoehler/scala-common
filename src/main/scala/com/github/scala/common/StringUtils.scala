package com.github.scala.common

import scala.language.implicitConversions

object StringUtils {
  def stripTags(str: String): String = str.replaceAll("\\<[^>]*>", "")

  def abbreviate(str: String, maxLength: Int): String = if (str.length > maxLength) str.substring(0, maxLength - 1) else str
}

class StringEnricher(underlying: String) {
  def stripTags = StringUtils.stripTags(underlying)

  def abbr(max: Int) = StringUtils.abbreviate(underlying, max)
}

object StringEnricher {
  implicit def toStringEnricher(str: String) = new StringEnricher(str)
}