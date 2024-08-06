package LanguageBasics;

//The increment/decrement operators can be applied before (prefix)
// or after (postfix) the operand. The code result++; and ++result;
// will both end in result being incremented by one.
// The only difference is that the prefix version (++result) evaluates to the incremented value,
// whereas the postfix version (result++) evaluates to the original value.
// If you are just performing a simple increment/decrement,
// it doesn't really matter which version you choose.
// But if you use this operator in part of a larger expression,
// the one that you choose may make a significant difference.
public class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        // prints 3
        System.out.println(i++);//increment one,thus now we have 4,that will increment next time.
        // prints 5
        System.out.println(++i);//4+1 = 5
        // prints 6
        ++i;//5+1 = 6
        System.out.println(i);
        // prints 7
        i++;//6+1=7
        System.out.println(i);
        // prints 8
        i++;//7+1=8
        System.out.println(i);
    }
}
