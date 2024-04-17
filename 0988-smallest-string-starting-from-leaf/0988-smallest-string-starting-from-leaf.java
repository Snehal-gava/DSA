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
    String smallestString="";
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,"");
        return smallestString;
    }
    void dfs(TreeNode root, String currString){
        if(root == null){
            return;
        }
        
        currString=(char)(root.val+'a')+currString;
        
        if(root.left == null && root.right == null){
            if(smallestString.isEmpty() || smallestString.compareTo(currString)>0){
                smallestString=currString;
            }
        }
        
        if(root.left != null){
            dfs(root.left,currString);
        }
        
        if(root.right!= null){
            dfs(root.right,currString);
        }
    }
}