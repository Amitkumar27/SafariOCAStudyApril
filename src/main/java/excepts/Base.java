package excepts;

import java.io.IOException;
import java.sql.SQLException;

class MyException extends Exception {}
class Base {
  //                this vvvvvvvvvvvvvvvvv would also fix the problem below!
  public void doStuff() /*throws Exception*/ { // l3
    if (Math.random() > 0.5) throw new RuntimeException();
  }
  public void doTwo() {}
}
class Sub extends Base {
//                        vvvvvvvvvvvvvv Not allowed because base
//  method does NOT throw this...
  public void doStuff() throws MyException { // l2
    if (Math.random() > 0.5) throw new MyException(); // l1
  }
  // no surprises!!! Liskov substitution rules must not be less accessible
  // than parent
//  protected void doTwo() {}
}
