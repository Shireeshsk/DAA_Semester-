package Trees;

public class BalancedBinaryTree {
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }

    public static boolean isBalanecd(TreeNode root){
        return (height(root)==-1)?false:true;
    }

    public static int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int lh = height(node.left);
        int rh = height(node.right);
        if(lh==-1 || rh == -1){
            return -1;
        }
        if(Math.abs(lh-rh)>1){
            return -1;
        }
        return Math.max(lh,rh)+1;
    }
}
