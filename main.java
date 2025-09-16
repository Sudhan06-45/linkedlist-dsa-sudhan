package SLL;

public class main {
    
    public static void main(String[] args) {
        
        linkedlistall list = new linkedlistall();
        
        // Insertions
        System.out.println("Linked List after Insertions:");
        System.out.println("Insertion at begin:");
        list.ins_beg(1);
        list.ins_beg(0);
        list.traverse();
        System.out.println("Insertion at end:");
        list.ins_end(2);
        list .ins_end(4);
        list.traverse();
        System.out.println("Insertion at specific position:");
        list.ins_specific(3, 3);
        list.traverse();
        // System.out.println(list.head.data); // Output: 0

        // Deletions
        System.out.println("Linked List after Deletions:");
        System.out.println("Deletion at begin:");
        list.del_beg();
        list.traverse();

        System.out.println("Deletion at end:");
        list.del_end();
        list.traverse();

        System.out.println("Deletion at specific position:");
        list.del_specific(1);
        list.traverse();

        System.out.println("Search the element");
        list.search(3);

    }
}
