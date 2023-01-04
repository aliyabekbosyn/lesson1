import java.util.Scanner;

class Bonus9_157{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st1 = "процессор";
        int st1len = st1.length();
        char arr1[] = new char [st1len];

        String st2 = "информация";
        int st2len = st2.length();
        char arr2[] = new char[st2len];

        boolean f = false;

        for (int i = 0; i < st1len; i++) {
            arr1[i] = st1.charAt(i);
        }

        for (int j = 0; j < st2len; j++) {
            arr2[j] = st2.charAt(j); 
        }


        for (int i = 0; i < st1len; i++) {

            for (int j = 0; j < st2len; j++) {

                f = false;
                //System.out.println(arr1[i]+" and "+arr2[j] );
                
                if (arr1[i]==arr2[j]) {
                    f = true;
                    break;
                }
            }
            if (f==true) {
                System.out.println("da");
            }else if (f==false) {
                System.out.println("net"); 
            } 
        }
    }
}