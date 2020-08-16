val n = 4

println(Range(n,0,-1).map(i => s"%${n}s".format("#"*i)).reverse.mkString("\n"))
