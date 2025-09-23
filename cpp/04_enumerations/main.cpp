#include <iostream>
#include <string>

using namespace std;

int main()
{
  enum days_of_week
  {
    monday = 'M',
    tuesday = 'T',
    friday = 'F'
  };

  days_of_week day = tuesday;
  cout << static_cast<char>(day) << endl;
  cout << static_cast<int>(day) << endl;
  return 0;
}

// Output:
// T
// 84