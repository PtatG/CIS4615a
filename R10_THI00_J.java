// CIS4615 HW2 - Rule 10: THI00-J
// noncompliant code example

public final class Foo implements Runnable {
  @Override public void run() {
    // ...
  }

  public static void main(String[] args) {
    Foo foo = new Foo();
    new Thread(foo).run();
  }
}
