class Bonus9_169{
  public static void main(String[] args) {
//     9.169. Дано предложение. Вывести на экран:
// а) его слова, начинающиеся и оканчивающиеся на одну и ту же букву;
// б) его слова, которые содержат ровно три буквы е;
// в) его слова, которые содержат хотя бы одну букву о.


    //а
    // String word = "men ese shaygaramys";
    // String arr[] = word.split(" ");//3


    // for (int i = 0; i < arr.length; i++) {
    //   // System.out.println(neww[i]);
    //   int len = arr[i].length();
    //   //System.out.println(len);
    //   char arr2[]=new char[len];

    //   for (int j = 0; j < len; j++) {
    //     arr2[j] = arr[i].charAt(j);
    //   }
    //   //System.out.println(arr2[0]);
    //   //System.out.println(arr2[len-1]);
    //   if (arr2[0] == arr2[len-1]) {
    //     System.out.println(arr[i]);
    //   }
    // }


    //b
    // String word = "men esepe shaygaramyn";
    // String array[] = word.split(" ");
    // int count = 0;
    // char e = 'e';
    // char y = 'o';

    // for (int i = 0; i < array.length; i++) {
    //   count = 0;
    //   // System.out.println(array[i]);
    //   int len = array[i].length();
    //   // System.out.println(len);
    //   char arr[] = new char[len];
    //   for (int j = 0; j < len; j++) {
    //     arr[j] = array[i].charAt(j);
    //     // System.out.println(arr[j]);
    //     y = arr[j];
    //     if (y == e) {
    //         count++;
    //         // System.out.println(neww[i]+" "+count);
    //     }
    //     if (count >= 3) {
    //       System.out.println(array[i]);
    //     }  
    //   }
    // }


    //c
    String word = "mon esepo shaygaramyn";
    String array[] = word.split(" ");
    int count = 0;
    char e = 'o';
    char y = 'e';

    for (int i = 0; i < array.length; i++) {
      count = 0;
      // System.out.println(neww[i]);
      int len = array[i].length();
      // System.out.println(len);
      char arr[] = new char[len];
      for (int j = 0; j < len; j++) {
        arr[j] = array[i].charAt(j);
        // System.out.println(arr[j]);
        y = arr[j];
        if (y == e) {
            count++;
            // System.out.println(neww[i]+" "+count);
        }
        if (count >= 1) {
          System.out.println(array[i]);  
        }  
      }
    }
  }
}