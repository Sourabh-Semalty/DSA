#include <iostream>
#include <vector>
using namespace std;

int main(int argc, char const *argv[])
{
    vector<int> nums = {1, 1, 2, 2, 2, 2};
    int n = nums.size();

    int freq = 0;
    int ans = 0;
    for (int i = 0; i < n; i++)
    {
        if (freq == 0)
            ans = nums[i];

        if(ans == nums[i]) freq++;
        else freq--;
    }

    cout << "The majority element is " << ans;
}