package LanguageBasics;

//The + operator can also be used for concatenating (joining) two strings together,
// as shown in the following ConcatDemo program:
public class ConcatDemo {
    public static void main(String[] args) {
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString + secondString;
        System.out.println(thirdString);
    }
}
