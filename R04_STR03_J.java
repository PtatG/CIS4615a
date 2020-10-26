// CIS4615 HW2 - Rule 04: STR03-J
// compliant solution

BigInteger x = new BigInteger("530500452766");
String s = x.toString();  // Valid character data
byte[] byteArray = s.getBytes();
String ns = new String(byteArray);
x = new BigInteger(ns);
