package BSTree;

// Basit Qureshi Mar 28, 2017 2:31:03 PM
 
public class test 
{
    public static void main(String [] s)
    {
        BSTree BST = new BSTree();
        BST.insert(new Node(10));
        BST.insert(new Node(20));
        BST.insert(new Node(5));
        BST.insert(new Node(15));
        System.out.println("Stop here!");
        System.out.println(BST.InOrder(BST.Root));
        System.out.println(BST.PostOrder(BST.Root));
        System.out.println(BST.PreOrder(BST.Root));
    }
}
