// CIS4615 HW2 - Rule 02: EXP00-J
// noncompliant code example

public void deleteFile(){
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  someFile.delete();
}
