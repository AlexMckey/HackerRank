val arr = Array(1,2,3,4,5)

val sums = arr.map(x => x:Long)
  .combinations(arr.length-1)
  .map(_.sum).toList
val max = sums.max
val min = sums.min

s"$min $max"