//����� ����� � ������� ������ 3 ��������

package GitTasks;

import java.util.Arrays;

public class WordsWithMoreThanThreeCharacters {

	public static void main(String[] args) {
		
		// ������ �����
		String[] arrayOfStrings  = {"�", "��", "��", "���", "������", "�����", "������"};
		
		// ����� �����, ������� ���� ��������
		String[] selectStrings = Arrays.stream(arrayOfStrings) 	// ����������� ������ � �����
				.filter(s -> s.length() > 3)					// ���� "�������" �����
				.toArray(String[]::new);						// ������� � ���������� ����� ������ �����
		
		// ����� �� �������
		System.out.println(Arrays.toString(selectStrings));
	}
}
