package LanguageBasics;

public class ConditionalDemo2 {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);
    }
}
//Because someCondition is true, this program prints "1" to the screen.
// Use the ?: operator instead of an if-then-else statement if it makes your code more readable;
// for example, when the expressions are compact and without side-effects (such as assignments).
