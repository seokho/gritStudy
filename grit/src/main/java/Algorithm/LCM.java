package Algorithm;

/**
 * Created by odol on 2016. 11. 25..
 */
public class LCM {
    public static void main(String[] args) {
        System.out.println("lcm : " + lcm(10,2));
    }

    private static int lcm(int big, int small) {
        int gcdNum = gcd(big, small);
        System.out.println("gcd : " + gcdNum);
        return big * small / gcdNum;
    }


    private static int gcd(int big, int small) {
        if (small == 0) {
            return big;
        }
        return gcd(small, big % small);
    }
}
