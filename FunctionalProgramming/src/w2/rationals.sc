package w2

class Rational(x: Int, y: Int){
    require(y != 0, "denominator must be nonzero")
    
    def this(x: Int) = this(x, 1)

    private def gcd(a: Int, b: Int): Int =  if (b == 0) a else gcd(b, a%b)
   
    def numer = x
    def denom = y
    
    def less(that: Rational) = numer * that.denom < that.numer * denom
    
    def < (that: Rational) =  numer * that.denom < that.numer * denom
    
    def max(that: Rational) = if (this.less(that)) that else this
    
    def maxx(that: Rational) = if (this < that) that else this
    
    def add(that: Rational) =
        new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom)
    
    def + (that: Rational) =
    new Rational(
    numer * that.denom + that.numer * denom,
    denom * that.denom)
    
    def unary_- : Rational = new Rational(-numer, denom)
    
    def neg: Rational = new Rational(-numer, denom)
    
    def - (that: Rational) = this + that.neg
    
    def sub(that: Rational) = add(that.neg)
    
    override def toString = {
        val g = gcd(numer, denom)
        numer/g + "/" + denom/g
    }
}


object rationals {
    val x = new Rational(1, 3)                    //> x  : w2.Rational = 1/3
    val y = new Rational(5, 7)                    //> y  : w2.Rational = 5/7
    val z = new Rational(3, 2)                    //> z  : w2.Rational = 3/2
    x.numer                                       //> res0: Int = 1
    x.denom                                       //> res1: Int = 3
    x.sub(y).sub(z)                               //> res2: w2.Rational = -79/42
    x - y - z                                     //> res3: w2.Rational = -79/42
    y.add(y)                                      //> res4: w2.Rational = 10/7
    y + y                                         //> res5: w2.Rational = 10/7
    x.less(y)                                     //> res6: Boolean = true
    x < y                                         //> res7: Boolean = true
    x.max(y)                                      //> res8: w2.Rational = 5/7
    x.unary_-                                     //> res9: w2.Rational = 1/-3
    //val strange = new Rational(1, 0)
    //strange.add(strange)
    new Rational(2)                               //> res10: w2.Rational = 2/1
}