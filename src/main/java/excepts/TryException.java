package excepts;

import java.io.IOException;

public class TryException {
  public void doStuff() throws IOException {
    if (Math.random() > 0.5) throw new IOException();
  }

  public static void main(String[] args) {
    new TryException().doStuff();
  }
}
