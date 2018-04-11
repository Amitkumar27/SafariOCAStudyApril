package polymorph;

public class Base {
  void doBaseStuff() {
    System.out.println("doBaseStuff");
  }
}

class Unrelated {
  void doBaseStuff() {
    System.out.println("Really???");
  }
}
class MyRunnableBase extends Base implements Runnable {

  @Override
  public void run() {
    System.out.println("I'm running!!!");
  }
}
final class Sub extends Base {
  void doBaseStuff() {
    System.out.println("doSubStuff");
  }
  void doOtherStuff() {
    System.out.println("doOtherStuff");
  }

  public static void main(String[] args) {
    Base b = new Sub();

//    b = new Base();

    ((Sub)b).doOtherStuff();

//    Base b1 = (Base)(new Unrelated());
//
//    String s = (String)(new StringBuilder("Hello"));
    b = new MyRunnableBase();
    ((Runnable)b).run();

    Sub s = new Sub();
//    ((Runnable)s).run(); // fails if Sub is final...
   }
}


