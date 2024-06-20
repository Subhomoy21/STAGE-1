public class StringPatterns {

    static void pat1(int n) {
        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pat2(int n) {
        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pat3(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + (i-1));
            for (int  j = 1; j<= i ; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void pat4(int n) {
        for (int i = 1; i <= n; i++) {
            // For printing the spaces before stars in each row
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // characters you need to print 
            char ch = 'A';
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print(ch);
                ch++;
            }

            // For printing the spaces after the stars in each row
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static void pat4main(int n) {
        for (int i = 1; i <= n; i++) {
            // For printing the spaces before stars in each row
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // characters you need to print 
            char ch = 'A';
            int breakpoint = (2*i-1) / 2;
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print(ch);
                if (j<=breakpoint){
                    ch++;
                }
                else{
                    ch--;
                }
            }

            // For printing the spaces after the stars in each row
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static void pat5(int n){
        for (int i = 1; i <= n; i++) {
             for (char ch =  (char) ('E' - i+1);  ch <= 'E' ;ch++) {
                System.out.print(ch);
             }
             System.out.println();
        }
    }

    public static void main(String[] args) {
        // pat1(4);
        // pat2(5);
        //    pat3(4);
     //   pat4(4);
     //pat4main(4);
     pat5(5);
    }
}