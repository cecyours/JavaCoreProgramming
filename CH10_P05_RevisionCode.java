

class Home{
	public static void main(String[] args) throws CloneNotSupportedException {
	
		Book python = new Book("Book By Gk",488.34);	

		Book java = (Book)python.clone();

		System.out.println("Python : "+python.name+"\t"+python.price);
		System.out.println("  java : "+java.name+"\t"+java.price);

	}
}

class Book{

	String name;
	double price;

	public Book(String name,double price)
	{
		this.name = name;
		this.price = price;
	}
	protected Object clone() throws CloneNotSupportedException
	{
		
			return this;
	}

}