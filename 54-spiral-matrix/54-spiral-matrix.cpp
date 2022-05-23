class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int n = matrix.size();
    int m = matrix[0].size();
    int top = 0, left = 0;
    int down= n - 1, right = m - 1;
    vector<int> ans;
    int elements = n * m;
    int count = 0;
    while(top <= down && left <= right)
    {
        for(int i = left; i <= right; i++)
        {
            ans.push_back(matrix[top][i]);
            count++;
            if(count > elements - 1)
                return ans;
        }
        top++;
        for(int i = top; i <= down; i++)
        {
            ans.push_back(matrix[i][right]);
            count++;
            if(count > elements - 1)
                return ans;
        }
        right--;
        for(int i = right; i >= left; i--)
        {
            ans.push_back(matrix[down][i]);
            count++;
            if(count > elements - 1)
                return ans;
        }
        down--;
        for(int i = down; i >= top; i--)
        {
            ans.push_back(matrix[i][left]);
            count++;
            if(count > elements - 1)
                return ans;
        }
        left++;
    }
    return ans;
}
    };
