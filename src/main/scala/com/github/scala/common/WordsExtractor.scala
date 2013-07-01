package com.github.scala.common

object WordsExtractor {
   def extractWords(str: String): List[String] = str.split( """[\s,\?\.!:";_=/\(\)]+""").map(_.trim).filterNot(_.isEmpty).toList
 }
