import java.util.*;

public class FindAllLonelyNodes {
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static List<Integer> getLonelyNodes(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode[]> q = new LinkedList<>();
        q.add(new TreeNode[] {root,null});
        while(!q.isEmpty()){
            TreeNode arr[] = q.remove();
            TreeNode node = arr[0];
            TreeNode parent = arr[1];
            if(parent!=null &&(parent.left==node && parent.right==null || parent.left==null && parent.right==node)){
                ans.add(node.data);
            }
            if(node.left!=null){
                q.add(new TreeNode[]{node.left,node});
            }
            if(node.right!=null){
                q.add(new TreeNode[]{node.right,node});
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(11);
        root.left = new TreeNode(99);
        root.left.left = new TreeNode(77);
        root.left.left.left = new TreeNode(55);
        root.left.left.left.left = new TreeNode(33);
        root.right = new TreeNode(88);
        root.right.right = new TreeNode(66);
        root.right.right.right = new TreeNode(44);
        root.right.right.right.right = new TreeNode(22);
        System.out.println(getLonelyNodes(root));
    }
}
