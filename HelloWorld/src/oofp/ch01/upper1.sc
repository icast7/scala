/**
 * Loc644
 * Created by icaste on 10/23/15.
 */
class Upper {
  def upper(strings: String*): Seq[String] = {
    strings.map((s:String) => s.toUpperCase )
  }
}

val up = new Upper
println(up.upper("Hello", "World!"))