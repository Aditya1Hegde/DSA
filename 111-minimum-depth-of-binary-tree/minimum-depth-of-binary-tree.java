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
    public int minDepth(TreeNode root) {
        return Depth(root);
    }
    public int Depth(TreeNode node){
        if(node==null){
            return 0;
        }
        if(node.left==null){
            return 1+Depth(node.right);
        }
        if(node.right==null){
            return 1+Depth(node.left);
        }
        return Math.min(Depth(node.left),Depth(node.right))+1;
    }
}