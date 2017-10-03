package DLL;

// Basit Qureshi Oct 3, 2017 10:08:10 AM
 
public class Test1 
{
    public static void main(String [] s)
    {
        DLL D = new DLL();
        
        D.insert(new Node(10));
        D.insert(new Node(20));
        D.insert(new Node(30));
        D.insert(new Node(40));
        
        System.out.println(D.toString());
        //remove head;
        D.remove(40);
        System.out.println(D.toString());
        
        //remove tail
        D.remove(10);
        System.out.println(D.toString());
        
        //add some more nodes
        D.insert(new Node(40));
        D.insert(new Node(50));
        D.insert(new Node(100));
        System.out.println(D.toString());
        
        //update 100 to 60
        D.update(100, 60);
        System.out.println(D.toString());
        
        //remove 40
        D.remove(40);
        System.out.println(D.toString());
    }
}
