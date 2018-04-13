package equality;

public class SBequals {
  public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    System.out.println(sb1 == sb2);
    System.out.println(sb1.equals(sb2));
    System.out.println(sb1.toString().equals(sb2.toString()));
    System.out.println("----------------------");

    String s1 = new String("Hello");
    String s2 = new String("Hello");
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
    s1 = s1.intern();
    s2 = s2.intern();
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

    String s3 = "Hello";
    String s4 = "Hello";
    System.out.println(s3 == s4);
    System.out.println(s3.equals(s4));
  }
}
