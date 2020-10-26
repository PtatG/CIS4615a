// CIS4615 HW2 - Rule 04: STR03-J
// noncompliant code example

BigInteger x = new BigInteger("530500452766");
byte[] byteArray = x.toByteArray();
String s = new String(byteArray);
byteArray = s.getBytes();
x = new BigInteger(byteArray);
