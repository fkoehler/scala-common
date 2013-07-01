package com.github.scalacommon

import StringEnricher._
import org.specs2.mutable.Specification

class StringUtilsSpec extends Specification {

  "StringUtils" should {
    "should strip tags" in {
      StringUtils.stripTags( """bla bla <a href="http://bla.de">bla it</a>""") must equalTo("bla bla bla it")
    }
    "should strip tags with enriched string" in {
      """bla bla <a href="http://bla.de">bla it</a>""".stripTags.toString must equalTo("bla bla bla it")
    }
  }
}