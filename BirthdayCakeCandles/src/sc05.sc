var ar = Array(44,53,31,27,77,60,66,77,26,36)

val ars = ar.sortWith(_>_)
val maxs = ars.takeWhile(i => i == ars.head)
maxs.length