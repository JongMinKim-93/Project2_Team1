//���� �ּ�
/*
 �� �ּ�
 
 Ex02_Variable >> Ŭ���� >> ���赵 >> ������ Ÿ��
 
 Ŭ���� ����
 1. class Car { } >> �������� ������ �Ұ��� >> �ٸ� Ŭ����(���赵) �����ϴ� Ŭ���� >> main�Լ� (x)
 2. class Car { public static void main(String[] args) { }} >> ���������� ���డ���� Ŭ���� 
 2.1 static void main(String[] args) >> main �̸��� ������ �Լ� >> ���α׷� ������, ������ > ����(���)
 
 Tip)
 C# ��� >> public static void Main(String[] args)
 
 ���� : variable
 	������(�ڷ�) ���� �� �ִ� ���� �̸� {�޸�}
 	����(ũ��) : ������ Ÿ��(�ڷ���) >> �޸� ������ ������ >> �ּ� ���� �ִ� ������
 	
 ������ Ÿ�� ������ >> int i = 100

public class Ŭ���� �̸� {
	public static void main(){ 
		�ȿ� �ִ� ������ (��������)
		int num = 100; //�ʱ�ȭ ���
	}
}


������ ����Ǵ� ��ġ (scope : ��ȿ����)
1. instance variable : ��ü ���� >> class Car { int number = 2000; }
2. local variable 	 : ��������(�Լ� �ȿ�) >> class Car { public void run() { int speed = 0; } }
3. �Լ� �ȿ� ���� ��(if, for) �ȿ� �ִ� ����(��) >> class Car { public void run() { for(int i=0... } }
4. static variable : ���� �ڿ�(��ü��) >> class Car { public static num=100; }

*/

//class ���赵�̴� == class Type�̴� (�������� �ǹ��ִ� ���� Ÿ���� ������ ū Ÿ��) : ����� ���� Ÿ�� 

//�ڹٴ� �ϳ��� �������� ���� �ȿ� �������� Ŭ������ ��� ����... (����������)
//�� ������ ���� ... �ϳ��� ���Ͽ� �ϳ��� Ŭ���� ����� �Ϲ���

class Car{ //���赵�� ����ϱ� ���ؼ��� ��üȭ ... �޸� ���� ���� (������ new)
	int iv = 100; 	//instance variable
	int window;		//instance variable�� �ʱ�ȭ�� ���� �ʾƵ� ��
					//���������� �⺻��(default)�� ���� : 0 >> int window = 0
	/*
	 �ʱ�ȭ : ������ ó�� ���� ���� ��(�Ҵ��� ���ؼ�)
	 ���� : why int window �̷� ��ü ������ �ʱ�ȭ�� ���� �ʾƵ� ������ ������ ����
	 �ڵ����� ���鶧 int window=4�� â�� 4��...
	 
	 Car ��� ���赵�� ������
	 Car �ֿ��� = new Car(); �ڵ����� ����� ����
	 �ֿ���.window = 10;
	 
	 Car �Ｚ�� = new Car();
	 �Ｚ��.window = 2;
	 ����Ǵ� �ڵ������� â���� ������ �޸��� �� �ִ�.
	 
	 */
	
	public void stop() {
		//������ ����
		window = 100;
		//speed = 200; ����� ������ �ľ� ����
	}
	public void start() {
		int speed = 100;
	}
}

public class Ex02_Variable {

	public static void main(String[] args) {
		// ������
		//main �Լ� �ȿ� �ڵ尡 �־�� ����� ����� �� �� �ִ�
		int lv = 100;
		System.out.println("lv �������� : " + lv);
		
		int number = 0; // ����� ���ÿ� �ʱ�ȭ
		number = 100;
		number = 200;
		System.out.println("number : " + number);
		
		int a; //����
		int b; //����
		//System.out.println(a);
		//The local variable a may not have been initialized
		//main( ) { �Լ� �ȿ� �ִ� ������ ���������� �ϴµ� �� ���������� �ʱ�ȭ���� ������ ��� �Ұ�}
		
		b = 200; // �ʱ�ȭ
		System.out.println("b ���� �ʱ�ȭ : " + b);
		
		int c, d; //��ȣ���� ���� >> ������ >> Array(�迭) >> int[] i...
		
		//key point
		//local variable (�Լ� �ȿ� �ִ� ���� : main() { �ȿ� �ִ� ���� }
		//�ݵ�� �ʱ�ȭ �ʿ�
		
		int k = 100; //���������� ����� ���ÿ� �ʱ�ȭ �ϴ� ����
		
		Car scar = new Car(); 	//scar��� �ڵ��� ���� ... (���� ����Ʈ�� ���� ��)
								//java�� OS���� �Ҵ���� �޸� ������ ����� ����
		
		//////////////////////////////////////
		// int k = 500; ���� ���� ������ ���� ���� �� ����x
		
		
		int f = 100; // f��� ������ 100�̶�� ���� ������ �ִ�
		int f2 = f;
		System.out.println("f : " + f);
		System.out.println("f2 : " + f2);
		//f������ ���� 2000�����  ... f2���� ����x
		
	}

}
