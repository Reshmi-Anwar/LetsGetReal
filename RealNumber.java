public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }
  //---------ONLY EDIT BELOW THIS LINE------------

  public boolean equals(RealNumber other){
    if (value == 0){
      return (other.getValue() == 0);
    }
    double differenceValue = Math.abs(other.getValue() - value);
    if (differenceValue == 0 || (differenceValue / value <= 0.00001 && differenceValue / other.getValue() <= 0.00001)){
      return true;
    }
    return false;
  }

  public RealNumber add(RealNumber other){
     return (new RealNumber(value + other.getValue()));
  }

  public RealNumber multiply(RealNumber other){
      return (new RealNumber(value * other.getValue()));
  }

  public RealNumber divide(RealNumber other){
      return (new RealNumber(value / other.getValue()));
  }

  public RealNumber subtract(RealNumber other){
      return (new RealNumber(value - other.getValue()));
  }
}
