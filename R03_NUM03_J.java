// CIS4615 HW2 - Rule 03: NUM03-J
// noncompliant code example

public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt();
}
