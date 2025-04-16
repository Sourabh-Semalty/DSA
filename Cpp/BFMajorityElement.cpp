#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
    int nums[] = {1, 1, 2, 2, 2};
    int length = 5;
    cout << length;
    int value = nums[0];
    for (int i = 0; i < length; i++)
    {
        int frequency = 0;

        for (int j = 0; j < length; j++)
        {
            if (nums[i] == nums[j])
                frequency++;
        }
        if (frequency > length / 2)
            value = nums[i];
    }

    cout << "The Majority element is " << value;

    return 0;
}
