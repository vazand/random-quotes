package io.github.vazand.quotes
object RandomQuotes extends App with QuotesCollection{
  println("   Hi   ")

  val rand = new  scala.util.Random

  def randomQuote(list:List[String]):String ={
    val random_str = rand.nextInt(list.length)
    return list(random_str)
  }
  
  def sayHello(str:String):String = {
    return "Hello "+str
  }
  
  //println(randomQuote(list_of_quotes))
  
}
