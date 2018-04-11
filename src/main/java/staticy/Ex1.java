package staticy;

public class Ex1 {
  int x = 99;
  static int y = 100;
  public void showY() {
    System.out.println("y is " + y);
  }
  public static void showX() {
//    System.out.println("x is " + x);
  }
  public void addToX() {
    x = x + 1;
  }

  public static void main(String[] args) {
    Ex1 ex1 = new Ex1();
    ex1.showY();
//    System.out.println(Ex1.x);
    ex1.showX(); // translated by compiler to:
    Ex1.showX(); //

//    addToX();
  }
}