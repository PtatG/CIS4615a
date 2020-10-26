// CIS4615 HW2 - Rule 01: DCL00-J
// noncompliant code example

public class Cycle {
  private final int balance;
  private static final Cycle c = new Cycle();
  private static final int deposit = (int) (Math.random() * 100); // Random deposit

  public Cycle() {
    balance = deposit - 10; // Subtract processing fee
  }

  public static void main(String[] args) {
    System.out.println("The account balance is: " + c.balance);
  }
}
