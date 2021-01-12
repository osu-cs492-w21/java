import java.util.Stack;

class GenericsStuff {
  public static void main(String[] args) {
    Stack<String> s1 = new Stack<String>();
    Stack<Integer> s2 = new Stack<Integer>();

    for (int i = 0; i < 10; i++) {
      s1.push(String.valueOf(i) + String.valueOf(i));
      s2.push(new Integer(i * i));
    }

    while(!s1.empty()) {
      System.out.println(s1.pop());
    }

    while(!s2.empty()) {
      System.out.println(s2.pop());
    }
  }
}
