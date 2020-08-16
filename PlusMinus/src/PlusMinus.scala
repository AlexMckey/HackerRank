import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

  // Complete the plusMinus function below.
  def plusMinus(arr: Array[Int]) {
    val (dwn0, upeq0) = arr.partition(_<0)
    val (up0, zero) = upeq0.partition(_>0)

    println("%.6f".format(1.0*dwn0.length/arr.length))
    println("%.6f".format(1.0*up0.length/arr.length))
    println("%.6f".format(1.0*zero.length/arr.length))
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    plusMinus(arr)
  }
}
