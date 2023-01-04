import java.util.Scanner;

class bonus_9_116{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String a1 = in.nextLine();
    String a2 = a1.replace(" ","");
    
    // System.out.println(a2);
    int length = a2.length();//8
    int arr[] = new int [length];

    String opo = "";
    String opo2 = "";


    for (int i = 0; i < length; i++) {
      char c = a2.charAt(i);
      opo = opo + c;
    }
      System.out.println(opo);

    for (int j = length - 1; j <= length && j != -1; j--) {
      char c1 = a2.charAt(j);
      opo2 = opo2 + c1;
    }
      System.out.println(opo2);

    boolean res = opo2.equals(opo);
    System.out.println(res);    
  }
}