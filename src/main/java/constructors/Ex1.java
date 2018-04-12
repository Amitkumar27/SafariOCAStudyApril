package constructors;

class Base {
  private int value;
  public Base() {
    this(3);
  }
  public Base(int x) { // l2
//    super(); // calls explictly zero arg constructor of Object
    this.value = x;
  }
}
class Sub extends Base { // l1
  // Zero constructors, implies DEFAULT CONSTRUCTOR
}



public class Ex1 {
  public static void main(String[] args) {
    Base b = new Sub(); // l3
  }
}
