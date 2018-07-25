//�������� �����, ������� ��������� ������ ����� ����� � ���������� ������������

package GitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaximumNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sizeOfArray; 					// ���������� ��� ��������� �������
		
		System.out.println("������� ����� ��� ��������� ������� �������:");
		sizeOfArray = scanner.nextInt();
				
		int[] array = new int[sizeOfArray]; // ������ ��� �������� �����
		
		System.out.println("������� " + sizeOfArray + " �����/�����:");
		
		for(int i = 0; i < array.length; i++) // ���������� ������� �������
		{
			array[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		Integer max = Arrays.stream(array) 	// �������� ������ �� �������
				.boxed()					// �������� ����� � ���������
				.max(Integer::compareTo)	// ��������� ��������� �� ��������
				.get();						
		
		System.out.println("������������ ����� ����� " + max);			// ����� ���������� �� �������
	}
}
