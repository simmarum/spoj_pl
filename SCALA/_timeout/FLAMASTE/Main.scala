object Main extends App {

  def shortString(s: String): String = {
    var new_s = new StringBuilder
    var last_c = s(0);
    var num_last_c = 0;
    for (c <- s) {
      if (last_c != c) {
        new_s += last_c
        if (num_last_c > 2) new_s.append(num_last_c)
        else if (num_last_c == 2) new_s += last_c
        num_last_c = 1;
        last_c = c;
      } else {
        num_last_c += 1;
      }
    }
    new_s += last_c
    if (num_last_c > 2) new_s.append(num_last_c)
    else if (num_last_c == 2) new_s += last_c
    return new_s.toString()
  }

  val num_test: Int = scala.io.StdIn.readLine().toInt;

  // main loop
  for (i <- 1 to num_test) {
    val act_str: String = scala.io.StdIn.readLine();
    println(shortString(act_str))
  }
}
