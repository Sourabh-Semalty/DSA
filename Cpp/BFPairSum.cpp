#include <iostream>
#include <vector>
using namespace std;

vector<int> pairSumOptimized(vector<int> nums, int target)
{
    int n = nums.size();
    vector<int> ans;
    int i = 0;
    int j = n - 1;
    while (i < j)
    {
        int pairSum = nums[i] + nums[j];
        if (pairSum == target)
        {
            ans.push_back(i);
            ans.push_back(j);
            return ans;
        }
        if (pairSum > target)
            j--;
        else if (pairSum < target)
            i++;
    }
    return ans;
}

vector<int> pairSum(vector<int> nums, int target)
{
    int n = nums.size();
    vector<int> ans;
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (nums[i] + nums[j] == target)
            {
                ans.push_back(i);
                ans.push_back(j);
                return ans;
            }
        }
    }
    return ans;
}
int main(int argc, char const *argv[])
{
    vector<int> nums = {2, 7, 11, 15};
    int target = 9;
    vector<int> ans = pairSum(nums, target);
    cout << ans[0] << ", " << ans[1] <<endl;

    vector<int> ans1 = pairSumOptimized(nums, target);
    cout << ans1[0] << "," << ans[1];
    return 0;
}
