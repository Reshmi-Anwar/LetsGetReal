public class RationalNumber extends Number
{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    //super(0.0);//this value is ignored!
    numerator = nume;
    denominator = deno;
    if (denominator == 0){
      numerator = 0;
      denominator = 1;
    }
    if (denominator < 0){
      numerator = numerator * -1;
      denominator = denominator * -1;
    }
    reduce();
  }

  public double getValue(){
    return (double) numerator / denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    return new RationalNumber(denominator, numerator);
  }

  public boolean equals(RationalNumber other){
    return numerator == other.getNumerator() && denominator == other.getDenominator();
  }

  public String toString(){
    if (denominator == 1){
      return "" + numerator;
    }
    if (numerator == 0){
      return "0";
    }
    return numerator + "/" + denominator;

  }

  public static int gcd(int a, int b){
    int divisor = Math.min(a, b);
    int dividend = Math.max(a, b);
    int remainder = 1;
    int gcd = 1;
    //if (divisor == 0){
    //  divisor = 1;
    //}

    do {
      remainder = dividend % divisor;
      if (remainder == 0){
        gcd = divisor;
        break;
      }
      else{
        dividend = divisor;
        divisor = remainder;
      }
    } while (remainder > 0);
    return gcd;

  }

  private void reduce(){
    int gcd = gcd(Math.abs(numerator), Math.abs(denominator));

    numerator = numerator / gcd;
    denominator = denominator / gcd;

  }

  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
  }

  public RationalNumber divide(RationalNumber other){
    return new RationalNumber(numerator * other.getDenominator(), denominator * other.getNumerator());
  }

  public RationalNumber add(RationalNumber other){
    return new RationalNumber(numerator * other.getDenominator() + other.getNumerator() * denominator, denominator * other.getDenominator());
  }
  public RationalNumber subtract(RationalNumber other){
    return new RationalNumber(numerator * other.getDenominator() - other.getNumerator() * denominator, denominator * other.getDenominator());
  }

}
