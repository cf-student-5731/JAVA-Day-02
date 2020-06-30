public class BasicStrings {


    static char getChar(String s, int i){
        return s.charAt(i);
    }

    static int getPositionOf(String s, char c){
        return s.indexOf(c);
    }

    public static void main(String[] args) {
        String hannah = "Did Hannah see bees? Hannah did";
        System.out.println(hannah);
        System.out.println("This String has " + hannah.length() + " Characters inside!");

            System.out.println(getChar(hannah, 12));
            System.out.println(getPositionOf(hannah, 'h'));



    }
}
