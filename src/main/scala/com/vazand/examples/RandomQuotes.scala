package com.vazand.examples
object RandomQuotes extends App with QuotesCollection{
  println("Today's Quote")

  val rand = new  scala.util.Random

  def randomQuote(list:List[String]):String ={
    val random_str = rand.nextInt(list.length)
    return list(random_str)
  }
  println(randomQuote(list_of_quotes))
  
}
