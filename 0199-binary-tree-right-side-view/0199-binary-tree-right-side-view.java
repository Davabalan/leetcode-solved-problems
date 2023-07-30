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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int level = 0;
            int levelSize = q.size();
            for(int i = 0; i < levelSize; i++) {
                TreeNode temp = q.remove();
                level = (i == levelSize - 1) ? temp.val : 0;
                if(temp.left != null) {
                    q.add(temp.left);
                }
                if(temp.right != null) {
                    q.add(temp.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}