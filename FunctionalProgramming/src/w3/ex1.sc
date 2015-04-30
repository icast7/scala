package w3

abstract class Base {
	def foo = 1
	def bar: Int
}

class Sub extends Base {
	override def foo = 2
	def bar = 3
}

object ex1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}