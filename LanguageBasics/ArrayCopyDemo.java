package LanguageBasics;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        //The following program, ArrayCopyDemo, declares an array of String elements.
        // It uses the System.arraycopy method to copy a subsequence of array components into a second array:
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};
        //public static void arraycopy(Object src, int srcPos,
        //                             Object dest, int destPos, int length)
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
    }
}
