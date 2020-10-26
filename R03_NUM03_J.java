// CIS4615 HW2 - Rule 03: NUM03-J
// compliant solution

public static long getInteger(DataInputStream is) throws IOException {
  return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}
