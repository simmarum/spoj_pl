object Main extends App {

  def nwd(ac: Int, bc: Int): Int = {
    var a = ac;
    var b = bc
    while (b != 0) {
      a %= b;
      if (a == 0) return b;
      b %= a;
    }
    return a;
  }

  val num_test: Int = scala.io.StdIn.readLine().toInt;

  // main loop
  for (i <- 1 to num_test) {
    val arr_num_str: Array[String] = scala.io.StdIn.readLine().split(" ");
    val arr_num = arr_num_str.map(_.toInt)
    println(nwd(arr_num(0), arr_num(1)))
  }
}
