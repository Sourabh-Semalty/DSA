#include<iostream>
#include<vector>
using namespace std;

bool searchValue(vector<int> &vec, int value) {
    cout << "Vector capacity: " << vec.capacity() << endl;

    for (int i : vec) {
        if (i == value) return true;
    }
    return false;
}

int main(int argc, char const *argv[])
{
    vector<int> vec = {1, 2, 3, 4, 5};
    int valueToSearch = 3;
    bool isFound = searchValue(vec, valueToSearch);

    cout << "Value found: " << boolalpha << isFound << endl;
    return 0;
}
