package SLL;

// Basit Qureshi Sep 27, 2017 11:07:13 AM
// this implements Singly Linked List 
public class SLL 
{
    public Node Head;
    public int size;
    
//Constructor
    public SLL()
    {
        Head = null;
        size = 0;
    }

//Search a key.. returns first node found containing the key    
    public Node Search(int key)
    {
        Node temp = Head;
        while(temp!=null)
        {
            if(temp.val==key)
                break;
            temp = temp.next;
        }
        return temp;
    }
//Add a node to the list
    public void insert(Node N)
    {
        //check if list is empty
        if(Head==null)
        {
            Head = N;
            N.next = null;
            size++;
            return;
        }
        
        //add the new node N to the head of the list
        N.next = Head;
        Head = N;
        size++;
        return;
    }
    
//remove a node from the list; we first search the node containing the key
//3 cases would apply. begining, middle or the end.
    public boolean remove(int key)
    {
        
    }
    
}
