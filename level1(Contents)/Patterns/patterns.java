public class patterns {

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            // For printing the spaces before stars in each row
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // For printing the stars in each row
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            // For printing the spaces after the stars in each row
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            // For printing the spaces before stars in each row
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            // For printing the stars in each row
            for (int j = 1; j <= (2 * n - (2 * i - 1)); j++) {
                System.out.print("* ");
            }
            // For printing the spaces after the stars in each row
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            // For printing the spaces before stars in each row
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // For printing the stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // For printing the spaces after the stars in each row
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            // For printing the spaces before stars in each row
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            // For printing the stars in each row
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            // For printing the spaces after the stars in each row
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern10sub(int n) {
        for (int i = 1; i <= (2 * n - 1); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10_main(int n) {
        for (int i = 1; i <= (2 * n - 1); i++) {
            int star = i;
            if (i > n) {
                star = 2 * n - i;
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            int start = 1;
            if (i % 2 != 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            int spaces = (2 * n - 2 * i);
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Again number but in reversed order!
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    static void pattern12striver(int n) {
        int spaces = (2 * (n - 1));
        for (int i = 1; i <= n; i++) {

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Again number but in reversed order!
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            spaces -= 2;
        }
    }

    static void pattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            // print stars
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("*");
            }
            // print spaces
            for (int j = 1; j <= (2 * i - 2); j++) {
                System.out.print(" ");
            }

            // print stars again!
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            // print stars for the second part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for the spaces
            for (int j = 1; j <= (2 * n - 2 * i); j++) {
                System.out.print(" ");
            }
            // for the stars again
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {
        int spaces = (2 * n - 2);
        for (int i = 1; i <= (2 * n - 1); i++) {

            // stars
            int stars = i;
            if (i > n) {
                stars = (2 * n - i);
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n) {
                spaces -=2;
            } else {
                spaces += 2;
            }
        }
    }
     
    static void pattern16(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // pattern1(4);
        // pattern2(4);
        // pattern3(4);
        // pattern4(4);
        // pattern5(4);
        // pattern6(4);
        // pattern7(4);
        // pattern8(4);
        // pattern9(4);
        // pattern10sub(4);
        // pattern10_main(4);
        // pattern11(4);
        // pattern12(4);
        // pattern12striver(4);
        // pattern13(4);
        // pattern14(5);
     //   pattern15(5);
        pattern16(4);
    }
}
