package LanguageBasics;

//The unary operators require only one operand;
// they perform various operations such as incrementing/decrementing a value by one,
// negating an expression, or inverting the value of a boolean.
public class UnaryDemo {
    public static void main(String[] args) {

        int result = +1;
        // result is now 1
        System.out.println(result);

        result--;
        // result is now 0
        System.out.println(result);

        result++;
        // result is now 1
        System.out.println(result);

        result = -result;
        // result is now -1
        System.out.println(result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
    }
}
