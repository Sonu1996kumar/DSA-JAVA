package dsa.arrays.basicmath;

import javax.sound.midi.Soundbank;

public class BasicMath {
    private static void printDigit(int num) {
        while (num != 0){
            int digit = num % 10;
            System.out.println(digit);
            //last digit remove
            num = num/10;
        }
    }

    private static int countDigit(int num) {
        int count = 0;
        while (num != 0){
            int digit = num % 10;
            count++;
            //last digit remove
            num = num/10;
        }
        return count;
    }

    private static int sumOfDigit(int num) {
        int sum = 0;
        while (num != 0){
            int digit = num % 10;
            sum += digit;
            //last digit remove
            num = num/10;
        }
        return sum;
    }

    private static int reverseDigit(int num) {
        int reveseNumber = 0;
        while (num != 0){
            int digit = num % 10;
            reveseNumber = reveseNumber * 10 + digit;
            //last digit remove
            num = num/10;
        }
        return reveseNumber;
    }

    private static boolean isPalindrome(int num){
        int originalNumber = num;
        int reverseNumber = reverseDigit(num);

        if(originalNumber == reverseNumber){
            return true;
        }else{
            return false;
        }
    }

    private static boolean isPrime(int num){
        /*for(int i = 2; i <= num-1; i++){
            if(num % i == 0){
                return false;
            }
        }*/
// optimize use i*i <= num or i<=root of n
        for(int i = 2; i * i<= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        //yanha tak aa gye hain iska mtlb remainde kabhi zero nhi hai
        return true;
    }

    public static int getGCD(int a, int b){
        while (b != 0){
            int oldValOfb = b;
            b = a % b;
            a = oldValOfb;
        }
        //jab mera b 0 hoga tab a ki jagah hume gcd milega
        return a;
    }

    public static int LCM(int a, int b){
        int gcd = getGCD(a,b);
        int prod = a * b;
        int lcm = prod / gcd;
        return lcm;
    }
    public static boolean isArmsrongNumber(int num) {
        int originalNumber = num;
        int sum = 0;

        while(num != 0){
            int digit = num % 10;
            int cubeOfDigit = digit * digit * digit;
            sum += cubeOfDigit;
            num = num / 10;
        }
        if(sum == originalNumber){
            return true;
        }else {
            return false;
        }
    }

    public static boolean checkPerfectNumber(int num){
        int sum = 1;
        for(int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                // i ne num ko perfectally divide kar diya hai to
                //ab factor pair kya banega
                //first factor i
                //second factor num/i
                int firstFactor = i;
                int secondFactor = num / i;
                sum = sum + firstFactor + secondFactor;
            }

        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void printPrimeNumber(int n){
        //1 is not a prime number
        for(int num = 2; num <= n; num++){
            boolean isPrimeNumber = isPrime(num);
            if(isPrimeNumber == true){
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        int number = 53127;
        int n = 9;
        //printDigit(number);

        //int numberOfdigit = countDigit(number);
        //System.out.println(numberOfdigit);

        //int sumOfDigit = sumOfDigit(number);
        //System.out.println(sumOfDigit);

        //int ans = reverseDigit(number);
        //System.out.println(ans);

        /*boolean palindrome = isPalindrome(number);
        if(palindrome){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }*/

        //System.out.println(isPrime(n));
        //int gcd = getGCD(18, 12);
       // System.out.println(gcd);
       // System.out.println(LCM(18, 12));
        //System.out.println(isArmsrongNumber(153));
        //System.out.println(checkPerfectNumber(6));
        printPrimeNumber(10);


    }
}
