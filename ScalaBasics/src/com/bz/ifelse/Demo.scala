package com.bz.ifelse

class Demo {

  def ifStmt {
    var x = 10
    if (x < 20) {
      println("This is if statement")
    }
  }

  def ifElseStmt {
    var x = 30;
    if (x < 20) {
      println("This is if statement");
    } else {
      println("This is else statement");
    }
  }

  def ifElseElseStmt {
    var x = 30;
    if (x == 10) {
      println("Value of X is 10");
    } else if (x == 20) {
      println("Value of X is 20");
    } else if (x == 30) {
      println("Value of X is 30");
    } else {
      println("This is else statement");
    }
  }
  def nestedIfElseStmt {
    var x = 30;
    var y = 10;

    if (x == 30) {
      if (y == 10) {
        println("X = 30 and Y = 10");
      }
    }
  }
}

object Demo {
  def main(args: Array[String]) {
    val demo = new Demo()
    demo.ifStmt
    demo.ifElseStmt
    demo.ifElseElseStmt
    demo.nestedIfElseStmt
  }
}