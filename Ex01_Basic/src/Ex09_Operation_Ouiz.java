import java.util.Scanner;

//��Ģ����(+, -, *, /)
/*
 ȭ��
>�Է°�:����
>�Է°�(��ȣ): +
>�Է°�:���� 
>������ :200
  
 */

public class Ex09_Operation_Ouiz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">�Է°�: ");
		int num = Integer.parseInt(scan.nextLine());
		
		System.out.print(">�Է°�(��ȣ): ");
		String str = scan.nextLine();
		
		System.out.print(">�Է°�: ");
		int num1 = Integer.parseInt(scan.nextLine());
		
		int sum = 0;
		
		if(str.equals("+")) {
			sum = num + num1;
		}else if(str.equals("-"))
			sum = (num > num1) ? num-num1 : num1-num;
		else if(str.equals("*"))
			sum = num * num1;
		else if(str.equals("/"))
			sum = (num > num1) ? num/num1 : num1/num;
		
		System.out.println(">������: " + sum);
	}

}
