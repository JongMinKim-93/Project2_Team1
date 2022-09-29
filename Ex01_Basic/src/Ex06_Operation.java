//import java.lang.*; �����Ǿ� ����
//���� �ʾƵ� java.lang ���� ���� �ڿ� �׳� ��밡��


public class Ex06_Operation {
	public static void main(String[] args) {
		
		int result = 100 / 100;
		System.out.println(result);
		
		result = 13/2; //��
		System.out.println(result);
		
		//������ ������ : %
		result = 13 % 2;
		System.out.println(result);
		
		//����, ���� (������ ������ : ++ 1�� ����, -- 1�� ����)
		int i = 10;
		++i; //��ġ����
		System.out.println("��ġ : " + i);
		
		i++; //��ġ����
		System.out.println("��ġ : " + i);
		//ȥ�ڴ� ��ġ, ��ġ�� �ǹ̰� ����.
		
		//Today Point (������ ������ �ٸ� �����ڿ� ���յǸ� ��ġ, ��ġ)
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2;
		System.out.println("resut2 : " + result2 + " j2 : " + j2);
		//resut2 : 10 j2 : 5
		
		result2 = i2 + j2++;
		System.out.println("resut2 : " + result2 + " j2 : " + j2);
		//resut2 : 10 j2 : 6
		
		byte b = 100;
		byte c = 1;
		
		// byte d = b + c; 
		//  Type mismatch: cannot convert from int to byte
		//  java�� ������ ���� �⺻ ������ ���
		//  1�� �ذ� (����� 4Byte ������ ����� ���� int + int
		// byte d = (byte)(b + c); //�ս��� ���� ....
		//  2�� �ذ�
		int d = b + c; //����� Ÿ�� ���� (�ս� �߻�x)
		System.out.println("d : " + d);
		
		//Today Point
		/*
		1. ������ ��� ������ [int] Ÿ�� ��ȯ �� ó��  
		    ex) byte + short => �����Ϸ��� ���������� int + int 
		  		char + char  => �����Ϸ��� ���������� int + int
		  	���� ó�� ��
		  	���� ���꿡�� int ���� ���� Ÿ���� int�� ��ȯ�� ���� (long ����)
		  	
		  	char + int >> int + int
		  	int + long  >> long + long ����������...
		  	
		  	���� + �Ǽ� >> Ÿ���� ũ��� ������� >> �Ǽ� ����
		 
		 */
		
		long ln = 10000000000L;
		float fl = 1.2f;
		//long lnresult = ln + fl;
		long lnresult = (long) (ln + fl); //�սǹ߻�
		System.out.println("lnresult : " + lnresult);
		//float lnresult = ln + fl;
		//System.out.println("lnresult : " + lnresult);
		
		float num2 = 10.45f;
		int num3 = 20;
		//num2 + num3
		float result5 = num2 + num3;
		System.out.println(result5);
		
		char c2 = '!';
		char c3 = '!';
		int result6 = c2 + c3;
		System.out.println(result6);
		
		//���
		//�߼ұ�� ���蹮�� (������ ���) >> �ﰢ�� ����� >> ����
		int sum = 0; //local variable
		for(int j=1; j<=100; j++) {
			//sum += j; //sum = sum + j;
			if(j % 2 == 0) { //¦�����
				sum += j; //¦���� �� (1~100)
			}
		}
		System.out.println("sum = " + sum);
		
		// == ������ (�� ���ϴ� ������)
		if(10 == 10.0f){ //Ÿ���� ������ �ʰ� ���� ��
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		// ! ���� ������
		if('A' != 65) {
			System.out.println("�� ���� �ʾ� : true");
		}else {
			System.out.println("�� ���� ���̾� : false");
		}
		
		//�ϱ����� (Today point)
		//�������߿��� ��� ������ �ϴ� ...�༮
		//���׿�����
		int p = 10;
		int k = -10;
		int result8 = (p == k) ? p : k;
		
		//�� �ڵ带 if������
		int result9 = 0;
		if(p == k) {
			result9 = p;
		}else {
			result9 = k;
		}
		
		//����ǥ
		//������
		//0 : false
		//1 : true
		
		/*		OR ����	, 	AND ����
		 0 0	 0			 0			
		 0 1	 1			 0
		 1 0	 1			 0
		 1 1 	 1			 1
		  
		  ��Ʈ ������
		  | or ������
		  & and ������
		  
		  �� ������
		  || or ����
		  && and ����
		 
		 */
		
		int x = 3;
		int y = 5;
		
		System.out.println("x|y : " + (x|y));
		/*
		 
		  ������ -> 2����(0, 1)
		  8bit
		  256 128 64 32 16 8 4 2 1
		  			  	   0 0 1 1 > 10���� 3�� -> 2����
		  			  	   0 1 0 1 > 10���� 5�� -> 2����
		  OR			   0 1 1 1 > ������ > 10���� > 4+2+1 > 7
		  AND			   0 0 0 1 > ������ > 10���� > 1
		 */
		System.out.println("x&y : " + (x&y));
		
		//Today Point( && (and) , || (or))
		//if(10 > 0 && -1 > 1 && 100 > 2 && 1> -1){ A }else{ B } *****
		//������ ������ ���� ó�� ��
		//if(10 > 0 or -1 > 1 or 100 > 2 or 1 > -1){ A }else{ B }
		
		int data = 80;
		switch(data) {
			case 100 :
				System.out.println("100�Դϴ�.");
				break;
			case 90 :
				System.out.println("90�Դϴ�.");
				break;
			case 80 :
				System.out.println("80�Դϴ�.");
				break;
			default :
				System.out.println("�ش��ϴ� ���� ����.");
		}
		
		int month = 9;
		String res = ""; //�� ���ڿ� �ʱ�ȭ
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				res = "31";
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				res = "30";
				break;
			case 2:
				res = "29";
				break;
			default:
				res = "���� �ƴմϴ�.";
		}
		System.out.println(month + "���� " + res + "�ϱ��� �Դϴ�.");
		
		//���� (������ : ������ ���Ⱚ)
		//java (����ϰ����ϴ� �پ��� �ڿ��� �̸� ������ �� >> ã�Ƽ� >> ��� JAVA API)
		//���� (ã�Ƽ� ... ���) api ����
		//https://docs.oracle.com/javase/8/docs/api/index.html
		//���ϴ� �ڿ��� ã�Ƽ� ������� �ľ��ϰ� ó�� FM
		//java.lang.Math Ŭ���� ã��
		//public static double random()
		//equal to 0.0 and less than 1.0. ������ ������ ���� �� ����
		//��� : double �Ǽ� return 0.0 <= random < 1.0
		
		//��Ģ�� ���
		//�������ϴ� �ڿ��� �ִ� ������ open
		//import java.lang.* 	>> java ���� �ȿ� lang ���� �ȿ� �ִ� ��� �ڿ� ��� ����
		
		System.out.println("Math.random() : " + Math.random());
		System.out.println("(Math.random() * 10) : " + (Math.random()*10));
		System.out.println("(int)(Math.random() * 10) : " + (int)((Math.random() * 10)+1));
		
		//1~10
		System.out.println("(int)(((Math.random() * 10)+1)*100) : " + (int)(((Math.random() * 10)+1)*100));
		System.out.println("");
		
		/*
		 �츮�� ��ȭ�� ��ǰ �ý����� ������� �Ѵ�
   		��ǰ �ý����� ������ ������ ���� ��ǰ�� �����ϴ� �ý����̴�
   		��ǰ ��÷�� 1000 ������ ������
   		��ǰ���� TV , NoteBook , ����� , �ѿ켼Ʈ , ����
   		��ǰ ��÷�� 900 ������ ������
   		��ǰ����  NoteBook , ����� , �ѿ켼Ʈ , ����
   		��ǰ ��÷�� 800 ������ ������
   		��ǰ����  ����� , �ѿ켼Ʈ , ����
   		��ǰ ��÷�� 700 ������ ������
   		��ǰ����  �ѿ켼Ʈ , ����
   		��ǰ ��÷�� 600 ������ ������
   		��ǰ����  ����
   		�׿� ������ 100 ~ 500 ������ ĩ�� 
   		��ǰ�ý����� ���� ������ 100 ~ 1000 ������ �����Ǿ� �ִ�
   		����ڰ� ��ǰ �ý����� ���� �����ϰ� 100 ~ 1000������ ���� ������ �Ǿ� �ֽ��ϴ�.
		 */
		
		int num10 =((int)(Math.random() * 1000)+1);
		//int num10 =((int)(Math.random() * 10)+1)*100;
		String st = "";
		switch(num10) {
			case 1000:
				st += "TV";
			case 900:
				st += " NoteBook";
			case 800:
				st += " �����";
			case 700:
				st += " �ѿ�";
			case 600:
				st += " ����";
				break;
			default:
				st += " ĩ��";
		}
		System.out.println(num10 + ", "+ st);
		
		//switch(����) 
		//���ǽ��� ���ڿ��� ����, ���� ����
		
		String m = "F";
		String f = "";
		switch(m) {
			case "A":
			case "B":
			case "C":
			case "D":
			case "E":
			case "F":
			case "G": f = "ok";
				break;
			case "H":
			case "k": f = "no";
				break;
			default: f = "no data";
				break;
		}
		System.out.println("��� : " + f);
		
	}
}
