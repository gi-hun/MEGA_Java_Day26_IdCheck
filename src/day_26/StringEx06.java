//�ֹε�Ϲ�ȣ �˻�
package day_26;

public class StringEx06 {
	public static void main(String[] args) {
		String Id = "890101-2012932";
		
		// ���� 1) ���� ���
		// ���� 1) 30��
		String str = Id.substring(0,2);
		int num = Integer.parseInt(str) + 1900;
		int year = 2020;
		
		int age = year - num;
		System.out.println(age);
		// ���� 2) ���� ���
		// ���� 2) ����
		char sex = Id.charAt(7);
		
		if(sex == '1')
		{
			System.out.println("����");
		}
		else if(sex == '2')
		{
			System.out.println("����");
		}
	}
}
