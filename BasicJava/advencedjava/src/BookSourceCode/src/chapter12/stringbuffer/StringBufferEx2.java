package chapter12.stringbuffer;

public class StringBufferEx2 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		// 메서드 체이닝으로 여러 타입의 매개변수값을 StringBuffer 객체의 문자열값에 추가
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb);
		
		// 2~3번 인덱스값 삭제
		sb.delete(2, 4);
		System.out.println(sb);
		
		// 4번 인덱스값 삭제
		sb.deleteCharAt(4);
		System.out.println(sb);
		
		// 5번 인덱스에 == 추가
		sb.insert(5,"==");
		System.out.println(sb);
		
		// 6번 인덱스에 1.23 추가(문자열로 변환)
		sb.insert(6,1.23);
		System. out.println(sb);

	}

}
