	#include<iostream>
	using namespace std;
	class A{

		public :
			A()
			{
				cout<<"Class A\n";
			}
	};
	class B:public A{

		public :
			B()
			{
				cout<<"Class B\n";
			}
	};
	class C: public A{

		public :
			C()
			{
				cout<<"Class C\n";
			}
	};

	int main()
	{
	 	
	 	B obj1;
	 	cout<<" - -- -- - \n";
	 	C obj2;
		return 0;
	}