package Trees;
import java.util.*;

public class AverageOfLevelsBT {
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }

    public static List<Integer> Avgoflevels(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            int s = q.size();
            int sum = 0;
            for(int i = 0;i<s;i++){
                TreeNode curr = q.remove();
                sum += curr.data;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            list.add(sum/s);
        }
        return list;
    }
}
