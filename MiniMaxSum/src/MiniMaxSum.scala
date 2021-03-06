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

  // Complete the miniMaxSum function below.
  def miniMaxSum(arr: Array[Int]) {
    val sums = arr.map(x => x.toLong)
      .combinations(arr.length-1)
      .map(_.sum).toList
    print(sums.min)
    print(" ")
    println(sums.max)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    miniMaxSum(arr)
  }
}