import java.util.*;

public class patternNumbersPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        System.out.println();
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=(N-i)*2 ; j++) {
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--) {
                System.out.print(" "+j);
            }
            for (int j=2; j<=i ; j++) {
                System.out.print(" "+j);
            }
            System.out.println();
			
        }
        System.out.println();
        sc.close();
    }
}