import java.util.ArrayList;
import java.util.Iterator;

class ArrayListDemo{
    public static void main(String[] args) {
        // step 1: create an arraylist object
        int[] arr = new int[10];
        arr[0] = 10;

        ArrayList<String> list1 = new ArrayList();

        list1.add("Spiderman");
        list1.add("The Batman");
        list1.add("The Odyssey");

        for(int i = 0; i < list1.size() ; i++){
            System.out.println(list1.get(i));
        }

        // for each loop
        for(String x : list1){
            System.out.println(x);
        }

        // update an arraylist
        list1.set(1, "The Dark Knight");

        System.out.println(list1);

        list1.add(0, "Inception");

        list1.remove("The Dark Knight");
        list1.remove(0);

        ArrayList<String> list2 = new ArrayList(50);

        list2.add("Inception");
        list2.add("Avengers");
        list2.add("Barbie");
        list2.add("GodFather");

    //    for(String str : list2){
    //         System.out.println(str);

    //         // i'm changing the size of the arraylist while iterating over it, this will throw an exception
    //         list2.add("Dummy Value");
    //    }

       // Iterators 
       Iterator<String> it= list2.iterator();
       while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
            if(str.equals("Avengers")){
                it.remove();
            }
       }
        System.out.println(list2);
    }

}