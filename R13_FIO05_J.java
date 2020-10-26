// CIS4615 HW2 - Rule 13: FIO05-J
// compliant solution

final class Wrap {
  private char[] dataArray;

  public Wrap() {
    dataArray = new char[10];
    // Initialize
  }

  public CharBuffer getBufferCopy() {
    return CharBuffer.wrap(dataArray).asReadOnlyBuffer();
  }
}
