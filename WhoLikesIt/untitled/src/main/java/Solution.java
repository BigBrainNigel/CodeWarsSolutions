import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static String whoLikesIt(String... names) {

        int arrLen = names.length;

        switch (arrLen) {

            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                return names[0] + ", " + names[1] + " and " + (arrLen - 2) + " others like this";

        }


    }
}