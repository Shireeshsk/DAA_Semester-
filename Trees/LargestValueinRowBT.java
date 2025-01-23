package Trees;
import java.util.*;
public class LargestValueinRowBT {
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }

    public static List<Integer> largest(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            int max = Integer.MIN_VALUE;
            int s = q.size();
            for(int i = 0;i<s;i++){
                TreeNode curr = q.remove();
                max = Math.max(curr.data,max);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            list.add(max);
        }
        return list;
    }
}
