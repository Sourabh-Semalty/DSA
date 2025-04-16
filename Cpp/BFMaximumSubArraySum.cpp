#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
    int arr[] = {3, -4, 5, 4, -1, -7, -8};
    int n = 5;
    int maxSum = 0;
    for (int start = 0; start < n; start++)
    {
        int currentSum = 0;
        for (int end = start; end < n; end++)
        {
            currentSum += arr[end];
            maxSum = max(currentSum,maxSum);   
        }
    }

    cout << maxSum;

    return 0;
}
