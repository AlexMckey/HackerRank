val a = Array(17,28,30)
val b = Array(99,16,8)
val (ascore, bscore) = a.zip(b).map(p => p._1 - p._2).map(_.signum).partition(_>0)
Array(ascore.sum, bscore.map(_.abs).sum)