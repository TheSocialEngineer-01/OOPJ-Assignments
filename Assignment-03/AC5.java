import java.util.*;
class Profit_Loss{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double Buying_MRP;
double Selling_MRP;
double difference;
double Profit_Percentage;
double Loss_Percentage;
System.out.println("Buying Price : ");
Buying_MRP = sc.nextDouble();
System.out.println("Selling Price : ");
Selling_MRP = sc.nextDouble();
if(Buying_MRP == Selling_MRP){
    System.out.println("No Profit No Loss.");
        }
   else if(Buying_MRP > Selling_MRP){
        difference = Buying_MRP - Selling_MRP;
        Loss_Percentage = ( difference / Buying_MRP ) * 100;
        System.out.println("Loss Percentage :" + Loss_Percentage + "%");
        }
   else if (Selling_MRP > Buying_MRP){
         difference = Selling_MRP - Buying_MRP ;
	    Profit_Percentage = ( difference / Buying_MRP ) * 100;
	    System.out.println("Profit Percentage :" + Profit_Percentage + "%");
         }
   else{
        System.out.println("Error!!!!!");
         }
   	   sc.close();
    }
}