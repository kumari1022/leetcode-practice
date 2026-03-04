import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>>res=new ArrayList<>();
        if(root==null)
            return res;

        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>level=new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                level.add(temp.val);

                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
            }

            res.add(level);
        }
        return res;
    }
}