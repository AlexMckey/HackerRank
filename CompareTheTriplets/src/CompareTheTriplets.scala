import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.collection.parallel.immutable._
import scala.collection.parallel.mutable._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Solution {

  // Complete the compareTriplets function below.
  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
    val (ascore, bscore) = a.zip(b).map(p => p._1 - p._2).map(_.signum).partition(_>0)
    Array(ascore.sum, bscore.map(_.abs).sum)
  }

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val b = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val result = compareTriplets(a, b)

    printWriter.println(result.mkString(" "))

    printWriter.close()
  }
}