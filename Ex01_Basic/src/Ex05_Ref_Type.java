
/*
 Ŭ������ ���赵 �̴�, Ŭ������ ������ Ÿ���̴�.
 Ŭ���� == ���赵 == Ÿ��
 
  Ŭ������ ��üȭ�� ���� ��� (���� ���� ����)
  ���α׷������� [ new ������ ] �� ���� memory �� ���� ���´�. >> ������� �� >> ��ü(�ν��Ͻ�)
  
 ���赵 ���� 2����
 1. ���������� ���� ���� >> public static void main(String[] args) { } ������ �ִ� Ŭ����
 2. ���������� ���� �Ұ��� >> main �Լ��� ���� ������ Ŭ���� >> ���� �����ִ� Ŭ���� >> ���̺귯��(LIB)
 

 */

class Apt2{ //main �Լ��� ����
	int door = 10;
	int window = 20;
}

//class Car {	
//The type Car is already defined
//���� ���� �ȿ� � �ڹ������� �� Ŭ���� �̸��� ��� ��

//}

public class Ex05_Ref_Type {

	public static void main(String[] args) {
		//Apt2 ���赵�� ������
		//��üȭ�� �깰 ���� (��ü)
		
		int num;
		num = 100; // �������� �־��ָ� ...
		Apt2 apt2; //�ּҰ��� ...
		apt2 = new Apt2(); //Apt2 ���赵�� ������� ����Ʈ ���� (JVM >> memory >> heap)
		System.out.println("apt2 : " + apt2);
		//apt2 : Apt2@626b2d4a

		Apt2 ssapt = apt2; //�ּҰ��� �Ҵ� ... ssapt ������ apt2�� ������ �ִ� �ּҰ����� �ʱ�ȭ��
		ssapt.door = 100; // .�����ڴ� �ּҸ� ã�ư��� ������
		
		System.out.println("apt2�� �ٶ󺸴� door : " + apt2.door);
		
		
		
	}

}
