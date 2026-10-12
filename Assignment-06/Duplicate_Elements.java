class Duplicate_Value{
public static void main(String args[]){
int a[] = {1,2,3,4,5,5,6,6,7,2};
System.out.println("Output :");
for(int  i = 0;i < a.length;i++){
  for(int j = i + 1;j < a.length;j++){
     if(a[i] == a[j]){
           System.out.println("Duplicate Elements :" +a[i]);
                    break;
         }
       }                
     }
   }
 }