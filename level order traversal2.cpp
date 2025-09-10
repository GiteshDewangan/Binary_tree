class Solution {
public:
    int levels(TreeNode* root){
        if (root == NULL) return 0;
        return 1 + max(levels(root->left), levels(root->right));
    }

    void lOrder(TreeNode* root, vector<vector<int>>& ans, int level){
        if (root == NULL) return;
        //if (level >= (int)ans.size()) ans.resize(level + 1);
        ans[level].push_back(root->val);
        lOrder(root->left, ans, level + 1);
        lOrder(root->right, ans, level + 1);
    }

    vector<vector<int>> levelOrder(TreeNode* root){
        vector<vector<int>> ans;
        lOrder(root, ans, 0);
        return ans;
    }
};
