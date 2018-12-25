package com.boyuanzhang.functions.higherorder

object Demo {
  def main(args: Array[String]) {
    println(apply(layout, 10))

    var y: Int = 10

    println(y.toString())
  }

  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString() + "]"
}