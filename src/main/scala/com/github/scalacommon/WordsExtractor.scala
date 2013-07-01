package com.github.scalacommon

object WordsExtractor {
   def extractWords(str: String): List[String] = str.split( """[\s,\?\.!:";_=/\(\)]+""").map(_.trim).filterNot(_.isEmpty).toList
 }
