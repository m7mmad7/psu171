package SLL;

// Basit Qureshi Sep 27, 2017 3:13:59 PM
 
public class tester1 
{
    public static void main(String [] s)
    {
        SLL S1 = new SLL();
        S1.insert(new Node(30));
        S1.insert(new Node(20));
        S1.insert(new Node(10));
        System.out.println(S1.toString());
        
        //insert 100
        S1.insert(new Node(100));
        System.out.println(S1.toString());
        
        //find 20
        Node find = S1.Search(30);
        System.out.println(find.val);
        
        //remove middle
        S1.remove(20);
        System.out.println(S1.toString());
        
        //remove first
        S1.remove(100);
        System.out.println(S1.toString());
        
        //remove last
        S1.remove(30);
        System.out.println(S1.toString());
    }
}
