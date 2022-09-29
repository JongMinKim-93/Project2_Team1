
public class Ex10_Statement {

	public static void main(String[] args) {
		//���
		//���ǹ� : if(3����), switch(����) (case�� ... break)
		//�ݺ��� : for(�ݺ�Ƚ���� ��Ȯ), while(����), do{ }~while()
		//�б⹮ : break(���Ż��), continue(�Ʒ� ���� skip)
		
		int count = 0;
		if(count < 1)
			System.out.println("true");
		
		char data = 'A';
		switch(data) {
			case 'A':
				System.out.println("���� �� ���ƿ�");
				break;
			case 'B':
				break;
			default:
				System.out.println("������ ó��...");
		}
		
		//for��
		//1~100 ������
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			System.out.println("i : " + i);
			sum += i;
		}
		System.out.printf("1~100 ������ : %d\n", sum);
		
		//1~5���� ��
		int num = 5*((1+5)/2);
		System.out.println(num);
		
		//for���� ����� 1~10���� Ȧ�� �� ���ϱ�
		//1 3 5 7 9
		int sum2 = 0;
		for(int i=1; i<10; i+=2) {
			sum2 += i;
		}
		System.out.println("sum1 Ȧ���� : " + sum2);

		//for �ȿ� if���� ����ؼ� 1~1000������ ���� ���ϱ�(¦��)
		int sum3 = 0;
		for(int i=1; i<= 1000; i++) {
			if(i%2 == 0) {
				sum3 += i;
			}
		}
		System.out.println("sum3 : " + sum3);
		
		//�Ի����(������)
		//��ø for ...
		//�Ѱ��� ���� ���� ... �ݺ� (2 1~9, 3 1~9, ....)
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("[%d]*[%d]=[%d]\t", i, j, i*j);
			}
			System.out.println();
		}
		
		//for + (�б⹮) continue, break
		//Today Point : continue(�Ʒ� ���� skip), break(for, while �� Ż��)
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i == j)
					break;
				System.out.printf("%s", "*");
			}
			System.out.println();
		}
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		//100���� 0���� ��� .. ������ --i
		for(int i=100; i>=0; i--) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println();
		
		//�Ǻ���ġ ����
		System.out.println("�Ǻ���ġ ����");
		int a1 = 1;
		int a2 = 1;
		System.out.printf("%d %d ", a1, a2);
		int a3 = 0;
		
		for(int i=3; i<20; i++) {
			a3 = a1 + a2;
			System.out.print(a3 + " ");
			a1 = a2;
			a2 = a3;
			if(i%10 == 0) {
				System.out.println();
			}
		}
		
	}

}
