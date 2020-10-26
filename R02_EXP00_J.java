// CIS4615 HW2 - Rule 02: EXP00-J
// compliant solution

public void deleteFile(){
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  if (!someFile.delete()) {
    // Handle failure to delete the file
  }
}
