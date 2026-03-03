/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Node last = null;
        Node current = head;
        
        while(current!=null){
            last = current.prev;
            current.prev = current.next;
            current.next = last;
            
            current = current.prev;
        }
        
       if(last!=null) head = last.prev;
       
       return head;
    }
}