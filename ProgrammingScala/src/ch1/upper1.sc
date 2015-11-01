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

//Load Script
//sbt
//console
//:load ./src/oofp/ch01/upper1.sc

//Compile script as a class
//scalac -Xscript Upper1  ./HelloWorld/src/oofp/ch01/upper1.sc
//scala Upper1

//Disassemble with JAVA
//javap -cp . Upper1
//
//Disassemble with SCALA
//scalap -cp . Upper1
