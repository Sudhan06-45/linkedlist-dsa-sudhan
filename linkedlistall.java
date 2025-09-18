package SLL;

public class linkedlistall {
    
    public Node head;

    // Traverse the linked list
    public void traverse(){
        Node curr = head;
        while(curr!= null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    //Insert at the beginning
    public void ins_beg(int data){
        Node newNode = new Node(data);
        if(head == null){
            head =newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //Insert at the end
    public void ins_end(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node curr = head;
        while(curr.next!= null){
            curr = curr.next;
        }

        curr.next = newNode;
    }

    //Insert at a given position
    public void ins_specific(int data, int pos){
        Node newNode = new Node(data);

        if (head == null || pos == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
         
        Node curr = head;
        int count = 0;
        while(curr!=null && count<pos -1 ){
            curr = curr.next;
            count++;
        }
        if(curr == null){
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }


// Deletions
    // Delete from the beginning

    public void del_beg(){
        if(head == null){
            System.out.println("List is empty");
            return; 
        }
        head = head.next;    
    }

    // Delete from the end
    public void del_end(){
        if(head == null){
            System.out.println("List is empty");
            return; 
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node curr = head;
        Node prev = null;

        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }

        if (prev != null) {
            prev.next = null;
        }
}

    // Delete from a specific position
    public void del_specific(int pos){
        if(head == null){
            System.out.println("List is empty");
            return; 
        }

        if(pos == 0){
            head = head.next;
            return;
        }

        Node curr = head;
        Node prev = null;
        int count = 0;

        while(curr != null && count < pos){
            prev = curr;
            curr = curr.next;
            count++;
        }

        if (prev == null || curr == null) {
            System.out.println("Position out of bounds");
            return;
        }

        prev.next = curr.next;

    }

    // Search for an element
    public void search(int key){
        if(head == null){
            System.out.println("List is empty");
            return; 
        }
        if(head.next == null && head.data == key){
            System.out.println("Element found at position 0");
            return;
        }

        Node curr = head;
        int pos = 0;

        while(curr!= null){
            if (curr.data == key){
                System.out.println("Element found at position " + pos);
                return;
            } 
                curr = curr.next;
                pos++;
        
        }
        System.out.println("Element not found in the list");
    }
}

//hii hello gjgbjk
