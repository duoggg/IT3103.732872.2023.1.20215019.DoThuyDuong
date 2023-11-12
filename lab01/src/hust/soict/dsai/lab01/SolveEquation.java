/* 
   Ex6    : SolveEquation
   author : Do Thuy Duong 20215019
   ClassID: 732872 
 */
package hust.soict.dsai.lab01;

import java.util.Scanner;

 public class SolveEquation {
     public static void main(String[] args) {
         int typeOfEq;
         System.out.println("Do Thuy Duong 20215019\n");
         System.out.println("Select type of equation\n");
         System.out.println("\t1.First-order equations\n");
         System.out.println("\t2.System of first-order equations\n");
         System.out.println("\t3.Second-degree equation\n");
         System.out.print("Choose: ");

         Scanner scanner = new Scanner(System.in);
         typeOfEq = scanner.nextInt();

         switch(typeOfEq){
            case 1:
                double aa, bb;

                System.out.print("Enter a=");
                aa = scanner.nextDouble();
                System.out.print("Enter b=");
                bb = scanner.nextDouble();

                if (aa==0 && bb==0)          System.out.println("Infinite solution!\n"); 
                else if (aa == 0 && bb != 0) System.out.println("No solution!\n");
                else                         System.out.println("x= " + (-bb / aa));

                break;

            case 2:

                double a11, a12, a21, a22, b1, b2, x1, x2;

                System.out.print("a11 = ");
                a11 = scanner.nextDouble();
                System.out.print("a12 = ");
                a12 = scanner.nextDouble();
                System.out.print("a21 = ");
                a21 = scanner.nextDouble();
                System.out.print("a22 = ");
                a22 = scanner.nextDouble();
                System.out.print("b1 = ");
                b1 = scanner.nextDouble();
                System.out.print("b2 = ");
                b2 = scanner.nextDouble();

                double d = a11*a22 - a21*a12;
                double d1 = b1*a22 - a12*b2;
                double d2 = a11*b2 - a21*b1;

                if (d==0 && d1==0 && d2==0)     System.out.println("Infinite solutions!");
                else if (d==0)                  System.out.println("No solution!");
                else                            System.out.println("\t x1= " + (d1/d) + "\n" 
                                                                + "\t x2= " + (d2/d));
            
                break;

            case 3:
                double a, b, c, x, dd, x11, x22;

                System.out.print("a = ");
                a = scanner.nextDouble();
                System.out.print("b = ");
                b = scanner.nextDouble();
                System.out.print("c = ");
                c = scanner.nextDouble();

                if (a==0 && b==0 && c==0)         System.out.println("Infinite solutions!");
                else if(a==0  && b ==0 && c != 0) System.out.println("No solution!");
                else if (a==0)                    System.out.println("Solution x=" + (-c/b));
                else {
                    dd = b * b - 4 * a * c;
                    x11 = (-b + Math.sqrt(dd)) / (2*a);
                    x22 = (-b - Math.sqrt(dd)) / (2*a);
                    if(x11 == x22) System.out.println("Solution: \n\tx1 = x2 = " + x11 + "\n");
                    else           System.out.println("Solution: \n\tx1 = " + x11 + "\n\tx2 = " + x22);
                } 
                    
                break;  
            default: 
         }
         scanner.close();
     }
 }