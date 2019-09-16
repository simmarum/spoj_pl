object Main extends App {

  def last_digit_of_power(a: Int, b: Int): Int = {
    var last_dig_a = a % 10;

    if (last_dig_a == 0) return 0;
    if (last_dig_a == 1) return 1;
    if (last_dig_a == 2) {
      var mod_b = b % 4
      mod_b match {
        case 0 => return 6;
        case 1 => return 2;
        case 2 => return 4;
        case 3 => return 8;
      }
    }
    if (last_dig_a == 3) {
      var mod_b = b % 4
      mod_b match {
        case 0 => return 1;
        case 1 => return 3;
        case 2 => return 9;
        case 3 => return 7;
      }
    }
    if (last_dig_a == 4) {
      var mod_b = b % 2
      mod_b match {
        case 0 => return 6;
        case 1 => return 4;
      }
    }
    if (last_dig_a == 5) return 5;
    if (last_dig_a == 6) return 6;
    if (last_dig_a == 7) {
      var mod_b = b % 4
      mod_b match {
        case 0 => return 1;
        case 1 => return 7;
        case 2 => return 9;
        case 3 => return 3;
      }
    }
    if (last_dig_a == 8) {
      var mod_b = b % 4
      mod_b match {
        case 0 => return 6;
        case 1 => return 8;
        case 2 => return 4;
        case 3 => return 2;
      }
    }
    if (last_dig_a == 9) {
      var mod_b = b % 2
      mod_b match {
        case 0 => return 1;
        case 1 => return 9;
      }
    }
    return -1;
  }

  val num_test: Int = scala.io.StdIn.readLine().toInt;

  // main loop
  for (i <- 1 to num_test) {
    val x: Array[String] = scala.io.StdIn.readLine().split(" ");
    val a: Int = x(0).toInt
    val b: Int = x(1).toInt
    println(last_digit_of_power(a, b))
  }
}
