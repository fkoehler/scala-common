package com.github.scalacommon

import java.io._
import scala.io._
import scala.language.implicitConversions
import scala.Predef.String

class RichFile(file: File) {

  def text = Source.fromFile(file)(Codec.UTF8).mkString

  def text_=(s: String) {
    val out = new PrintWriter(file, "UTF-8")
    try {
      out.print(s)
    } finally {
      out.close
    }
  }

  def lines = Source.fromFile(file)(Codec.UTF8)

  def lines_=(lines: Seq[String]) {
    val out = new PrintWriter(file, "UTF-8")
    try {
      lines.foreach(out.println)
    } finally {
      out.close
    }
  }
}

object RichFile {
  implicit def enrichFile(file: File) = new RichFile(file)
}