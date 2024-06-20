public class Try_pattern {
    static void Try_pattern1(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(j%2 !=0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Try_pattern1(5);
    }
}
