/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
}
*/

class Solution {
    public Node createDLL(int arr[]) {
        // code here
        Node head = new Node(arr[0]);
       Node temp = head;
       for(int i =1;i<arr.length;i++) {
           Node n = new Node(arr[i]);
           n.prev = temp;
           temp.next = n;
           
           temp = n;
       }
       
       return head;
    }
}