
//����Ʈ ���赵
class Apt{ //���赵 == ������ Ÿ��(���� Ÿ���� ��� ���� ūŸ��)
	int window;
	
}

//������ Ÿ�� ������ ex) int number; > number ��� ������ Ÿ�Կ� �´� ���� ����
//Apt apt;

public class Ex03_Object_Variable {

	public static void main(String[] args) {
		
		int number = 100;
		
		//4byte ������ �Ҵ���
		Apt apt; 	//���� Apt Ÿ�� apt ����
					//apt������ AptŸ���� ������ �ּҰ��� ����
					//������ ����Ʈ�� �޸𸮿� �÷��� ����Ʈ ���� �� �ּҰ� ������
		apt = new Apt();	//heap �޸𸮿� ����Ʈ�� ��ä ��������� �׸��� �ּҰ� �����ǰ�
							//������ �ּҰ��� apt ������ ����
		
		System.out.println("apt ������ �� : " + apt);
		//apt ������ �� : Apt@626b2d4a
		//Apt + @ + 626b2d4a >> ���赵�̸� + @ + �ּҰ� 

		Apt apt2 = new Apt();
		
		System.out.println(apt == apt2);
		
		Apt apt3 = apt2; //�ּҰ� �Ҵ�
		System.out.println(apt3 == apt2);
		apt2.window = 20;
		
		System.out.println("apt3 : â���� �� : " + apt3.window);
		
		//�� Ÿ�԰� �ּ� Ÿ�� ����
		/*
		 >>>>>>>
		 Ex03_Object_Variable �ҽ�����
		 javac Ex03_Object_Variable.java >> Ex03_Object_Variable.class ��������
		 java Ex03_Object_Variable ����
		 
		  JVM ���� >> OS >> JAVA �޸� ���� (��ȹ����) >> �ڿ� �Ҵ� (�޸�) >> ���α׷� ����
		  >> ����ߴ� �޸� OS��ȯ ... end
		  >>>>>>>>>
		  ��Ŭ���� ���� ���� �� CTRL + f11 >>>>>>> ���̸� ����
		  
		  1. main �Լ� �ȿ� ���� ������ �ݵ�� �ʱ�ȭ �ϰ� ���
		  2. ��� >> main �Լ� >> ������ >> ������ ���� ����
		 */
	
	}

}
