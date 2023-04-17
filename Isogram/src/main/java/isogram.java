import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * Created by Hayden Walker
 *      4/16/23
 *
 */
public class isogram {

    public static boolean isIsogram(String str) {

        HashSet<Character> set = new HashSet<>();

        if (str.isEmpty()) {
           return true;
        }

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);

            if (set.contains(currentChar)) {
                return false;
            }
            else {
                set.add(currentChar);
            }

        }

        return true;

    }

}
