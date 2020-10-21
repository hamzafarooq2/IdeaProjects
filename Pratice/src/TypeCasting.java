import java.text.DecimalFormat;

public class TypeCasting {

    public static void main(String[] args) {
        int valueOne = 5;
        int valueTwo = 2;
        DecimalFormat decimalFormat = new DecimalFormat( "#.##");


        float result = Float.parseFloat(valueOne+"")/valueTwo;
        System.out.println(result);




    }

}
