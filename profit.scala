package practical2

object profit {
  def main(args: Array[String]): Unit = {
    var maxProfit = profit(5)
    var bestPrice = 0

    for (price <- 5 to 45 by 5) {
      val currentProfit = profit(price)
      if (currentProfit > maxProfit) {
        maxProfit = currentProfit
        bestPrice = price
      }
    }

    println(s"The best ticket price is: Rs. $bestPrice with a maximum profit of: Rs. $maxProfit")
  }

  def attendees(price: Int): Int = 120 + (15 - price) / 5 * 20

  def revenue(price: Int): Int = attendees(price) * price

  def cost(price: Int): Int = 500 + attendees(price) * 3

  def profit(price: Int): Int = revenue(price) - cost(price)
}
