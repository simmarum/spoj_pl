object Main extends App {

  def last_two_digit_of_factorion(n: Int): Tuple2[Int, Int] =
    n match {
      case 0 => (0, 1)
      case 1 => (0, 1)
      case 2 => (0, 2)
      case 3 => (0, 6)
      case 4 => (2, 4)
      case 5 => (2, 0)
      case 6 => (2, 0)
      case 7 => (4, 0)
      case 8 => (2, 0)
      case 9 => (8, 0)
      case _ => (0, 0)
    }

  val num_test: Int = scala.io.StdIn.readLine().toInt;

  // main loop
  for (i <- 1 to num_test) {
    val act_num: Int = scala.io.StdIn.readLine().toInt;
    val (x, y) = last_two_digit_of_factorion(act_num)
    println(x + " " + y)
  }
}
