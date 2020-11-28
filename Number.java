public abstract class Number{
  private double value;
  public abstract double getValue();

  /*return 0 when this Number equals the other Number
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    //TO BE IMPLEMENTED
    return 0;
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number other){
    if (value == 0){
      return (other.getValue() == 0);
    }
    double differenceValue = Math.abs(other.getValue() - value);
    if (differenceValue == 0 || (differenceValue / value <= 0.00001 && differenceValue / other.getValue() <= 0.00001)){
      return true;
    }
    return false;
  }

}
