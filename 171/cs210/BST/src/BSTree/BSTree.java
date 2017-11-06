package BSTree;

// Basit Qureshi Mar 22, 2017 2:09:28 PM
 
public class BSTree 
{
    Node Root;
    int size; // number of nodes
    public BSTree()
    {
        Root = null;
        size=0;
    }
    public void insert(Node N)
    {
        N.left=N.right=N.parent=null;
        if(Root==null)
        {
            size++;
            Root = N;
            
            return;
        }
        Node temp = Root;
        while(true)
        {
            if(temp.id<N.id)
            {
                //go right
                if(temp.right==null)
                {
                    //insert N;
                    temp.right = N;
                    N.parent = temp;
                    break;
                }
                temp = temp.right;
            }
            else
            {
                //go left!
                if(temp.left==null)
                {
                    //insert N;
                    temp.left = N;
                    N.parent = temp;
                    break;
                }
                temp = temp.left;
            } 
        }
        size++;
        return;
    }
    
    public Node search(int id)
    {
        Node temp = Root;
        if(temp==null)
            return null;
        if(temp.id==id)
            return temp;
        while(true)
        {
            if(temp.id<id)
            {
                //go right
                if(temp.right==null)
                    return null;
                temp = temp.right;      
            }
            else
            {
                //go left
                if(temp.left==null)
                    return null;
                temp = temp.left;
            }
        }
        
    }
    /*
    public String PreOrder()
    {
        String Str = "";
        Node temp = Root;
        if(temp==null)
            return "";
        while(true)
        {
            Str = Str + " " +temp.id;
            if(temp.left!=null)
                temp = temp.left;
            else if(temp.right!=null)
                temp = temp.right;
            else if(temp.left==null && temp.right== null)
                temp = temp.parent;
                
        }
        //return Str;
        
        
    }
    */
    public String PreOrder(Node temp)
    {
        if(temp==null)
            return "";
        else
            return temp.id + " " + PreOrder(temp.left) + PreOrder(temp.right);
    }
    public String InOrder(Node temp)
    {
        if(temp==null)
            return "";
        else
            return InOrder(temp.left) + " " +temp.id+" "+InOrder(temp.right);
    }
    public String PostOrder(Node temp)
    {
        if(temp==null)
            return "";
        else
            return PostOrder(temp.left) + PostOrder(temp.right)+ " " +temp.id;
    
    }
    
    public boolean remove(int key)
    {
        if(Root ==null)
        {
            return false;
        }
        Node find = search(key);
        if(find==null)
        {
            //didnt find it!
            return false;
        }
        if(find==Root)
        {
            
        }
        //we found the node to be removed!
        //case 0; no child
        if(find.left==null && find.right==null)
        {
            //check if find is the right or left child!
            if(find.parent.left==find)
                find.parent.left=null;
            else
                find.parent.right=null;
            find=null;
            size--;
            return true;  
        }
        //case 1: 
        else if((find.left==null && find.right!=null) ||
                (find.left!=null && find.right==null))
        {
            //Node child = find.right==null?find.left:find.right;
            Node child;
            if(find.right==null)
                child = find.left;
            else
                child = find.right;
            
            if(find.parent.left==find)//find is the left child
            {
                find.parent.left= child;  
            }
            else
            {
                find.parent.right=child;
            }
            child.parent=find.parent;
            find = null;
            size--;
            return true;
        }
        //two children
        else
        {
            Node candidate = find.right;
            while(candidate.left!=null)
                candidate = candidate.left;
            //candidate is point to the best candiate
            //check if candiate has a child
            if(candidate.right==null)
            {
                //candidate has no child
                candidate.parent.left=null;
                candidate.left=find.left;
                candidate.right=find.right;
                candidate.parent=find.parent;
                if(candidate.parent.left==find)
                    find.parent.left=candidate;
                else
                    find.parent.right=candidate;
                
                find=null;
                size--;
                return true;
                
            }
            else
            {
                //check if candidate is the right child of find
                if(find.right==candidate)
                {
                    candidate.left=find.left;
                    find.left.parent = candidate;
                    candidate.parent = find.parent;
                    if(find.parent.right==find)
                        candidate.parent.right= candidate;
                    else
                        candidate.parent.left=candidate;
                    size--;
                    return true;
                }
                //this is case 1
                Node temp = new Node(candidate.id);
                remove(candidate.id);
                temp.left = find.left;
                temp.right=find.right;
                if(find.parent.right==find)
                        temp.parent.right= temp;
                    else
                        temp.parent.left=temp;
                    size--;
                    return true;        
                
                
                
            }
            
            
        }
        
    }
    
    
    
}
