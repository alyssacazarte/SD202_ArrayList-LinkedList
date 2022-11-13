
package ArrayList;
import java.util.ArrayList;

public class List {
        public static int insertFront(int [] arr, int count, int item){
        for(int i = count; i > 0; --i){
        arr[i]=arr[i-1];
    }
        arr[0]=item;
        return count+1;
    }
      public static int insertRear(int [] arr, int count, int item) {
        arr[count] = item;
        return count + 1;
      }
       public static void displayArray(int [] arr, int count) {
        System.out.print("{");
        for(int i = 0; i<count; ++i) {
            System.out.print(arr[i]);
            if(i < count - 1) {
                System.out.print(", ");
            }
        } 
       System.out.println("}");
}
        public static void main(String[] args) {
         int [] intArr = new int[5];
         int ctr = 0;
        
         displayArray(intArr, ctr);
         ctr = insertRear(intArr, ctr, 5);
         displayArray(intArr, ctr);
         ctr = insertRear(intArr, ctr, 7);
         displayArray(intArr, ctr);
         ctr = insertFront(intArr, ctr, 100);
         displayArray(intArr, ctr);
         ctr = insertRear(intArr, ctr, 2);
         displayArray(intArr, ctr);
         ArrayList myList = new ArrayList(10);
        
         System.out.println(myList);
         myList.add(5);
         System.out.println(myList);
         myList.add(7);
         System.out.println(myList);
         myList.add(0,100);
         System.out.println(myList);
         myList.add(2, 6);
         System.out.println(myList);
        
         System.out.println("Is the value 5 in the list? " + myList.contains(5));

        }
}
