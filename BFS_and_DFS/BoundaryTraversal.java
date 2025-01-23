import java.util.*;
public class BoundaryTraversal {
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }

    public static boolean isLeaf(TreeNode root){
        if(root.left==null && root.right==null){
            return true;
        }
        return false;
    }

    public static void leftBoundary(TreeNode root,List<Integer> ans){
        TreeNode curr = root;
        while(curr!=null){
            if(!isLeaf(curr)){
                ans.add(curr.data);
            }
            if(curr.left!=null){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
    }

    public static void rightBoundary(TreeNode root,List<Integer> res){
        TreeNode curr = root;
        List<Integer> ans = new ArrayList<>();
        while(curr!=null){
            if(!isLeaf(curr)){
                ans.add(curr.data);
            }
            if(curr.right!=null){
                curr = curr.right;
            }
            else{
                curr = curr.left;
            }
        }
        for(int i = ans.size()-1;i>=0;i--){
            res.add(ans.get(i));
        }
    }

    public static void leaf(TreeNode root,List<Integer> ans){
        if(isLeaf(root)){
            ans.add(root.data);
            return;
        }
        if(root.left!=null){
            leaf(root.left,ans);
        }
        if(root.right!=null){
            leaf(root.right,ans);
        }
    }

    public static List<Integer> boundary(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        if(!isLeaf(root)){
            ans.add(root.data);
        }

        leftBoundary(root.left, ans);
        leaf(root,ans);
        rightBoundary(root.right, ans);
        return ans;
    }
}
