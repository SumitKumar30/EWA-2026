import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListDemo {
    public static void main(String[] args) {
        // creating an object of a linked list 
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list);

        // using for-each loop to iterate over the linked list
        for(String fruit : list){
            System.out.println(fruit);
        }   

        list.removeLast();
        System.out.println(list);

        list.addFirst("Mango");
        System.out.println(list);

        list.addLast("Grapes");
        System.out.println(list);

        // using iterator to iterate over the linked list
        java.util.Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            
        }

        ListIterator<String> listIt = list.listIterator();

        while(listIt.hasNext()){
            String fruit = listIt.next();
        
            if(fruit.equals("Banana")){
                listIt.set("Blueberry");
            }
        }
        System.out.println(list);

        while(listIt.hasPrevious()){
            System.out.println(listIt.previous());
           
        }
    }
}
