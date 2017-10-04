package CList;

// Basit Qureshi Feb 15, 2017 2:09:05 PM
 
public class CList 
{
    public Node Cursor;
    public int size;
    public CList()
    {
        size=0;
        Cursor = null;
    }
    
    public void insert(Node T)
    {
        if(Cursor==null)
        {
            Cursor = T;
            Cursor.next = Cursor;
            size++;
        }
        else
        {
            T.next = Cursor.next;
            Cursor.next = T;
            Cursor = Cursor.next;
            size++;   
        } 
    }
    public Node Search(int id)
    {
        Node temp = Cursor;
        boolean FLAG = false;
        
        if(size>=1)
        {
            do
            {
                if(temp.ID==id)
                {
                    FLAG = true;
                    break;
                }
                temp = temp.next;
            }while(temp!=Cursor);
            if(FLAG)
                return temp;
            else
            return null;
        }
        return null;
    }
    
    public Node getPrevNode(Node T)
    {
        Node temp = T;
        if(size==0)
            return null;
        else if (size==1)
        {
            return T;
        }
        while(temp.next != T)
            temp = temp.next;
        return temp;
    }
    public boolean remove(int id)
    {
        if(size==0)
            return false;
        if(size==1)
        {
            if(Cursor.ID==id)
            {
                Cursor=null;
                size--;
                return true;
            }
            return false;
        }
        
        Node found = Search(id);
        if(found==null)
        {
            System.out.println("Not found");
            return false;
        }
        
        Node prev = getPrevNode(found);
        prev.next = found.next;
        found = null;
        size--;
        Cursor = prev;
        return true;
        
    }
    public String toString()
    {
        String str = "";
        Node temp = Cursor;
        if(size!=0)
        {
            do
            {
                str = str + " " + temp.ID;
                temp = temp.next;
            }while(temp!=Cursor);
            return str;
        }
        else
            return str;
    }
    
    
}
