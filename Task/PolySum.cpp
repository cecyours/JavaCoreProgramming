#include<iostream>
using namespace std;
class Code{
public:
	void sum(int a,int b) // method 1
	{
		cout<<a<<" + "<<b<<" = "<<a+b<<endl;

	}
	void sum(int a,int b,int c) //method 2
	{
		cout<<a<<" + "<<b<<" + "<<c<<" = "<<a+b+c<<endl;
	}
};
int main()
{
 	Code c;
 	c.sum(10,20); //method 1	
 	c.sum(5,6,7); //method 2
	return 0;
}