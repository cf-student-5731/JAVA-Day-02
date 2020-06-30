import java.util.*;
public class BasicStringsFasy {


    static char getChar(String s, int i){
        return s.charAt(i);
    }

    static int getPositionOf(String s, char c){
        return s.indexOf(c);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String hannah = "Did Hannah see bees? Hannah did";
        System.out.println(hannah);
        System.out.println("This String has " + hannah.length() + " Characters inside!");

        System.out.println(getChar(hannah, 12));
        System.out.println(getPositionOf(hannah, 'b'));
        System.out.print("Please enter a String: ");

        String myString = in.nextLine();
        System.out.println("You wrote: " + myString);
        System.out.print("Enter the position of the wanted Character: ");
        int myPosition = in.nextInt();
        System.out.println("The Character at position " + myPosition + " is " + getChar(myString, myPosition-1));
        System.out.println("Was it a car or a cat I saw?".substring(9, 12));



    }
}
