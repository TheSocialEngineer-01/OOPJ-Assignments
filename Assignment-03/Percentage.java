import java.util.*;
class Percentage {
    public static void main( String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the marks of Sub1 out of 100 :");
          int  Sub1 = sc.nextInt();
          System.out.println("Enter The Marks Of Sub2 out of 100 : ");
          int  Sub2 = sc.nextInt();
          System.out.println("Enter The Marks Of Sub3 out of 100 : ");
          int  Sub3 = sc.nextInt();
          System.out.println("Enter The Marks Of Sub4 out of 100 : ");
          int Sub4 = sc.nextInt();
          System.out.println("Enter The Marks Of Sub5 out of 100 : ");
          int  Sub5 = sc.nextInt();
          double Total_Marks = Sub1 + Sub2 +Sub3 + Sub4 + Sub5;
          double Percentage =  (Total_Marks / 500 ) * 100;
          System.out.println("The Total Marks is : " + Total_Marks);
          System.out.println("The Percentage is : " + Percentage);
          sc.close();
    }


}