package assignments.Ex0;
/**
 * This class is a basis for Ex0 (your first assigment),
 * The definition of the Ex0 can be found here: https://docs.google.com/document/d/1UtngN203ttQKf5ackCnXs4UnbAROZWHr/edit?usp=sharing&ouid=113711744349547563645&rtpof=true&sd=true
 * You are asked to complete the functions below amd may add additional functions if needed.

 */
public class Ex0 {
    public final static long ID = 331294710;  // Do update your ID here
    /**
     * This function checks if n is a prime number.
     * Notes:
     * i) This code is very slow - make sure you improved it!
     * ii) Make sure to document your code
     *
     * @param n (Integer) - represented as long
     * @return true if and only if there is no integer (p) within the range of [2,n) which divides n.
     *
     */
    public static boolean isPrime(long n) {
        if (n < 2) return false; // Any number under 2 cannot be a prime number
        if (n == 2 || n == 3) return true; // Two and Three are the smallest possible prime numbers
        if (n % 2 == 0 || n % 3 == 0) return false; // common dividers between a large amount of numbers
        for (long i = 5; i*i <= n; i += 6) { //every prime number above 3 is from the form 6k (+ || -) 1
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    /// ////////////////////
    ///
    /**
     * This function finds the first prime integer (p1) >= start, for which p2=p1+n is also a prime number.
     * @param start - a starting value from which p1 should be searched for.
     * @param n - a positive (even) integer value.
     * @return the first prime number p1 such that: i) p1>=start, ii) p1+n is a prime number.
     * in case a wrong value is given to the function
     * (n<0 or n is an odd number) the function should return -1.
     *
     */
    public static long getPrimePair(long start, long n) {
        long ans = -1;
        if (start % 2 == 0) { //if starting value is even, to keep i+=2 possible
            start++;
        }
        long i = start;
        if(n>=2 && n%2==0) {
            /// Add your code below ///
            while (true) {
                long p = i+n;
                if (isPrime(i) && isPrime(p)) {
                    ans = i;
                    return ans;
                }
                i += 2;
                }
            }
            /// ////////////////// ///

        return ans;
    }

    /**
     * This function compute the first prime number p1 for which:
     * i) p1 >= start (p1 is a prime number)
     * ii) p1+n==p2 ia a prime number.
     * iii) there are no prime numbers in the (p1,p2) range.
     *
     * @param start a positive integer which is the lower bound of p1.
     * @param n - a positive even integer.
     * @return a prime number p1>=start that the following prime number is p1+n.
     */
    public static long getClosestPrimePair(long start, long n) {
        /// Add your code below ///
        long ans = -1;
        long p1 = nextPrime(start);
        long p2 = nextPrime(p1 + 1); //if the two prime numbers are already the closest to each other, no need to check between them
        if(n>=2 && n%2==0) {
            while (p2 - p1 != n)
            {
                p1 = p2;
                p2 = nextPrime(p1 + 1);
            }
            return p1;
        }

        return ans;
        /// ////////////////// ///
    }
    /**
     * This function compute the m'th positive integer p1 for which:
     * i) p1 is a prime number.
     * ii) p1+n==p2 ia a prime number.
     * iii) there are no prime numbers in the (p1,p2) range.
     *
     * @param m a none negative integer.
     * @param n - a positive even integer.
     * @return a prime number p1>=start that the following prime number is p1+n.
     *
     */
    public static long getMthClosestPrimePair(int m, long n) {
        if(m<0 | n<0 | n%2!=0) {
            System.err.println("Invalid input: got m="+m+", n="+n+"  |  m should be >=0 & n should be a positive even integer ");
            return -1;
        }
        /// Add your code below ///
        int num = 0;
        long p5 = 2;
        while(p5 < Long.MAX_VALUE - n) {
            long p6 = nextPrime(p5 + 1);
            if(p6-p5 == n) {
                if(num == m) {
                    return p5;
                }
                num ++;
            }
            p5 = p6;

        }
        /// ////////////////// ///
        return -1;
    }

    /// //////// Priate Functions - you are welcome to add additional (private) functions below.
    ///
    ///      * This function compute the next prime number from a given prime number.
    ///      * @param n - a prime number
    ///      * @return the closest prime number to n.

private static long nextPrime(long x) {
    if (x < 2) return 2;
    if (x % 2 == 0) x++;
    while (!isPrime(x)) {
        x+=2;
    }
    return x;
}
}
