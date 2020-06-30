import java.util.*;

public class IntermediateFasy {

    static int myIndexOf(String s, char c){
        return (s.indexOf(c)+1);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a String: ");
        String myString = in.nextLine();
        System.out.print("Please enter the Character of the wanted Index: ");
        char myChar = in.next().charAt(0);
        in.nextLine(); //clear the buffer
        System.out.println(myChar + " appears first at Position " + myIndexOf(myString, myChar));
        System.out.print("Enter String to check the Start with: ");
        String myString2 = in.nextLine();
        System.out.println("The answer is: " + myString.startsWith(myString2));

        myString = "Java is Juicy";
        System.out.println("Java is Juicy contains is? --->" + myString.contains("is"));

        System.out.println("Coding is fun: ends with: un? --->" + "Coding is fun".endsWith("un"));
        System.out.println("Coding is fnu: ends with: un? --->" + "Coding is fnu".endsWith("un"));
        }

}
