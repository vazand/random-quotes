package io.github.vazand.quotes
object RandomQuotes extends App {
  val quote_collection = new QuotesCollection()
  val random_quote = quote_collection.quote_boxed
  println(random_quote)

}
