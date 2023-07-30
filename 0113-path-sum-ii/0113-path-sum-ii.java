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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       // List<Integer> path = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(root, targetSum, new ArrayList<Integer>(), ans);
        return ans;
    }

    public void solve(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> ans) {
        if(root == null) {
            return;
        }
        path.add(root.val);
        if(targetSum == root.val && root.left == null && root.right == null) {
            //ans.add(path);
            ans.add(new ArrayList<Integer>(path));
        }
        solve(root.left, targetSum - root.val, path, ans);
        solve(root.right, targetSum - root.val, path, ans);
        path.remove(path.size() - 1);
    }
}