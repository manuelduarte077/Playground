#include <iostream>
using namespace std;

// Mediante una funcion obtener el factorial de un numero dado por el usuario
// 5!--->120=120
int Factorial(int num)
{
	int i = num - 1; // 4//num*i
	
	while (i > 0)
	{
		num = num * i; // 5*4=20//20*3=60//60*2=120//120*1=120
		i--;
	}
	return num; // 120
}

int main()
{
	int num = 0;

	cout << "Ingrese numero\n";
	cin >> num;
	cout << Factorial(num);

	return 0;
}
