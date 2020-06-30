import java.util.*;

public class IntermediateMethodsFasy {

    static float averageOf3(float a, float b, float c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        float a = in.nextFloat();
        System.out.print("Enter number 2: ");
        float b = in.nextFloat();
        System.out.print("Enter number 3: ");
        float c = in.nextFloat();
        System.out.println("The average is: " + averageOf3(a, b, c));


    }
}
