package Rational

import scala.annotation.tailrec

class Rational(n: Int, d: Int) extends Ordered[Rational]{
//  require(d !== 0, "Rational number cannot have 0 as denominator")
  private val g = gcd(n.abs, d.abs)

  val numerator: Int = n / g
  val denominator: Int = d / g

  def this(n: Int) = this(n, 1) // auxiliary constructor

  override def toString: String = numerator + "/" + denominator

  def +(that: Rational): Rational =
    new Rational(
      numerator * that.denominator + that.numerator + denominator,
      denominator * that.denominator
    )

  def +(i: Int): Rational =
    new Rational(numerator + i * denominator, denominator)

  def -(that: Rational): Rational =
    new Rational(
      numerator * that.denominator - that.numerator * denominator,
      denominator * that.denominator
    )

  def -(i: Int): Rational =
    new Rational(numerator - i * denominator, denominator)

  def *(that: Rational): Rational =
    new Rational(numerator * that.numerator, denominator * that.denominator)

  def *(i: Int): Rational =
    new Rational(numerator * i, denominator)

  def /(that: Rational): Rational =
    new Rational(numerator * that.denominator, denominator * that.numerator)

  def /(i: Int): Rational =
    new Rational(numerator, denominator * i)

  def lessThan(that: Rational): Boolean =
    this.numerator * that.denominator < that.numerator * this.denominator

  def max(that: Rational): Rational = if (this.lessThan(that)) that else this

  @tailrec
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a%b)

  override def compare(that: Rational): Int =
    (this.numerator * that.denominator) - (that.numerator * this.denominator)
}
