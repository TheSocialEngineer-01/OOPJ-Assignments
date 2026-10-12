class Q3{
     public static void main(String args[]){
           int a[] = {25,14,56,15,36,77,18,29,49};
           int max = a[0];
           int min = a[0];
           for(int i = 1;i < a.length;i++){
               if(a[i] > max) max = a[i];
               if(a[i] < min) min = a[i];
              }           
           System.out.println("Output : Maximum value for the above array is = "+max);
           System.out.println("Output : Minimum value for the above array is = "+min);
          }
       }