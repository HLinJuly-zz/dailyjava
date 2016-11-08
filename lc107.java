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
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (queue.size()!=0){
            List<Integer> alist = new ArrayList<Integer>();
            for (TreeNode child : queue){
                alist.add(child.val);
                
            }
            list.add(new ArrayList<Integer>(alist));
            Queue<TreeNode> queue2 = queue;
            queue = new LinkedList<TreeNode>();
            for(TreeNode child:queue2){
                if(child.left!=null)
                    queue.add(child.left);
                if(child.right!=null)
                    queue.add(child.right);
            }
        
        }
        return list;
        
    }
}