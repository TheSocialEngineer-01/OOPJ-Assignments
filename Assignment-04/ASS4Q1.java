import java.util.*;
class Quadratic_Equation{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter a :");
double a = sc.nextDouble();
System.out.print("Enter b :");
double b = sc.nextDouble();
System.out.print("Enter c :");
double c = sc.nextDouble();

if(a != 0){
     double D = ((b * b) - 4 * a * c);
     if(D > 0){
          System.out.println("Quadratic Equation have Real and Distinct roots ");
         double r1 = ((-b + Math.sqrt(D))/2 * a);
         double r2 = ((-b + Math.sqrt(D))/2 * a);
          System.out.println("The roots are :"+r1+ "&" +r2);
             }
     else if(D == 0){
         System.out.println("Quadratic Equation have Real and Equal Roots.");
         double r = (-b/(2*a));
         System.out.println("The Roots Are :"+r + " " +r);
                    } 
     else{
         System.out.println("Quadratic Equation have Imaginary Roots.");
         double real_part =  (-b /(2 * a));
         double imaginary_part =  (( Math.sqrt(-D))/(2 * a));
         System.out.println("The 1ST Root is : "+real_part + "+" + imaginary_part + "i");
         System.out.println("The 2ND Root is : "+real_part + "+" + imaginary_part + "i");
         }
         }
       else{
          System.out.println("Quadratic Equation does not exists. ");
           }

     }
}