abstract class vehicle {

  public abstract void start();
   public void stop() {

   System.out.println("stop function in abstract class");

}
}

class twowheeler extends vehicle {

  public void start() {

    System.out.println("start function in twowheeler");
}
  public void stop() {
System.out.println("stop function in twowheeler");
}
}

class fourwheeler extends vehicle {
 
   public void start() {
  System.out.println("start function in fourwheeler");
}
public void stop() {
  System.out.println("stop function in fourwheeler");
}
}

public class a5q4 {
public static void main(String args[]) {
  vehicle obj1 = new twowheeler();
  vehicle obj2 = new fourwheeler();
   
  obj1.start();
obj1.stop();
obj2.start();
obj2.stop();

}
}