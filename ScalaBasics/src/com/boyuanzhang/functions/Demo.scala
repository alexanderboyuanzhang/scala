package com.boyuanzhang.functions

class Demo {

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b

    return sum
  }
}

object Demo {
  def main(args: Array[String]) {
    val demo = new Demo
    println("Returned Value : " + demo.addInt(5, 7));
  }

}