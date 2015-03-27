package mygenericity

object IntegerRefernce {
  def main(args: Array[String]){
    val cell = new Reference[Int]
    cell.set(13)
    println("Ref contains the half of "+(cell.get * 2))
  }
}