package com.bz.loop.dowhile

class Demo {
  def demo() {
    // Local variable declaration:
    var a = 10;

    // do loop execution
    do {
      println("Value of a: " + a);
      a = a + 1;
    } while (a < 20)

  }
}

object Demo {
  def main(args: Array[String]) {

    val demo = new Demo()
    demo.demo
  }
}