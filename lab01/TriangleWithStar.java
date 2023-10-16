/* 
   Ex1    : Triangle with star
   author : Do Thuy Duong 20215019
   ClassID: 732872 
 */
import java.util.Scanner;

public class TriangleWithStar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do Thuy Duong 20215019\n");
        System.out.print("Height : ");
        int n = scanner.nextInt();
        for (int i = 1; i <=n ; i++ ){
            for (int j = i; j < n ; j++)
                System.out.print(" ");
            for (int j = 1; j <= (2 *i - 1 ); j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        scanner.close();
        System.exit(0);
    }
}
