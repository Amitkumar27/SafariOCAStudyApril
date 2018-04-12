package constructors.constr2;

class Base {
  private int value;
  public Base() {
    // cannot have this and super
    // this OR super must be "first thing"
//    this(3); // l1
//    super(); // l3
  }

  public Base(int x) { // l2
    this.value = x;
  }
}

public class Ex2 {
}
