package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    String string;
    public StringEvaluatorObject(String str) {
        string = str;
    }

    public String[] getAllSubstrings() {
        return StringEvaluator.getAllSubstrings(string);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return null;
    }

    public String getLargestCommonSubstring(String secondInput) {
        return null;
    }
}
