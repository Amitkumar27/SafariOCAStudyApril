package lambdas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//interface Criterion<E> {
//  boolean test(E s);
//}

// (String s) { return s.length() > 4; }
class LongStrings implements Predicate<String> {
  @Override
  public boolean test(String s) {
    return s.length() > 4;
  }
}

class LowerCaseStrings implements Predicate<String> {
  @Override
  public boolean test(String s) {
    return Character.isLowerCase(s.charAt(0));
  }
}

public class Ex1 {
  public static <E> List<E> filter(
      Iterable<E> in, Predicate<E> crit) {
    List<E> rv = new ArrayList<>();
//    in.get(0);
    for (E s : in) {
      if (crit.test(s)) {
        rv.add(s);
      }
    }
    return rv;
  }

  public static List<String> getStringsByCriterion(
      List<String> in, Predicate<String> crit) {
    List<String> rv = new ArrayList<>();
//    in.get(0);
    for (String s : in) {
      if (crit.test(s)) {
        rv.add(s);
      }
    }
    return rv;
  }

  public static List<String> getLongStrings(List<String> in, int threshold) {
    List<String> rv = new ArrayList<>();
    for (String s : in) {
      if (s.length() > threshold) {
        rv.add(s);
      }
    }
    return rv;
  }

  public static List<String> getStringsStartingWithCapitals(
      List<String> in) {
    List<String> rv = new ArrayList<>();
    for (String s : in) {
      if (Character.isUpperCase(s.charAt(0))) {
        rv.add(s);
      }
    }
    return rv;
  }

  public static <E> void showAll(Iterable<E> ls) {
    for (E s : ls) {
      System.out.println("> " + s);
    }
    System.out.println("-------------");
  }

  public static void main(String[] args) {
    List<String> ls = new ArrayList<>();
    ls.add("a");
    ls.add("ball");
    ls.add("Fred");
    ls.add("Jim");
    ls.add("Shiela");
    ls.add("van Rossum");
    ls.add("aardvark");

    showAll(ls);
    showAll(getLongStrings(ls, 4));
    showAll(getLongStrings(ls, 6));
    showAll(getStringsStartingWithCapitals(ls));
    System.out.println("using criterion...");
    showAll(getStringsByCriterion(ls, new LongStrings()));
    showAll(getStringsByCriterion(ls, new LowerCaseStrings()));
//    showAll(getStringsByCriterion(ls,
//        // Compiler MUST HAVE
//        // 1) an object!
//        // 2) that implements Predicate<String>
//        // new
//    /*class LongStrings implements Predicate<String> {*/
//      /*@Override
//      public boolean test*/(String s) -> {
//        return s.length() > 6;
//      }
//    /*}*/
//    ));

//    showAll(getStringsByCriterion(ls,
//        (String s) -> {
//          return s.length() > 6;
//        }
//    ));

//    showAll(getStringsByCriterion(ls,
//        (s) -> {
//          return s.length() > 6;
//        }
//    ));

//    showAll(getStringsByCriterion(ls,
//        s -> {
//          return s.length() > 6;
//        }
//    ));

    // "complicated" lambdas are legal, but probably poor style..???
//    showAll(getStringsByCriterion(ls,
//        s -> {
//          for (int i = 0; i < 10; i++) {
//            System.out.println("I is " + i);
//          }
//          return s.length() > 6;
//        }
//    ));

    showAll(getStringsByCriterion(ls, s -> s.length() > 6));
    showAll(getStringsByCriterion(ls, s -> s.length() < 7));

    LocalDate today = LocalDate.now();
    List<LocalDate> dates = Arrays.asList(
        today, today.plusDays(3), today.minusDays(7), today.plusDays(5)
    );

    showAll(filter(ls, s -> s.length() < 7));
    showAll(filter(dates, d -> d.isAfter(today)));
    showAll(filter(dates, (LocalDate d) -> d.isBefore(today)));
  }
}
