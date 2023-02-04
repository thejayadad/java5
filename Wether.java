import java.util.Arrays;

public class Wether {


    public static void main(String[] args) {
        double[] celsius = {33.7, 15.7, 44.7, 22.1, 10.4};
        double [] fahrenheit = fahrenheit(celsius);

        printTemp(celsius, "Celsius");

    }

    //Celsius to Fahrenheit Converter
    public static double[] fahrenheit(double[] celsius){

        double[] fahrenheit = new double[celsius.length];
        for(int i = 0; i < celsius.length; i++){
            fahrenheit[i] = (celsius[i] /5 * 9) + 32;        }
        return fahrenheit;
    }

    //PRINT OUT EACH TEMPERATURE
    public static void printTemp(double[] temp, String type){
        System.out.println(type + ": ");
        for(int i = 0; i < temp.length; i++){
            System.out.println(temp[i] + "");
        }
    }

}
