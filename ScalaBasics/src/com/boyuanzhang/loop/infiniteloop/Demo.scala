package com.boyuanzhang.loop.infiniteloop

class Demo {
  def demo() {
    var a = 10;

    // An infinite loop.
    while (true) {
      println("Value of a: " + a);
      a=a+1;
    }
  }
}

object Demo {
	def main(args: Array[String]) {
		val demo = new Demo()
				demo.demo()
	}
}