import java.util.Scanner;

public class Ex12_Statement_Quiz {

	public static void main(String[] args) {
		
		
		boolean auto = true;
		int balance = 0; //�ܾ�
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("*****************");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("*****************");
			
			System.out.print("�����ϼ��� : ");
			int input = Integer.parseInt(scan.nextLine());
			
			//�Ǵ�
			switch(input) {
				case 1:
					System.out.println("����ó��..");
					balance += Integer.parseInt(scan.nextLine());
					break;
				case 2:
					System.out.println("���ó��..");
					balance -= Integer.parseInt(scan.nextLine());
					break;
				case 3:
					System.out.println("�ܰ�..");
					break;
				case 4:
					System.out.println("�����մϴ�.");
					auto = false;
					break;
				default:
					System.out.println("�ùٸ� �޴��� �����ϼ���.");
			}
			
			if(auto == false) {
				break; 
			}
			
		}

	}

}
