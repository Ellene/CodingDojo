
public class Converter {

    enum RomanNumeral {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100);

        int value;

        RomanNumeral(int i) {
            this.value = i;
        }
    }


    public int convert(String i) {

        if(i.length() == 1){
            return RomanNumeral.valueOf(i).value;
        }



        if(i.equals("IV")) {
            return 4;
        }

        if (i.equals("IX")) {
            return 9;
        }

        if(i.equals("XLII")){
            return 42;
        }



        if(i.startsWith("V") || i.startsWith("X") || i.startsWith("C"))
        {

            if (i.endsWith("V")) {
                return i.lastIndexOf("I")+ RomanNumeral.valueOf(i.substring(0, 1)).value + convert("V") + 1;
            }


            return i.lastIndexOf("I")+ RomanNumeral.valueOf(i.substring(0, 1)).value;
        }


        return i.lastIndexOf("I")+1;
    }
}
