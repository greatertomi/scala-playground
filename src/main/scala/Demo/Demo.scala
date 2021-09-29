package Demo

import Rational.Rational

object Demo {
  def main(args: Array[String]): Unit = {
    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    val twoFifth = new Rational(2, 5)
    println(oneHalf + 6)
    println((oneHalf * twoThirds) + twoFifth)
  }
}

