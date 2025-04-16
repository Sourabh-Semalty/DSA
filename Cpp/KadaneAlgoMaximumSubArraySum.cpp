#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
    int arr[] = {3, -4, 5, 4, -1, 7, -8};
    int n = 5;
    int maxSum = 0;
    int currentSum = 0;
    for (int start = 0; start < n; start++)
    {
        currentSum += arr[start];
        maxSum = max(currentSum,maxSum);
        if(currentSum < 0) currentSum = 0;
    }
    
    cout << maxSum;

    return 0;
}
