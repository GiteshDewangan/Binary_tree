class Solution {
    public:
    void helper(TreeNode* root,int& cnt,  int targetSum){
        
        if(root==NULL) return ;
        int a = root->val;
    
        if(targetSum==a){
            cnt++;
            return;
        }

        helper(root->left, cnt , targetSum-a);
        helper(root->right, cnt , targetSum-a);

    }
    void ans(TreeNode* root,int& cnt,  int targetSum){
        if(root==NULL) return;
        helper(root, cnt , targetSum);
        ans(root->left,cnt,targetSum);
        ans(root->right,cnt,targetSum);

        
    }



    int pathSum(TreeNode* root, int targetSum) {
        int cnt= 0;
    
        ans(root, cnt , targetSum);
        return cnt;



        
    }
};
