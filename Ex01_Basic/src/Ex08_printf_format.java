import java.util.Scanner;

public class Ex08_printf_format {

	public static void main(String[] args) {
		
		System.out.println(); //����ϰ� �ٹٲ�(����)
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		System.out.println();
		System.out.print("C");
		System.out.println();

		int num = 100;
		System.out.println(num);
		System.out.println("num ����" + num + " �Դϴ�.");
		
		//���� format
		System.out.printf("num ���� %d �Դϴ�.\n", num);
		System.out.printf("num ���� [%d] �Դϴ� �� [%d]�� �־�� \n", num, 12345);
		//format ���Ĺ���
		/*
		 %d 10���� ���� ����
		 %f �Ǽ�
		 %s ���ڿ�
		 %c ����
		 \t tab , \n �ٹٲ�  
		 */
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f������ %f �Դϴ�. \n", f);
		
		//�Է¹ޱ� (cmd) ����ڰ� �Է��� ����
		
		Scanner scan = new Scanner(System.in);
		String value = scan.nextLine(); 
		//�Է��ϰ� ���͸� ĥ������ ��� (���α׷� ���� �����ʰ� ��� ���)
		//�Է��� ���� ���ڿ� �������־��
		//System.out.println(value);
		
		//int number = scan.nextInt();
		//System.out.println("number : " + number);
		
		
		//float number = scan.nextFloat();
		//System.out.println("number : " + number);
		
		//���� ���� : nextInt, nextFloat, ���ٴ� nextLine()���� read�ϰ� ��ȯ
		//Today Point
		
		//[���ڸ�] => ���ڷ� (����, �Ǽ�)
		//Integer.parseInt("1111"); ->> ���� ->> 1111
		//Float.parseFloat("3.14"); ->> �Ǽ� ->> 3.14
		
		System.out.println("���ڸ� �Է��ϼ���");
		int number = Integer.parseInt(scan.nextLine());
		System.out.println("������ : " + number);
		
		
	}

}
