object Main extends App {

  def sumNumbers(arr_num: Array[Int]): Int = {
    var sum = 0
    var i = 0
    val len = arr_num.length
    while (i < len) {
      sum += arr_num(i);
      i += 1;
    }
    return sum
  }

  val num_test: Int = scala.io.StdIn.readLine().toInt;

  // main loop
  for (i <- 1 to num_test) {
    val no_matter: String = scala.io.StdIn.readLine();
    val arr_num_str: Array[String] = scala.io.StdIn.readLine().split(" ");
    val arr_num = arr_num_str.map(_.toInt)
    println(sumNumbers(arr_num))
  }
}
