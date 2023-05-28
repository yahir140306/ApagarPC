#include <iostream>
#include <stdlib.h>
using namespace std;

int main()
{
    char ch;
    cout << "Pon la tecla [Y]";
    cin >> ch;
    if (ch == 'y' || ch == 'Y')
    {
        system("C:\\WINDOWS\\System32\\shutdown/s");
        return 0;
    }
}