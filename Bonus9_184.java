import java.util.Scanner;

class Bonus9_184{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();
		int length = word.length();
		char arr[] = new char[length];
		boolean res = word.startsWith(")");
		boolean flag = false;
		int count = 0;
		int count1 = 0;
		for(int i = 0; i < length; i++){
			if(res==true){
				flag = true;
			}
			else{
				flag = false;
				// break;
			}
		}
		for (int j = 0; j<length; j++) {
			if (flag==true) {
				System.out.println("Not balanced");
				break;
			}else{
				for(int i = 0; i < length; i++){
					if(word.charAt(i)=='('){
						count++;
					}
					if(word.charAt(i)==')'){
						count1++;
					}
				}
			}
		}
		if (flag!=true) {
			
		
			if(count==count1){
				System.out.println("Balanced");
			}else{
				System.out.println("Not balanced");
			}
		}
	}
}