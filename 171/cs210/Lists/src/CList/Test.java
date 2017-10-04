package CList;

// Basit Qureshi Feb 15, 2017 2:41:45 PM
 
public class Test 
{
    public static void main(String [] s)
    {
        CList C = new CList();
        C.insert(new Node(1));
       // C.insert(new Node(2));
      //  C.insert(new Node(3));
        
        System.out.println(C.toString());

        C.remove(1);
        
        System.out.println(C.toString());
        
        
    }
}
