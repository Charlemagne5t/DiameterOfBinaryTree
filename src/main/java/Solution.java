public class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfsH(root);
        dfs(root);
        return max;
    }
    int dfsH(TreeNode root){
        if(root == null){
            return 0;
        }
        root.val = 0;
        root.val = 1 + Math. max(dfsH(root.left), dfsH(root.right));

        return root.val;
    }
    void dfs(TreeNode root){
        if(root == null){
            return;
        }
        max = Math.max(max, (root.left == null ? 0 : root.left.val) + (root.right == null ? 0 : root.right.val));
        dfs(root.left);
        dfs(root.right);

    }

}
