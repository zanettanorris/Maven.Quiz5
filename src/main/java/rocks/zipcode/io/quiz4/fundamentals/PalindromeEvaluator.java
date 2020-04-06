package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
            String[] allSubstrings = StringEvaluator.getAllSubstrings(string);
            ArrayList<String> palindromeList = new ArrayList<>();
            for (String substring : allSubstrings) {
                if (isPalindrome(substring)) {
                    palindromeList.add(substring);
                }
            }
            return palindromeList.toArray(new String[palindromeList.size()]);
        }

//        public static Set<CharSequence> printAllPalindromes(String string) {
//            if (string.length() <= 2) {
//                return Collections.emptySet();
//            }
//            String [] out = new String [];
//            int length = string.length();
//            for (int i = 1; i <= length; i++) {
//                for (int j = i - 1, k = i; j >= 0 && k < length; j--, k++) {
//                    if (string.charAt(j) == string.charAt(k)) {
//                        out.add(string.subSequence(j, k + 1));
//                    } else {
//                        break;
//                    }
//                }
//            }
//            return out;
//        }



    public static Boolean isPalindrome(String string) {
//        char[] word = new char [string.length()];
//    string.toCharArray();
//
//        public static boolean istPalindrome(char[] word){
//            int i1 = 0;
//            int i2 = word.length - 1;
//            while (i2 > i1) {
//                if (word[i1] != word[i2]) {
//                    return false;
//                }
//                ++i1;
//                --i2;
//            }
//            return true;
//        }
//    }
//        public static boolean isPalindrome (String string){
        Boolean isPalindrome = string.equals(new StringBuilder(string).reverse().toString());
        return isPalindrome;
    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();

    }
}