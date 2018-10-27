class animal {
String breed;
String color;
void speak() {
  System.out.println("growl");
}
}
class dog extends animal {
  String breed;
  String color;

  void speak() {
  System.out.println("bark");
}
}

class cat extends animal {
String breed;
String color;

  void speak() {
  System.out.println("meoww");
}
}

public class a5q2 {
public static void main(String args[]) {
 animal obj1 = new animal();
dog obj2 = new dog();
cat obj3 = new cat();

obj1.speak();
obj2.speak();
obj3.speak();
}
}