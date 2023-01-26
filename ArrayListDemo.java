import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    

    public static void main(String[] args) {
        ArrayList array= new ArrayList<String>();
        array.add ("sunil");
        array.add( "sourabh");
        array.add( "sunita");
        array.add( "nil");
        array.add( "sunil");
        array.add( "sunil");

        System.out.println(array);
     
        Iterator itr= array.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
            
       

    }
    
}
