//주민등록번호 검사
package day_26;

public class StringEx06 {
	public static void main(String[] args) {
		String Id = "890101-2012932";
		
		// 문제 1) 나이 출력
		// 정답 1) 30세
		String str = Id.substring(0,2);
		int num = Integer.parseInt(str) + 1900;
		int year = 2020;
		
		int age = year - num;
		System.out.println(age);
		// 문제 2) 성별 출력
		// 정답 2) 여성
		char sex = Id.charAt(7);
		
		if(sex == '1')
		{
			System.out.println("남자");
		}
		else if(sex == '2')
		{
			System.out.println("여자");
		}
	}
}
