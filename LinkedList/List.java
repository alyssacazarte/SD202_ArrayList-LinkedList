
package LinkedList;
//import java.util.*;
import java.util.LinkedList;

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

        LinkedList list = new LinkedList();
        
        list.push(5);
        list.push(7);
        System.out.println(list);
        list.pop();
        System.out.println(list);
        list.push(20);
        list.push(16);
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list);
    }
}