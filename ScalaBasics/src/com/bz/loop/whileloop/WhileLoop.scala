package com.bz.loop.whileloop

class WhileLoop {
  def whileLoop {
    // Local variable declaration:
    var a = 10;

    // while loop execution
    while (a < 20) {
      println("Value of a: " + a); 
      a = a + 1;
    }
  }
}

object WhileLoop {
  def main(args: Array[String]) {
    val whileLoop = new WhileLoop
    whileLoop.whileLoop
  }
}