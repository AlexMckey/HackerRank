val s1 = "07:59:01PM"

var Array(hh,mm,ss12) = s1.split(":")
var (ss,p) = ss12.splitAt(2)

hh =
(hh,mm,p) match {
  case ("12","00","AM") => "00"
  case ("12","00","PM") => "12"
  case (xhh,_,"PM") => (xhh.toInt + 12).toString
  case _ => hh
}

val all = hh+":"+mm+":"+ss