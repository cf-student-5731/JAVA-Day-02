public class AdvancedStringsFasy {

    static String getInitials(String firstName, String lastName){
        return String.valueOf(firstName.charAt(0)) + String.valueOf(lastName.charAt(0));

    }

    public static void main(String[] args) {

        System.out.println(getInitials("John", "Doe"));

    }
}
