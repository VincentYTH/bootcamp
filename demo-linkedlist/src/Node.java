public class Node { // = object
  
  private String str; // object reference

  private Node next; // object reference

  public Node(String str){
    this.str = str;
  }

  public Node(String str, Node next){
    this.str = str;
    this.next = next;
  }

  public Node getNext(){
    return this.next;
  }

  public String getString(){
    return this.str;
  }

  public void setNext(Node next){
    this.next = next;
  }

  public void setString(String str){
    this.str = str;
  }

  public static void main(String[] args) {
    // "hello", "abc", "def"
    Node head = new Node("hello", new Node("abc", new Node("def")));
    
    // check if head contains "def"
    Node temp = head;
    boolean result = false;
    while (temp != null) {
      // find "def"
      if ("def".equals(temp.getString())) {
        result = true;
        break;
      }
      // move to the next Node
      temp = temp.next;
    }
    System.out.println(result); // true
    System.err.println("hello".equals(null)); // false

  }
}
