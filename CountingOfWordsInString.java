//����������� �����, ������� ������ ���������� ���� � ������ ������

package GitTasks;

public class CountingOfWordsInString {

	public static void main(String[] args) {
		String str = new String ("��� ���� ����� ������� ������!");
		int countOfWords = 0;			// ����������-������� ����
		
		for(String s: str.split(" "))
		{
			countOfWords++;
		}
		System.out.println("���������� ���� � ������ - " + countOfWords );
	}
}
