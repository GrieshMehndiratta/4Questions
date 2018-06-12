
class Animal
{
	String breed;
	String Color; 
    protected void Speak() {
    	System.out.println("From Animal Speak()"); 
    	}
}
 
class Dog extends Animal
{
    public void Speak() { 
    	System.out.println("From Dog Speak()");}
     
}

class Cat extends Animal
{
    public void Speak() { 
    	System.out.println("From Cat Speak()");}
     
}

public class Override {
	public static void main(String[] args)
    {
        Animal obj1 = new Animal();
        obj1.Speak();
        Animal obj2 = new Dog();
        obj2.Speak();
        Animal obj3 = new Cat();
        obj3.Speak();
    }
}
