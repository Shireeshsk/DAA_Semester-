package Trees;

public class SymmetricTrees {
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }

    public static boolean isSymmetric(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right == null){
            return false;
        }
        if(left.data !=right.data){
            return false;
        }
        return isSymmetric(left.right,right.left) && isSymmetric(left.left, right.right);
    }

    public static boolean sym(TreeNode root){
        if(root == null){
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

}
