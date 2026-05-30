/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        
        Node left = head;
        Node right = getRight(head);
        
        while(left!= right && right != left.prev) {
            int sum = left.data + right.data; 
            if(sum == target) {
                ArrayList<Integer> list = new ArrayList<>(List.of(left.data, right.data));
                pairs.add(list);
                left = left.next;
                right = right.prev;
            } else if(sum > target) {
                right = right.prev;
            } else {
                left = left.next;
            }
        }
        
        return pairs;
        
    }
    
    public static Node getRight(Node head){
        Node temp = head;
        while(temp.next!= null) {
            temp = temp.next;
        }
        
        return temp;
    }
}
