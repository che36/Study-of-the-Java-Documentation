package LanguageBasics;

public class ArithmeticDemo {
    public static void main(String[] args) {
        //One of the most common operators that you'll encounter is the simple assignment operator "=".
        // The value on its right to the operand on its left:
        //Operator	Description
        //+	Additive operator (also used for String concatenation)
        //-	Subtraction operator
        //*	Multiplication operator
        ///	Division operator
        //%	Remainder operator

        int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);
    }
}