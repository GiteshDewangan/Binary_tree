class Solution {
public:
    void helper(TreeNode* root, vector<int> v, vector<vector<int>>& ans, int sum) {
        if (root == NULL) return;
        int  a = (root->val);
        v.push_back(a);

        if (root->left == NULL && root->right == NULL) { 
            if(sum ==a ){
        
            ans.push_back(v);
            return;
            }
        }

        helper(root->left, v, ans, sum-a );
        helper(root->right, v, ans, sum-a);
    }

    vector<vector<int>> pathSum(TreeNode* root, int targetSum) {
       vector<vector<int>> ans;
       vector<int> v;
    
       helper(root,v,ans,targetSum);
       return ans;
    }
};
