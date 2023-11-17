package extends2_phone;

public class PhoneExample {

	public static void main(String[] args) {
				
		Phone phone = new Phone();
		phone.powerOn();
		phone.bell();
		phone.sendVoice("에보세염");
		phone.receiveVoice("하이하이");
		phone.sendVoice("놀쟝");
		phone.hangUp();
		phone.powerOff();
		
		DMBPhone dmbPhone = new DMBPhone("가로본능", "Silver", 11);
		System.out.println(dmbPhone.model);
		System.out.println(dmbPhone.color);
		dmbPhone.powerOn();
		dmbPhone.turnOnDMB();
		dmbPhone.changeChannel(8);
		dmbPhone.turnOffDMD();
		dmbPhone.powerOff();
		
		
		
		
	}
}
