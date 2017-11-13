package AVL;

// Basit Qureshi Dec 4, 2016 8:41:50 PM
 
public class test 
{
    public static void main(String [] s)
    {
        
        
        AVL A = new AVL();
        A.insert(10);
        A.insert(5);
        A.insert(20);
        A.insert(8);
        A.insert(9);
        
        
        
        A.insert(22);
        
        A.insert(25); // problem
        System.out.println(A.inorder(A.root));
        

        
    }
}
