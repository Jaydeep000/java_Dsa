package patterns;

public class numberPyramid() {
    public static void pattern(int n) {
        for (int i=1;i<=n;i++){    
            for(int j=n-i;j>=1n;j--)
                System.out.print(" ");
            for(int j=1;j<=n;j++)
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    
    public static void main(String[] args) {
        patterns(5);
    }
}