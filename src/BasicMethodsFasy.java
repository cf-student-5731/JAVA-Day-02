public class BasicMethodsFasy {

    static float fahrenheitToCelsius(float fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }

    static float celsiusToFahrenheit(float celsius){
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {

        System.out.println(fahrenheitToCelsius(40) + "--------" + celsiusToFahrenheit(fahrenheitToCelsius(40)));
        System.out.println(fahrenheitToCelsius(50) + "--------" + celsiusToFahrenheit(fahrenheitToCelsius(50)));
        System.out.println(fahrenheitToCelsius(60) + "--------" + celsiusToFahrenheit(fahrenheitToCelsius(60)));
    }

}
