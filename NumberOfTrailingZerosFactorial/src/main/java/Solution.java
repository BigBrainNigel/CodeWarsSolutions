/**
 *
 * Created by Hayden Walker
 *      7/19/23
 *
 */
public class Solution {
    public static int zeros(int n) {

        int multOf5 = findMultOf5(n);
        int summation = 0;

        //If n is a multiple of 5, sum n/5^i from 1 to the power of 5 that
        //equals n.
        if (multOf5 > 0) {

            for (int i = 1; i < multOf5 + 1; i++) {
                summation += n/Math.pow(5, i);
            }

        }
        //If n is not a multiple of 5, find the nearest multiple of 5 that is
        //less than n. Then, sum n/5^i from 1 to the power of 5 that is less
        //than n.
        else {

            int multOf5LessThanN = 1;
            int count = 0;

            while (multOf5LessThanN < n) {
                multOf5LessThanN = multOf5LessThanN * 5;
                count++;
            }

            for (int i = 1; i < count + 1; i++) {
                summation += n/Math.pow(5, i);
            }

        }

        return summation;

    }

    //Determines if the input number n is a multiple of 5, and if so, returns
    //the power to raise 5 to that equals n.
    public static int findMultOf5(int n) {

        int multOf5 = 0;

        if (n % 5 == 0) {

            while (n > 1) {
                n = n/5;
                multOf5++;
            }

            return multOf5;

        }

        return 0;

    }

}