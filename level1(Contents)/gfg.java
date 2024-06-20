public class gfg {
    public static boolean isPrime(int n){
        for (int i = 2; i < (n); i++) {
            if(n%i==0){
                 return false;
            }
        }
        return true;
    }
    public  static void primeFactorization(int n){
        for (int i = 2; i < (n); i++) {
            if(isPrime(i)){
              int   x = i;
                while(n%x==0){
                    System.out.println(i);
                    x=x*i;
                }
            }
        }
    }

    public static void main(String[] args) {
        primeFactorization(100);
        
        System.out.println(isPrime(100));
    }
}
