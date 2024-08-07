package LanguageBasics;

//The equality and relational operators determine if one operand is greater than,
// less than, equal to, or not equal to another operand.
// The majority of these operators will probably look familiar to you as well.
// Keep in mind that you must use "==", not "=", when testing if two primitive values are equal.
public class ComparisonDemo {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        if (value1 == value2)
            System.out.println("value1 == value2");
        if (value1 != value2)
            System.out.println("value1 != value2");
        if (value1 > value2)
            System.out.println("value1 > value2");
        if (value1 < value2)
            System.out.println("value1 < value2");
        if (value1 <= value2)
            System.out.println("value1 <= value2");
    }
}
