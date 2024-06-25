/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bstToGst(TreeNode root) {
        int nodeSum=0;
        Stack<TreeNode> st = new Stack<>();
        TreeNode node=root;
        
        while(!st.empty() || node != null){
            while(node != null){
                st.push(node);
                node=node.right;
            }
            
            node=st.pop();
            
            nodeSum += node.val;
            node.val=nodeSum;
            
            node = node.left;
        }
        return root;
    }
}