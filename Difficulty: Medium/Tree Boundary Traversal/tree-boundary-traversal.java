/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    
    static void leftBoundary(Node root, List<Integer> ans){
        if(root == null) return;
        
        if(root.left == null && root.right==null) return;
        
        ans.add(root.data);
        
        if(root.left!=null){
            leftBoundary(root.left, ans);
        } else{
            leftBoundary(root.right, ans);
        }
    }
    
    static void leafBoundary(Node root, List<Integer> ans){
        if(root == null) return;
        
        if(root.left==null && root.right==null){
            ans.add(root.data);
            return;
        }
        
        leafBoundary(root.left, ans);
        leafBoundary(root.right, ans);
    }
    
    static void rightBoundary(Node root, List<Integer> ans){
        if(root==null) return;
        
        if(root.left==null && root.right==null) return;
        
        if(root.right!=null){
            rightBoundary(root.right, ans);
        }else{
            rightBoundary(root.left, ans);
        }
        ans.add(root.data);
    }
    
      
    
    
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        if (root == null) return ans;
        
        ans.add(root.data);
        
        leftBoundary(root.left, ans);
        leafBoundary(root.left, ans);
        leafBoundary(root.right, ans);
        rightBoundary(root.right, ans);
        
        return ans;
    }
}