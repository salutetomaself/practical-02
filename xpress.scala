package practical2

object xpress {
  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    var g = 0.0f

    b -= 1
    println(b * a + c * d)
    d -= 1

    println(a)
    a += 1 // a=3

    println(-2 * (g - k) + c)

    println(c)
    c += 1 //c=5

    c += 1 // c=6
    println(c * a)
    a += 1 // a=4
  }
}



