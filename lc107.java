/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<List<Integer>>();  
          
        if(root == null) return traversal;  
          
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();  
        queue.add(root);  
        while(!queue.isEmpty()) {  
            int levelLen = queue.size();  
            List<Integer> levelNodes = new ArrayList<Integer>();              
            for (int i = 0; i < levelLen; i++) {  
                TreeNode node = queue.removeFirst();  
                levelNodes.add(node.val);  
                if(node.left != null) queue.add(node.left);  
                if(node.right != null) queue.add(node.right);  
            }  
            traversal.add(0, levelNodes);    
        }  
        return traversal;  
    }
}