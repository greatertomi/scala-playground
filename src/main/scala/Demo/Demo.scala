package Demo

import Element.ArrayElement

object Demo {
  def main(args: Array[String]): Unit = {
    val arrayElem = new ArrayElement(Array("hello", "world"))
    val newArr = Array(1, 2, 4) ++ Array(5, 8, 9)
//    println(arrayElem.width)
    println(newArr.mkString("Array(", ", ", ")"))
  }
}

