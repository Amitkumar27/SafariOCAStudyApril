package finalstuff;

public class Ex1 {
  private final int x;
  public Ex1() {
    x = 99;
  }
  public Ex1(int y) {
    this();
//    x = 100;
  }
  public static void main(String[] args) {
    final StringBuilder sb = new StringBuilder("Hello");
    sb.append(" world!");
    System.out.println(sb);
//    sb = new StringBuilder("oops");
    System.out.println("-----------------");
    final String s = new String("Hello");
    /*s = */s.concat(" world!");
    System.out.println(s);



  }
}
