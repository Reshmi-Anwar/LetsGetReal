public abstract class Number{
  private double value;
  public abstract double getValue();

  public int compareTo(Number other){
    if (equals(other)){
      return 0;
    }
    else if (getValue() < other.getValue()){
      return -1;
    }
    else{
      return 1;
    }
  }


  public boolean equals(Number other){

    double difference = Math.abs(this.getValue()-other.getValue());
    return ((difference <= (0.00001 * this.getValue())) || (difference <= (0.00001 * other.getValue())));


  }
}
