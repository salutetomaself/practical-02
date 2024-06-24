package practical2

object salary {
  def main(args: Array[String]): Unit = {
    val normalHours = 40
    val otHours = 30
    val ths = TakeHomeSalary(normalHours, otHours)
    println(s"Take-home salary is: Rs. $ths")
  }

  def TakeHomeSalary(normalHours: Int, otHours: Int): Double = {
    val normalRate = 250
    val otRate = 85
    val taxRate = 0.12

    val grossSalary = (normalHours * normalRate) + (otHours * otRate)
    val tax = grossSalary * taxRate
    val takeHomeSalary = grossSalary - tax

    takeHomeSalary
  }
}
