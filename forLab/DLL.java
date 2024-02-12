class Node{
    int data;
    Node Llink,Rlink;
    Node(int item){
        data = item;
        Llink = null;
        Rlink = null;
    }
}

class DLLOperations{
    Node head,tail,temp;
    DLLOperations(){
        head = null;
        tail = null;
    }

    void Display(){
        Node temp = head;
        while (temp != null) {
        System.out.print(temp.data + " <-> ");
        temp = temp.Rlink;
    }
    System.out.println("Null");
    }

    void InsertAtBeg(int item){
        Node node = new Node(item);
        if(head == null){
            head = tail = node;
        }else{
            node.Rlink = head;
            head.Llink = node;
            head = node;
        }
    }

    void InsertAtEnd(int item){
        Node node = new Node(item);
        if(head == null){
            head = tail = node;
        }else{
            tail.Rlink = node;
            node.Llink = tail;
            tail = node;
        }
    }

    void InsertAtPos(int pos,int item){
        Node node = new Node(item);
        if(pos == 1){
            if(head == null){
                head = tail = node;
            }else{
                node.Rlink = head;
                head.Llink = node;
                head = node;
            }
        }else{
            temp = head;
            for(int i=1;i<pos-1;i++){
                temp = temp.Rlink;
            }
            node.Llink = temp;
            node.Rlink = temp.Rlink;
            temp.Rlink.Llink = node;
            temp.Rlink = node;
        }
    }

    void DeleteBeg(){
        if(head == null){
            System.out.println("DLL Empty");
        }else if(head.Rlink == null){
            System.out.println("Removed Element is : "+head.data);
            head = null;
            tail=null;
        }else{
            System.out.println("Removed Element is : "+head.data);
            head = head.Rlink;
            head.Llink = null;
        }
    }

    void DeleteEnd(){
        if(head == null){
            System.out.println("DLL Empty");
        }else if(head.Rlink == null){
            System.out.println("Removed Element is : "+head.data);
            head = null;
            tail=null;
        }else{
            System.out.println("Removed Element is : "+tail.data);
            tail = tail.Llink;
            tail.Rlink = null;
        }
    }

    void DeletePos(int pos){
        if(pos == 1){
            if(head == null){
                System.out.println("DLL Empty");
            }else if(head.Rlink == null){
                System.out.println("Removed Element is : "+head.data);
                head = null;
                tail=null;
            }else{
                System.out.println("Removed Element is : "+head.data);
                head = head.Rlink;
                head.Llink = null;
            }
        }else{
            temp = head;
            for(int i=1;i<pos-1;i++){
                temp = temp.Rlink;
            }
            temp.Rlink = temp.Rlink.Rlink;
            temp.Rlink.Llink = temp;
        }
    }
}


public class DLL {
    public static void main(String[] args) {
        DLLOperations D = new DLLOperations();
        D.InsertAtBeg(10);
        D.Display();
        D.InsertAtBeg(5);
        D.Display();
        D.InsertAtEnd(20);
        D.Display();
        D.InsertAtPos(3,15);
        D.Display();
        D.DeleteBeg();
        D.Display();
        D.DeletePos(2);
        D.Display();
        D.DeleteEnd();
        D.Display();

    }    
}
