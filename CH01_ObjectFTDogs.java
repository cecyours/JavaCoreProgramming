
/*
    NOTE :
    class name is same as file name if you want declare class as public or generate .class file.
*/ 
public class CH01_ObjectFTDogs{

    public static void main(String[] args) {
        
        System.out.println("Hello World..."+args[0]);

        /**
         * for(i=0;i<5;i++)
         * 
        */
        
        for(String me:args)
        {
            System.out.println("Data : "+me);
        }
       
        Dog d = new Dog();

        d.color = "red";
        d.age = 2;
        d.name ="vodaphone vala Kutta";
        
            d.bark();
        System.out.println("name : "+d.name);
        System.out.println("color : "+d.color);
        System.out.println("age :"+d.age);
        // className objectName = new ClassName();
    }
}
// class = members(variable):private + fuction(method):public

/**
 * properity : variable
 * action : method
 * 
*/
class Dog{
    String color;
    int age;
    String name;

    void bark()
    {
        System.out.println(name+" is barking....\n");
    }
} 