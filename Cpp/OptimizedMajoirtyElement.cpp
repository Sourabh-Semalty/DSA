#include <iostream>
#include <vector>
#include<algorithm>
using namespace std;

int main(int argc, char const *argv[])
{
    vector<int> nums = {1, 1, 2 , 2, 2, 2};
    int n = nums.size();
    // sort
    sort(nums.begin(), nums.end());

    int freq = 1, ans = nums[0];
    for (int i = 1; i < n; i++)
    {
        if(nums[i] == nums[i - 1]) {
            freq++;
        } else {
            freq = 1;
        }

        if(freq > n/2)  {
            ans = nums[i];
        }
    }

    cout << "The Majority element is " << ans;
    return 0;
}
