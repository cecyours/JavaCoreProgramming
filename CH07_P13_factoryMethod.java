class CH07_P13_factoryMethod  {
	public static void main(String[] args) {

		Product p1 = new Product("keyboard",100);
		Product p2 = new Product("mouse",10);

		Product p3 = p1.join(p2);
		p1.display();
		p2.display();
		p3.display();
	}
}
class Product{

	String name;
	float price;

	public Product(String name,float price)
	{
		this.name = name;
		this.price = price;
	}
	/*factory method : it is used to create object of same class in which it written.*/
	Product join(Product another)
	{
		String name = this.name+" "+another.name;
		Float price = this.price+another.price;
		
		return new Product(name,price);
	}
	void display()
	{
		System.out.println("product : "+name+"\t Price : "+price);
	}

}