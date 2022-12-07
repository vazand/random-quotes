package io.github.vazand.quotes

/** <h5>Quotes collection</h5>
  *
  * use quote_boxed for boxed string output or quote to get quote as string
  */
class QuotesCollection {

  val luffy_quote_1 = "If I give up now, I'm going to regret it"
  val luffy_quote_2 = "If you don’t take risks, you can’t create a future."
  val naruto_1 = "If you don’t like your destiny, don’t accept it."
  val naruto_2 = "When you give up, that’s when the game ends"
  val naruto_3 =
    "Hard work is worthless for those that don’t believe in themselves"
  val rock_lee = "A dropout will beat a genius through hard work."
  val natsu_fairy_tail =
    "The moment you think of giving up, think of the reason why you held on so long"
  val quote_1 =
    "Every journey begins with a single step. We just have to have patience."
  val mighty_guy =
    "It’s not always possible to do what we want to do, but it’s important to believe in something before you actually do it"

  val gilgamesh_fate_zero =
    "Do exactly as you like. That is the true meaning of pleasure. Pleasure leads to joy and joy leads to happiness."

  val list_of_quotes: List[String] =
    List(
      luffy_quote_1,
      luffy_quote_2,
      naruto_1,
      naruto_2,
      naruto_3,
      quote_1,
      rock_lee,
      natsu_fairy_tail,
      mighty_guy,
      gilgamesh_fate_zero
    )

  /** This method will return a random String from a list
    *
    * @param list
    *   is list of Strings
    * @return
    *   String
    */

  def randomQuote(list: List[String]): String = {
    val rand = new scala.util.Random
    val random_str = rand.nextInt(list.length)
    return list(random_str)
  }

  val quote = randomQuote(list_of_quotes)

  /** This Function returns Boxed String
    *
    * example
    * {{{
    * val str = "Hello"
    * returns like this
    *   +-------+
    *   | Hello |
    *   +-------+
    * }}}
    *
    * @param str
    * @return
    *   boxed String
    */
  def boxed_quote(str: String): String = {
    val str_len = str.length() + 2
    val char: Char = '-'
    val box_up_down = "+" + (char.toString() * str_len).concat("+")
    val box_center = "| " + str + " |"
    return "\n" + box_up_down + "\n" + box_center + "\n" + box_up_down + "\n"

  }

  val quote_boxed = (boxed_quote(quote))

}
