
// import
import CH12_P05_Interface.*;
import CH12_P04_RevisionJay.*;
class CH12_P05_InterfaceWithPkg{
	public static void main(String[] args) {
		
		Demo d = new Demo();	
		d.display();
	}
}
class Demo implements CH12_P05_demoInterface{

	public void display()
	{
		CH12_P04_Revision say = new CH12_P04_Revision();
		say.sop("Hiii Jay...");

		// code
	}
}