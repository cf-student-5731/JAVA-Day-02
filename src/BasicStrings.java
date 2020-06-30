public class BasicStrings {


    static char getChar(String s, int i){
        return s.charAt(i);
    }

    public static void main(String[] args) {
        String hannah = "Did Hannah see bees? Hannah did";
        System.out.println(hannah);
        System.out.println("This String has " + hannah.length() + " Characters inside!");

            System.out.println(getChar(hannah, 12));


    }
}
