package _mydemo
import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

/**
 * Created by icaste on 10/26/15.
 */

object FrenchDate {
  def main(args: Array[String]){
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}
