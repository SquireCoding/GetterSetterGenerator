import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter the variable name.");
    String name = s.nextLine();
    System.out.println("Please enter the variable type.");
    String t = s.nextLine();
    if (t.equalsIgnoreCase("i")) t="int";
    if (t.equalsIgnoreCase("d")) t="double";
    if (t.equalsIgnoreCase("c")) t="char";
    if (t.equalsIgnoreCase("b")) t="boolean";
    if (t.equalsIgnoreCase("s")) t="String";
    if (t.equalsIgnoreCase("by")) t="byte";
    if (t.equalsIgnoreCase("sc")) t="Scanner";
    
    System.out.println("public "+t+" get"+cap(name)+"() {\n  return "+name+";\n}\npublic void set"+cap(name)+"("+t+" obesque) {\n  "+name+"=obesque;\n}");
  }
  public static String cap(String str) {
    return str.substring(0, 1).toUpperCase() + str.substring(1);
  }
}
