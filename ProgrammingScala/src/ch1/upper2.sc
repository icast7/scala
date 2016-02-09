package ch1

object Upper2 {
	def upper(strings: String*) =
		strings.map(_.toUpperCase())
}

println(Upper2.upper("Hello", "World!"))