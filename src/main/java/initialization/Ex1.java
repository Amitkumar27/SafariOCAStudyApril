package initialization;

public class Ex1 {
  public void q10() {
    int x;
//    x = 99;
    try {
      x = 99;
    } catch (Throwable t) {

    } finally  {
      x = 100;
    }
//    double y = Math.random();
//    if (y >= 0) {
//      x = 99;
//    } else {
//      x = 100;
//    }
    System.out.println(x);
    /*
    What is the result?
    A) 0
    B) Random number printed
    C) Exception at runtime
    D) Compilation fails
     */
  }

}
