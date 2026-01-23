package chapter12;

public class EnvEx {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("java.version")); // 자바 버전
		System.out.println(System.getProperty("java.home")); // JDK 경로
		System.out.println(System.getProperty("os.name")); // OS
		System.out.println(System.getProperty("file.separator")); // 파일 구분자(리눅스,유닉스는 /)
		System.out.println(System.getProperty("user.name")); // 사용자명
		System.out.println(System.getProperty("user.home")); // 사용자 홈디렉토리
		System.out.println(System.getProperty("user.dir")); // 현재 워크스페이스 디렉토리 위치

	}

}
