import java.util.*;
class Numbers{
  public static void main (String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a Number : ");
   double num = sc.nextDouble();
   if (num == 0) {
   System.out.print("Given Number Is A zero.");
   }
else if ( num < 0 ){
     System.out.print( num + "Is A Negative Number .");
}
else {
  System.out.print( num + "Is A Positive Number.");
}
sc.close();

  }
}


