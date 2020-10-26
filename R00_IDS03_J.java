// CIS4615 HW2 - Rule 00: IDS03-J
// noncompliant code example

if (loginSuccessful) {
  logger.severe("User login succeeded for: " + username);
} else {
  logger.severe("User login failed for: " + username);
}
