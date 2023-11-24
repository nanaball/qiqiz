package f_format;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {

		String text = "회원 ID : {0} \n회원이름 : {1} \n전화번호 : {2}";
		String result = MessageFormat.format(text, "id001", "최기근", "01011111111");
		System.out.println(result);
		
		String text2 = "학번은 {0}, 이름은 {1}, 전화번호는 {2}";
		Object[] arguments = {1, "기근최", "01088888888"};
		String result2 = MessageFormat.format(text2, arguments);
		System.out.println(result2);
		
		MessageFormat format = new MessageFormat(text2);
		String result3 = format.format(arguments);
		System.out.println(result3);
		
	}

}
