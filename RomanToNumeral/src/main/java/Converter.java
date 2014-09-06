
public class Converter {

  private enum RomanUnit {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private int value;

    RomanUnit(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }
  }

  public int convert(String romanNumber) {

    if (romanNumber.length() == 1) {
      return RomanUnit.valueOf(romanNumber).getValue();
    }

    char[] charArr = romanNumber.toCharArray();

    if(romanNumber.length()>=3){
      for(int i =2; i<romanNumber.length();i++){
        if(convert(String.valueOf(charArr[i-2]))< convert(String.valueOf(charArr[i]))){
               throw new IllegalArgumentException("Incorrect number format");
        }
      }
    }

    int total=0;
    int previousValue = 0;
    for (char c : charArr) {

      int currentValue = convert(String.valueOf(c));
      if (currentValue > previousValue) {
        total += (currentValue - 2*previousValue);
      } else {
        total += currentValue;
      }
      previousValue = currentValue;
    }
    return total;

  }
}
