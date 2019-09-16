object Main extends App {
  val in: List[String] = Iterator
    .continually(io.StdIn.readLine)
    .takeWhile(Option(_).fold(false)(_.nonEmpty))
    .toList
  printf("%d\n", in(0).toInt + in(1).toInt)
}
