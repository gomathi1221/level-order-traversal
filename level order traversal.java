 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
        
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            TreeNode temp=q.poll();
            l.add(temp.val);
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        
        }
        res.add(l);

        }
        return res;
        
    }
}