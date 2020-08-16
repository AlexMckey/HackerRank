import scala.io.StdIn._

object main extends App{

  def sockMerchant(n: Int, ar: Array[Int]): Int = {
    ar.groupBy(identity).map(g => g._2.length / 2).sum
  }

  val n = readInt

  val ar = readLine.split(" ").map(_.toInt)
  val result = sockMerchant(n, ar)

  println(result)
}