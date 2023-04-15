import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * Created by Hayden Walker
 *      4/15/2023
 *
 */
public class FindOdd {
    public static int findIt(int[] a) {

        HashMap<Integer, Integer> map = new HashMap<>();

        //For each value in a, if the value is not already in the hash map, add
        //it to the map and assign its value to 1 (since it has occurred once).
        //Else, increment the number of times it has appeared in array a.
        for (int value : a) {

            if (!map.containsKey(value)) {
                map.put(value, 1);
            }
            else {
                map.replace(value, (map.get(value) + 1));
            }

        }

        //For each key in the map, if the value of that key is not even, return
        //that key.
        for (int currentKey : map.keySet()) {

            int currentValue = map.get(currentKey);
            if (currentValue % 2 != 0) {
                return currentKey;
            }

        }

        //If none of the #'s in array a appear an odd amount of times
        return -99;

    }

}
