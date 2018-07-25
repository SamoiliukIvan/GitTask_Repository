//������� �� ����� ����� �� 5 ���, 
//� ������ ������ ������ ���������� ������ ����� �������. 
//� ������ ������ - 1, � ��������� - 5

package GitTasks;

public class FormatNumberPi {

	public static void main(String[] args) {
		
		System.out.println(String.format("%.1f%n", Math.PI));	// 1 ����� ����� �������
		System.out.println(String.format("%.2f%n", Math.PI));	// 2 ����� ����� �������
		System.out.println(String.format("%.3f%n", Math.PI));	// 3 ����� ����� �������
		System.out.println(String.format("%.4f%n", Math.PI));	// 4 ����� ����� �������
		System.out.println(String.format("%.5f%n", Math.PI));	// 5 ����� ����� �������
	}
}
