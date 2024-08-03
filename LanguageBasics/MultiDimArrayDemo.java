package LanguageBasics;

public class MultiDimArrayDemo {
    //You can also declare an array of arrays (also known as a multidimensional array) by using two or more sets of brackets,
    // such as String[][] names. Each element, therefore, must be accessed by a corresponding number of index values.
    public static void main(String[] args) {
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][2] + names[1][1]);
        // Ms. Jones
        System.out.println(names[0][0] + names[1][0]);
    }
}
