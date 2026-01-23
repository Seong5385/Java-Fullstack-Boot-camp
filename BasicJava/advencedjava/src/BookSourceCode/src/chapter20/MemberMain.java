package chapter20;

import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		
		// 회원객체 생성
		MemberVO vo = new MemberVO();
		vo.setMemberno(2);
		vo.setId("hong");
		vo.setName("홍길동");
		
		// dao 객체 생성
		MemberDAO dao = new MemberDAO();
		
		// 회원 추가
		int r = dao.insert(vo);
		if (r > 0) {
			System.out.println("회원 등록 성공");
		}
		
		// 2번 회원 조회후 출력 
		MemberVO rvo = dao.selectOne(2);
		System.out.println("회원정보 출력");
		System.out.println("회원번호 : "+rvo.getMemberno());
		System.out.println("아이디 : "+rvo.getId());
		System.out.println("이름 : "+rvo.getName());
		
		// 회원정보 수정
		vo.setName("고길동");
		int r2 = dao.update(vo);
		if (r2 > 0) {
			System.out.println("회원 수정 성공");
		}
		
		// 전체회원 목록 조회
		System.out.println("회원목록 조회");
		List<MemberVO> list = dao.list();
		for (int i=0; i<list.size(); i++) {
			System.out.println("회원번호:"+list.get(i).getMemberno()
					+"\t아이디:"+list.get(i).getId()
					+"\t이름:"+list.get(i).getName());
		}
		
		
		// 회원 삭제
		int r3 = dao.delete(2);
		if (r3 > 0) {
			System.out.println("회원 삭제 성공");
		}
		
		
		// 자원 해제
		dao.close();

	}

}
