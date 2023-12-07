package ex02_nested_interface;

public class ButtonExample {

	public static void main(String[] args) {

		/*
		  document.getElementById("btnId").onclick = function(){
		  		click 이벤트 발생시 수행할 작업
		  };
		  
		  document.getElementById("btnId").onclick = ()=>{
		 	    click 이벤트 발생 시 수행 할 작업
		  };
		 */
		
		// 전화
		Button callButton = new Button("전화걸기");
		callButton.setOnClickListener(new CallListener());
		callButton.onTouch();
		
		// 메시지
		Button messageButton = new Button("메시지");
		messageButton.setOnClickListener(new MessageListener());
		messageButton.onTouch();
		
		// 전원
		Button powerButton = new Button("전원");
		// 익명 구현 객체 - 재사용x
		Button.OnClickListener powerListener = new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("전원을 끕니다.");
			}
		};
		powerButton.setOnClickListener(powerListener);
		powerButton.onTouch();
	
		// 구글
		Button internetBtn = new Button("Google");
		internetBtn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("구글을 켭니다");
			}
		});
		internetBtn.onTouch();
		
		// lambda 표현식 - method를 하나의 식으로 표현 - 익명 함수를 지징하는 용어 
		// functionalinterface에서 익명 구현 객체 표현식에서만 사용가능
		Button btn2 = new Button("kakao");
		btn2.setOnClickListener(()->{
			System.out.println("kakaotalk을 켭니다");
		});
		btn2.onTouch();
		
	} // end main

}
