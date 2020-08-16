val arr = Array(-4,3,-9,-1,4,1)

val cmp = arr
  .groupBy(_.compare(0))
  .map(g => g._1 ->g._2.length)
  .toSeq
  .sortBy(_._1)
  .map(g => (g._2*1.0/arr.length).formatted("%.6f"))

val (dwn0, upeq0) = arr.partition(_<0)
val (up0, zero) = upeq0.partition(_>0)

println("%.6f".format(1.0*dwn0.length/arr.length))
println("%.6f".format(1.0*up0.length/arr.length))
println("%.6f".format(1.0*zero.length/arr.length))