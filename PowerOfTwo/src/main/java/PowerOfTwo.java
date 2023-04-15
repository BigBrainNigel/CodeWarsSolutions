/**
 *
 * Created by Hayden Walker
 *      4/10/23
 *
 */
public class PowerOfTwo {

    public static boolean isPowerOfTwo(long n) {

        float nFloat = n;

        while (nFloat > 1) {
            nFloat = nFloat / 2;
        }

        return nFloat == 1;

    }

}
