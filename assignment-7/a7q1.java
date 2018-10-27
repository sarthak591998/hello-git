interface Animals {
void speak();
void eat();
}

class Dog implements Animals{
public void speak() {
System.out.println("I bark");
}
public void eat() {
System.out.println("I eat bones");
}
}

class cat implements Animals{
public void speak() {
System.out.println("I meow");
}
public void eat() {
System.out.println("I eat vegetables");
}
}

public class a7q1 {
public static void main(String[] args) {

Dog d=new Dog();
d.speak();
d.eat();
cat c=new cat();
c.speak();
c.eat();
}
}
 