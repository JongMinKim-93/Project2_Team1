import java.util.Scanner;

public class Ex11_Statement {

	public static void main(String[] args) {
		//�ݺ��� (while, do~while)
		int i=0;
		while(i >= 10) {
			//�ݵ�� 
			//�������� ���
			i--;
			System.out.println("i : " + i);
		}
		
		//while 1~100 ��
		int sum = 0;
		int j = 1;
		while(j <= 100) {
			sum++;
			j++;
		}
		System.out.println("sum : " + sum);
		
		//while�� ������ ���
		i=2;
		j=1;
		while(i<=9) {
			j=1;
			while(j<=9) {
				System.out.printf("[%d]*[%d]=[%d]\n", i, j, i*j);
				j++;
			}
			System.out.println();
			i++;
		}
		
		//for(;;) { }
		//while(true) { if(����)break; }
		//do ~ while : �ϴ� �ѹ��� ���������� ���� .. �׸��� ������ ���� �Ǵ�
		//do {���๮ ... ���� �޾ƿ�} while (���� �Ǵ�)
		//�޴� ����
		//���� �޴� ����
		//1. ¥��
		//2. «��
		//��� 3 �Է�, �޴��� �ٽ� ������ �ٽ��Է� �ް�...
		
		//���α׷� ����
		//����� ���ϴ� �޴� ��ȣ�� �����ϼ��� >> do .. ���ð� �޾Ƽ�
		//while(input > 2) �ٽ� �Է��ϼ���
		
		Scanner scan = new Scanner(System.in);
		int inputdata = 0;
		do {
			System.out.print("���ڸ� �Է��� (0~9) : ");
			inputdata = Integer.parseInt(scan.nextLine());
		}while(inputdata >= 10); //true�� �Ǹ� ��� do���� ����
		
		
	}

}
