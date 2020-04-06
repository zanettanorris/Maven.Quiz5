package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {

        HashSet<String> substrings = new HashSet<>();
        for(int i =0; i< string.length();i++){
            for(int j=i+1; j<= string.length(); j++){
                substrings.add(string.substring(i,j));
            }
        }
        return substrings.toArray(new String[1]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] stringOneArray = getAllSubstrings(string1);
        String[] stringTwoArray = getAllSubstrings(string2);
        Integer k = 0;
        String[] commonSubstrings = new String[k];
//
        for (int i = 0; i < stringOneArray.length; i++) {
            for (int j = i + 1; j < stringTwoArray.length; j++) {
                if ((stringOneArray[i] == stringTwoArray[j]))
                    commonSubstrings[k] = stringOneArray[i];
                k++;
//
            }
//        }
//            return commonSubstrings.toArray(new String[1]);
//
            }

//    public static Set<String> longestCommonSubstrings(String s, String t) {
            return commonSubstrings;
        }


    public static String getLargestCommonSubstring(String string1, String string2) {
            int[][] table = new int[string1.length()][string2.length()];
            int longest = 0;
            Set<String> result = new HashSet<>();

            for (int i = 0; i < string1.length(); i++) {
                for (int j = 0; j < string2.length(); j++) {
                    if (string1.charAt(i) != string2.charAt(j)) {
                        continue;
                    }

                    table[i][j] = (i == 0 || j == 0) ? 1
                            : 1 + table[i - 1][j - 1];
                    if (table[i][j] > longest) {
                        longest = table[i][j];
                        result.clear();
                    }
                    if (table[i][j] == longest) {
                        result.add(string1.substring(i - longest + 1, i + 1));
                    }
                }
            }
            return result.toString();
//                    .toArray(new String[1]);
        }
    }

