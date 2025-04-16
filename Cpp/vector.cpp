#include <iostream>
#include <vector>
using namespace std;

int main(int argc, char const *argv[])
{
    vector<int> vec(5, 0);
    for (int i : vec)
    {
        cout<< i;
    }
    return 0;
}
