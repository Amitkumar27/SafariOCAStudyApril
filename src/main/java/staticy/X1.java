package staticy;

public class X1 {
    int x = 99;
    void blah() {
      System.out.println(" value of x is " + this.x);
      System.out.println(" value of x is " + x); // same as above!!!
    }
    static void doStuff(X1 anX) {
      // this.x !!! NO this in a static method...
      System.out.println("value of x is " + anX.x);
    }

  public static void main(String[] args) {
    X1 anX = new X1();
    X1.doStuff(anX);
//    X1.blah(); // NOT ALLOWED would not provide "this"
    anX.blah(); // this, inside the method will be a reference to anX...
  }
}
