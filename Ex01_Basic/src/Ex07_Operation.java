
public class Ex07_Operation {
	public static void main(String[] args) {
		//���� ������
		// += , -= , *= . /=
		
		int sum = 0;
		sum += 1;
		sum -= 1;
		System.out.println("sum : " + sum);
		
		//������ ���� ����
		//���� : A+, A-, B+, B-, ....F
		//���� : 94��
		
		//�Ǵܱ��� 90�� �̻����� >> A �ο�
		//�Ǵ� 95�� �̻� >> A+
		//�ƴ϶�� >> A-
		
		//84 �ϴ� 80�� �̻� > B�ο�
		//�Ǵ� 85�� �̻� >> B+ 
		//�ƴϸ� B-
		
		//if���� ����ؼ� ���� ����� �ϼ���
		int score = 78;
		String grade = "";
		System.out.println("����� ������ : " + score);
		
		//if�� ����
		if(score >= 90) {
			grade = "A";
			grade += (score >= 95) ? "+" : "-";
		}else if(score >= 80) {
			grade = "B";
			grade += (score >= 85) ? "+" : "-";
		}else if(score >= 70){
			grade = "C";
			grade += (score >= 75) ? "+" : "-";
		}else {
			grade = "F";
		}
		//
		System.out.println("����� ������ : " + grade);
		
	}
}
