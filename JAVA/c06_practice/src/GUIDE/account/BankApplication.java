package GUIDE.account;

import java.util.Scanner;


public class BankApplication {
	
	Account[] account = new Account[100];

	
	Scanner sc = new Scanner(System.in);
	
	BankApplication(){
		run();
	}
	
	void run() {
		// 1. 계좌생성
		// 2. 계좌조회 
		// 3. 예금
		// 4. 출금
		// 5. 종료
		boolean isRun = true;
		
		while(isRun) {
			System.out.println("========================================");
			System.out.println("1.계좌생성 2.계좌조회 3.예금 4.출금 5.종료");
			System.out.println("========================================");
			
			System.out.println("메뉴 번호를 선택해 주세요 > ");			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				// 계좌생성
				createAccount();
			}else if(selectNo ==2) {
				// 계좌조회
				selectAccount();
			}else if(selectNo ==3) {
				// 예금
				deposit();
			}else if(selectNo ==4) {
				// 출금
				withdraw();
			}else if(selectNo ==5) {
				// 종료
				isRun = false;
				sc.close();
			}
		}
		System.out.println("프로그램 종료");
	}
	
	
	//계좌생성
	void createAccount() {
		
		System.out.println("-------------------");
		System.out.println("계좌 생성");
		System.out.println("-------------------");
		
		System.out.print("계좌주 : ");
		String owner = sc.next();
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("초기 입금액 : ");
		int balance = sc.nextInt();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		Account acc = new Account(owner, ano, balance, password);
			
		
		
	}
		
		
	// 계좌조회
	void selectAccount() {
		System.out.println("-------------------");
		System.out.println("계좌 목록");
		System.out.println("-------------------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		System.out.println("비밀번호 : ");
		String password = sc.next();
		
		// System.out.println(account[acc].toString());

		
	}
	
	// 예금
	void deposit() {
		int deposit = 0; 
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		System.out.println("비밀번호 : ");
		String password = sc.next();
		System.out.println("예금액 : ");
		int deAmount = sc.nextInt();
		
		System.out.println(ano+" 님의 계좌 입금이 완료되었습니다.");
	
		


		
	}
	//출금
	void withdraw() {
		int withdraw = 0;
				
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		System.out.println("비밀번호 : ");
		String password = sc.next();
		System.out.println("출금액 : ");
		int wiAmount = sc.nextInt();
				
		System.out.println(ano+" 님의 계좌 출금이 완료되었습니다.");

		
	}
	
	// 계좌번호와 비밀번호가 일치하는 Account 객체를 찾아서 반환 
	Account findAccount(String ano, String password) {
		for(int i = 0; i < account.length ; i++) {
			if(ano.equals(account[i]) && password.equals(account[i])) {
			}
					
		}
		return null;
		
		
	}
	
	public static void main(String[] args) {
		new BankApplication();
	}
}
