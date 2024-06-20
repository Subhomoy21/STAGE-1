//import java.util.Scanner;

public class nessecary {

    static int countdigit(int n) {
        int count = 0;
        while (n > 0) {
            // int lastDigit = n%10;
            n = n / 10;
            count++;
        }
        return count;
    }

    static int evenlyDivides(int N) {
        int count = 0;
        int ori = N;
        while (N > 0) {
            int lastDigit = N % 10;
            if (lastDigit != 0 && ori % lastDigit == 0) {
                count++;
            }
            N = N / 10;
        }
        return count;
    }

    static int sumOwn(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }

    static int count2process(int n) {
        int count = (int) Math.floor(Math.log10(n) + 1);
        return count;
    }

    static int count3process(int n) {
        String n2 = Integer.toString(n);
        return n2.length();
    }

    static int reverseNum(int n) {
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + n % 10;
            n = n / 10;
        }
        return rev;
    }

    static boolean palindrome(int n) {
        boolean pal = true;
        int dup = n;
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + n % 10;
            n = n / 10;
        }
        if (rev == dup) {
            return pal;
        }
        return false;
    }

    static void palindrome2(int n) {
        int ispal = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        if (ispal == rev) {
            System.out.println("Yes,It is a palindrome number");
        } else {
            System.out.println("No,Its not a palindrome number");
        }
    }

    static boolean Armstrong(int n) {
        boolean arm = true;
        int ori = n;
        int count = 0;
        int temp = n;
        int sum = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }
        while (temp != 0) {
            int last = temp % 10;
            sum = (int) (sum + Math.pow(last, count));
            temp = temp / 10;
        }
        if (sum == ori) {
            return arm;
        }
        arm = false;
        return arm;
    }

    static void allDivisorsBruteforce(int n) {
        System.out.println("Print the number which are divisors of " + n);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

    static void allDivisorsOptimalMethod(int n) {
        System.out.println("Print the number which are divisors of" + n);
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print(n / i + " ");
                }
            }

        }
        System.out.println();
    }
    static void gcdgfg(int a,int b){
        int ans = 1;
        int x= Math.min(a, b);
        for (int i = 1; i <=x; i++) {
            if(a%i==0 && b%i==0){
                 ans = i;
            }
          
        }
        System.out.println(ans);
    }
    
    

    public static void main(String[] args) {
        // System.out.println(countdigit(587965413));
        // System.out.println(evenlyDivides(12));
        // System.out.println(sumOwn(7789));
        // System.out.println(count2process(7789));
        // System.out.println(count3process(7789));
        // System.out.println(reverseNum(7789));
        // System.out.println(palindrome(1225));
        // palindrome2(12221);
        // Scanner sc = new Scanner(System.in);
        // int n1 = sc.nextInt();
        // sc.close();
        // if(Armstrong(n1)){
        // System.out.println("This is the armstrong number");
        // }
        // else{
        // System.out.println("No,It is not an armstrong number");
        // }
        // allDivisorsBruteforce(36);
        // allDivisorsOptimalMethod(36);
        gcdgfg(4, 8);  
    }
}