package guide.member;

import java.util.ArrayList;
import java.util.List;


/**
 * AppBase의 기능을 구현한 자식 class
 * AppBase의 기능을 상속받아 제시된 기능을 완성하시오.
 */
public class MemberManagement extends AppBase
{

	@Override
	protected void terminate() {
		
	}

	@Override
	protected void join() {
		System.out.println("아이디를 입력해주세요 ");
		String mId = sc.next();
		System.out.println("비밀번호를 입력해주세요 ");
		String mPw = sc.next();
		System.out.println("비밀번호를 한번 더 입력해주세여");
		String mPw1 = sc.next();
		
		if(!memberIdCheck(mId) || !mPw.equals(mPw1)) {
			// 중복 아이디이거나 비밀번호가 일치하지 않음
			System.err.println("사용할 수 없는 아이디이거나, 비밀번호가 일치하지 않습니다.");
			return;
		}
		
		System.out.println("이름을 입력해주세요 ");
		String mName = sc.next();
		
		System.err.println("회원가입 완료");
		
		Member newMember = new Member(number++, mName, mId, mPw, System.currentTimeMillis());

		List<String> Member = new ArrayList<>();
			

	}

	@Override
	protected void login() {
		System.out.println("아이디를 입력해주세요 ");
		String mId = sc.next();
		System.out.println("비밀번호를 입력해주세요 ");
		String mPw = sc.next();
	
	
		Member Member = new Member(mId,mPw);
		Member acceptMember = findMember(Member);
	
		if(acceptMember == null) {
			System.out.println("일치하는 회원정보가 없습니다.");
			return;
		}
		
		System.out.println("정상적으로 로그인 되었습니다.");
		loginMember = acceptMember;
		System.out.println(loginMember.toString());

		if(loginMember == master) {
			System.err.println("관리자 계정입니다. ");
		}
		}

	@Override
	protected void select() {
	}

	@Override
	protected void update() {
	}

	@Override
	protected void delete() {
	}

	@Override
	protected void deleteMember() {
	}

}
