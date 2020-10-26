// CIS4615 HW2 - Rule 05: OBJ03-J
// noncompliant code example

class ListUtility {
  private static void addToList(List list, Object obj) {
    list.add(obj); // Unchecked warning
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<String> ();
    addToList(list, 42);
    System.out.println(list.get(0));  // Throws ClassCastException
  }
}
