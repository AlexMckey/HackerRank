import java.io.PrintWriter

object TimeConversion {

  def timeConversion(s: String): String = {
    var Array(hh,mm,ss12) = s.split(":")
    var (ss,p) = ss12.splitAt(2)

    hh =
      (hh,mm,p) match {
        case ("12",_,"AM") => "00"
        case ("12",_,"PM") => "12"
        case (xhh,_,"PM") => (xhh.toInt + 12).toString
        case _ => hh
      }

    hh+":"+mm+":"+ss
  }

  def main(args: Array[String]) {
    val scan = scala.io.StdIn

    val s = scan.readLine

    val result = timeConversion(s)

    println(result)

  }
}