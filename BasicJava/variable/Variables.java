package variable;

public class Variables {
    public static void main(String[] args) {
        // 식별자(변수, 클래스, 메서드, 이름) 규칙
        /*
         * 1. 대문자와 소문자를 구분하고, 길이 제한 없음.
         * 2. 식별자는 문자, 숫자, 밑줄(_), $를 포함할 수 있음.
         * 단, _와 $는 로컬 시스템 규틱이 있거나 부득이 한 경우 아니면
         * 사용하지 않음. 한글로 식별자 가능하지만, 영문으로..
         * 3. 식별자 시작은 문자, _, $로 시작이 가능함.(시작은 숫자 X)
         * 4. 공백을 포함할 수 없음.
         * 
         * ex) 3test(X), _test123(O), @123test(X), public(X)
         * Public(O), puBlic(O), num Data(X), num_data(O)
         */

        /*
         * 식별자를 이용한 이름 규칙(권장 사항)
         * - 클래스 이름/인터페이스 이름
         * 1) 명사 또는 형용사를 서술적으로 연결해서 사용.
         * 2) 첫 글자는 대문자로 표기
         * 3) 연결된 단어의 첫 글짜도 대문자로 표기
         * 4) 이외는 소문자로 표기
         * 주의) "$"는 내부 클래스에서 특별한 의미를 가져서 사용 권장 X
         * ex) CustomerManger, CustomerData, PatientManager
         * 
         * - 메서드 이름
         * 1) 동사적 의미를 갖게 선언
         * 2) 첫 글자는 소문자, 연결되는 단어의 첫 글자는 대문자로 표기(낙타형)
         * 3) 나머지는 소문자
         * 4) 메서드 이름 뒤에는 "()"가 뒤에 있음.
         * 5) "_"는 일반적으로 메서드 이름에서 사용하지 않음.
         * ex) insertCustomerData(), deleteCustomerData() ...
         * 
         * - 변수 이름
         * 1) 명사적 의미를 가지게 작성
         * 2) 첫글자 소문자, 연결 단어의 첫글자는 대문자(낙타형)
         * 3) 나머지는 소문자
         * 4) "_"는 일반적으로 변수 이름에 사용 안함.
         * ex) customerName, patientId, phoneNumber
         */

        // 변수 - 데이터를 담는 메모리 공간 데이터 타입을 결정해줘야 됌.
        // 선언 방식
        // 1. 기본 : <데이터 타입> <변수 이름>;
        // 2. 초기값 선언: <변수 이름> = <데이터>;
        // 3. 기본 및 초기값 선언: <데이터 타입> <변수 이름> = <데이터>;

        // ex) 변수 선언 예시
        int num1; // 기본 선언
        num1 = 10; // 초기화

        int num2 = 20; // 기본 및 초기값 선언

        // literal: 10, 20 과 같은 상수를 의미함.
        System.out.printf("%d, %d\n", num1, num2); // 실행

        // 상수형 변수의 선언
        // 변수 선언방식은 같으나, 변수명을 대문자로 통일
        // int STATE = 0;

        // char 자료형
        char a = 'A'; // 문자는 '' 사용해서 표현.(한 글자)
        System.out.println(a); // A

        int b = a;
        System.out.println(b); // 65

        char c = 66;
        System.out.println(c); // B

        int d = a + b;
        System.out.println(d); // 130

    }
}
