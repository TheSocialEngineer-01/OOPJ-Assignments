import java.util.*;
class BinarySearch{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
int Size,Element;
System.out.println("Enter The Size of the Array : ");
Size = sc.nextInt();
int a[] = new int [ Size ];
for ( int i = 0;i < Size;i++){
System.out.printf("Enter the Element at index %d : ", i);
a[i] = sc.nextInt();
    }
Arrays.sort(a);
Element = sc.nextInt();
int low = 0,high = Size - 1;
int mid,pos = -1;
while(low <= high){
mid = ( low + high )  / 2;
if ( Element < a[mid]){
     high = mid - 1;  
   }   
else if ( Element > a[mid]){
      low = mid + 1;
    }
else if( Element == a[mid]){
   pos  = mid;
   break;
    }
}
if(pos == -1){
   System.out.printf("%d was not found in the array.", Element);
    }
else{
   System.out.printf("%d was found in the array.", Element);
   } 
 }
}