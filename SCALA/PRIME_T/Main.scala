object Main extends App {

  def is_prime(n: Int): Boolean = {
    if (n <= 1) return false;
    if (n <= 3) return true;
    if ((n % 2 == 0) || (n % 3 == 0)) return false;
    else {
      var i = 5;

      while (i * i <= n) {
        if ((n % i == 0) || (n % (i + 2) == 0)) return false
        i += 6
      }
      return true
    }
  }

  val num_test: Int = scala.io.StdIn.readLine().toInt;

  // main loop
  for (i <- 1 to num_test) {
    val act_num: Int = scala.io.StdIn.readLine().toInt;
    if (is_prime(act_num)) println("TAK")
    else println("NIE")
  }
}
