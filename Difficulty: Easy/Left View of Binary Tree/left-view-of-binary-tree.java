/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        leftV(root, result , 0);
        return result;
    }
    
    public void leftV(Node root, ArrayList<Integer> result, int level){
        if(root==null) return;
        
        if(level== result.size()){
            result.add(root.data);
        }
        
        leftV(root.left, result, level+1);
        leftV(root.right, result, level+1);
    }
}