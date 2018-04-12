package excepts;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class TryException {
  public void doStuff() throws Exception {
    if (Math.random() > 0.5) throw new IOException();
  }

  public static void main(String[] args) {
    try {
      new TryException().doStuff();
    } catch (Exception ex) {

    }
  }
}
