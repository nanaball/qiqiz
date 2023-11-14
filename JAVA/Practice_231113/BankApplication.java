package object_array_guide.account;

import java.util.Scanner;

public class BankApplication {
	
	// 계좌 목록을 저장하늠 배열
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
		String acc = sc.next();
		System.out.print("초기 입금액 : ");
		int balance = sc.nextInt();
		System.out.print("비밀번호 : ");
		String pass = sc.next();
		
		Account newAccount = new Account(acc, owner, balance, pass);
			/*
			 * Account newAccount = new Account();
			 * newAccount.ano = acc;
			 * newAccount.owner = owner;
			 * newAccount.balance = balance;
			 * newAccount.password = pass;
			 */
		for(int i = 0; i < account.length; i++) {
			if(account[i] == null) {
				account[0] = newAccount;
				System.out.println("계좌 생성이 완료되었습니다.");
				break;
			}
		}				
	} // create account method end
	
	// 계좌조회
	void selectAccount() {
		System.out.println("-------------------");
		System.out.println("계좌 조회");
		System.out.println("-------------------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		System.out.println("비밀번호");
		String pass = sc.next();
		
		for(int i = 0; i < account.length; i++) {
			if(account[i] != null && account[i].ano.equals(ano) && account[i].password.equals(pass)) {
				String info = account[i].toString();
				System.out.println(info);
				break;
			}
		}
	}
	
	// 예금
	void deposit() {
		System.out.println("-------------------");
		System.out.println("계좌 조회");
		System.out.println("-------------------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		System.out.println("비밀번호");
		String pass = sc.next();
		
		Account registAccount = findAccount(ano,pass);
		
		if(registAccount == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		System.out.println("입금액 : ");
		int money = sc.nextInt();
		registAccount.balance += money;
		System.out.printf("%s 님의 계좌에 %,d원을 입금 완료했습니다. 잔고는 %,d원 %n", 
							registAccount.owner, money, registAccount.balance);
	}
	
	//출금
	void withdraw() {
		System.out.println("-------------------");
		System.out.println("계좌 조회");
		System.out.println("-------------------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		System.out.println("비밀번호");
		String pass = sc.next();
		
		Account acc = findAccount(ano, pass);
		if(acc == null) {
			System.out.println("잘못된 정보를 입력하셨습니다.");
			return;
		}
		
		System.out.println("출금액 : ");
		int money = sc.nextInt();
		int result = acc.balance - money;
		if(result < 0) {
			System.out.println("잔고가 부족합니다.");
			return;
		}
		
		// 계좌정보가 일치하고 출금 할 수 있는 금액
		acc.balance = result;
		System.out.printf("%s 님의 계좌에서 %,d원이 출금되었습니다. 잔고는 %,d원 입니다. %n",
							acc.owner, money, acc.balance);
		
	}
	
	// 계좌번호와 비밀번호가 일치하는 Account 객체를 찾아서 반환 
	Account findAccount(String ano, String password) {
		for(int i = 0; i < account.length; i++) {
			Account acc = account[i];
			if(acc != null && acc.ano.equals(ano) && acc.password.equals(password)) {
				return acc;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		new BankApplication();
	}
}
