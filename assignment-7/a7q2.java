abstract class animals {
String breed,color,name;
abstract void eat();
void speak() {
System.out.println("barking");
}
}

class dog extends animals {
dog(String breed,String color,String name){
this.breed=breed;
this.color=color;
this.name=name;
}
void me() {
System.out.println("Name is: "+name);
System.out.println("Breed is: "+breed);
System.out.println("Color is: "+color);
}

void eat() {
System.out.println("i eat bone");
}
}

public class a7q2 {

public static void main(String[] args) {
animals an=new dog("doberman","black","chiku");
dog d=new dog("doberman","black","chiku");
d.me();
an.eat();
an.speak();
}
}