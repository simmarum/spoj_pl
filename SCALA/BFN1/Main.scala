object Main extends App {

  def isPalindrom(s: String): Boolean = {
    val half_len = (s.length() / 2).toInt;
    val last_idx = s.length() - 1;
    for (i <- 0 until half_len) {
      if (s(i) != s(last_idx - i)) return false
    }
    return true
  }

  def checkSpecialSumming(a: Int, epoch: Int): Tuple2[Int, Int] = {
    if (isPalindrom(a.toString())) {
      return (a, epoch)
    } else {
      return checkSpecialSumming(a + a.toString().reverse.toInt, epoch + 1);
    }
  }

  val num_test: Int = scala.io.StdIn.readLine().toInt;

  // main loop
  for (i <- 1 to num_test) {
    val number: Int = scala.io.StdIn.readLine().toInt;
    val res = checkSpecialSumming(number, 0)
    println(res._1 + " " + res._2)
  }
}
