class CH06_P07_Inheritance{
	public static void main(String[] args) {
	
		 Book b = new Book(100,5);
		 b.cropPage(10);
	}
}
// Page -> Book
/* properties 
	size, margin,
----------
action
	crop(int r)
/**
	
*/
 class Page{

 	int size,margin;


 	void cropPage(int x)
 	{
 		if(size<x)
 		{
 			System.out.println("plz Enter a valid choice..");
 			return;
 		}

 		size = size - x;
 		System.out.println("New Size : "+size);
 	}
}

class Book extends Page{

		public Book(int x,int y)
		{
				super.size = x;
				super.margin = y;			
		}
}