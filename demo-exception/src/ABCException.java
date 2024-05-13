public class ABCException extends RuntimeException {
  // "extends RuntimeException" implies "ABCException" is a run-time exception
  // Compiler would not check if you have handled the exception
  public static void main(String[] args) {
    checkName("Vincent Vincent", "HUANG");
  }

  public static String checkName(String firstName, String lastName){
    if (firstName == null || lastName == null)
      throw new IllegalArgumentException();
    if (firstName.length() + lastName.length() > 15) // run-time exception
      throw new ABCException();
    return firstName.concat(" ").concat(lastName);
  }
}
