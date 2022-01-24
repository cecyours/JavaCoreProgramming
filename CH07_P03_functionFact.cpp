
#include<iostream>
using namespace std;
/**
	when you are using function in class it calls method.
	when you define function outside the class or without class it called function.
*/
int fact(int n)
{
	int f = 1;
	while(n>0)
	{
		// cout<<" "<<n<<" x "<<f<<" = ";
		f = f*n;
		// cout<<f<<endl;
		n--;
	}
	return f;
}
int main()
{
	cout<<"fact is : "<<fact(5);
	return 0;
}