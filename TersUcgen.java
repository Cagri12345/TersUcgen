package Basic;
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Ters üçgenin basamak sayısını girin: ");
        n= input.nextInt();

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= ((n+1)-i) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
