package f09_object.serializable;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableInputExampe {

	public static void main(String[] args) {

		try {
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("person.dat")));

			List<Person> list = new ArrayList<>();
			// [Object Write Header][Person][Person][Object Write Header][Person][Person]

			while (true) {
				try {
					Person p = (Person)ois.readObject();
					list.add(p); // 리스트에 Person 정보 추가
					// EOFException - End Of File
					// ObjectInputStream - 더 이상 읽을 객체가 존재하지 않으면 EOFExceoption 발생
				} catch (EOFException e) {
					System.out.println("모든 객체를 다 읽음");
					break;
				}
			} // end while

			System.out.println(list);
			ois.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	} // end main

}
