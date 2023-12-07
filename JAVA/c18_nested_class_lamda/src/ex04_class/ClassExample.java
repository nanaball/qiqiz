package ex04_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ClassExample {

	public static void main(String[] args) {

		// Class의 설계 정보를 저정하는 객체 Class
		// Object의 정적멤버인 class keyword를 이용하여 객체 설계정보 획득
		Class<Person> pClass1 = Person.class;
		// class의 이름 정보 (package를 포함하는 class의 전체 이름)
		System.out.println(pClass1.getName());

		Person person = new Person("a");
		System.out.println(person);

		// 2. Object의 인스턴스 멤버 메소드인 getClass()를 이용하여 인스턴스 설계정보 획득
		Class<Person> pClass2 = (Class<Person>) person.getClass();
		System.out.println(pClass2.getName());

		try {
			// 3. class의 이름 정보를 이용하여 설계 정보 획들
			Class<Person> pClass3 = (Class<Person>) Class.forName("ex04_class.Person");

			System.out.println(pClass3.getName()); // 풀네임
			System.out.println(pClass3.getSimpleName()); // class 네임
			System.out.println(pClass3.getPackage().getName()); // package 이름

			// class에 정의된 Field(전역변수)정보
			// java.lang.reflect
			Field[] fields = pClass3.getDeclaredFields();
			System.out.println("Fields =============");

			for (Field f : fields) {
				int modifier = f.getModifiers();
				System.out.print(f + "\t");
				System.out.println();
				System.out.print(modifier + "\t");
				System.out.print(Modifier.toString(modifier) + "\t");
				System.out.print(f.getType().getSimpleName() + "\t");
				System.out.println(f.getName());
			}
			System.out.println();

			// 생성자 정보
			System.out.println("Constructors ====================");
			// java.lang.reflect
			Constructor<?>[] cons = pClass3.getDeclaredConstructors();
			for (Constructor<?> c : cons) {
				System.out.print(Modifier.toString(c.getModifiers()) + "\t");
				System.out.print(c.getName() + "(");
				
				// 생성자의 매개변수 타입 및 이름 
				Class<?>[] types = c.getParameterTypes();
				Parameter[] name = c.getParameters();
				
				for(int i = 0; i < types.length; i++) {
					System.out.print(types[i].getName()+" "+name[i].getName());					
				}
				System.out.println(")");
			}
			System.out.println();
			
			// method 정보
			System.out.println("methods ====================");
			// java.lang.reflect.Method
			Method[] methods = pClass3.getDeclaredMethods();
			for(Method m : methods) {
				System.out.println(m);
				System.out.print(Modifier.toString(m.getModifiers())+"\t");
				System.out.print(m.getReturnType()+"\t"+m.getName());
				
				System.out.print("(");
				
				Class<?> [] types = m.getParameterTypes();
				Parameter[] params = m.getParameters();
				
				for(int i = 0; i < types.length; i++) {
					System.out.print(" "+types[i].getName()+" ");
					if(params[i].isNamePresent()) { // 파라미터 이름을 저장하고 있으면 true
						System.out.println(params[i].getName());
					}
				}
				System.out.println(")");
			}
			

			System.err.println("class를 이용하여 instance 생성");
			Class<Person> clazz = (Class<Person>) Class.forName("ex04_class.Person");
			// deprecated sin version 9
			// 어떤 기능이 아직까지 사용되고는 있지만, 새로운 기능이 나왔기때문에 조만간 사라지게 될 상태이며, 사용을 권장하지 않음.
			Person p = clazz.newInstance();
			p.setName("우리집");
			p.setAge(20);
			System.out.println(p);
			
			Person p0 = (Person)clazz.getConstructor().newInstance();
			System.out.println(p0);
			
			Person p1 = clazz.getConstructor(String.class).newInstance("너거집");
			System.out.println(p1);
			
			Person p2 = clazz.getConstructor(String.class, int.class).newInstance("남의집",30);
			System.out.println(p2);
			
		} catch (ClassNotFoundException e) {
			// 해당되는 위치에 class이름을 가진 설계도를 찾지 못함.
			e.printStackTrace();
		} catch (InstantiationException e) {
			// 객체 설계 정보는 있으나 객체 생성이 불가능할 때 발생하는 오류 
			// 추상 class, interface 이러한 설계정보를 가진 class는 자체만으로 객체 생성이 불가하니 생성 할 수 없다고 발생하는 예외			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// class 정보도 존재하고 일반 class 이지만 객체를 생성하기 위한 생성자를 호출 할 수 없음
			// 설계도는 찾았으나, 우리가 접근 할 수 없는 생성자임 
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// 선언된 생성자와 다른 타입의 인자값이 전달되었을때 
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// newInstance로 생성된 객체의 method 또는 생성자에서 예외가 발생했을 때 그 오류를 전달
			// - 생성자 내부에서 NullPiontException 등
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// 동일한 개수의 매개변수를 가진 생성자를 찾지 못했을때 
			e.printStackTrace();
		} catch (SecurityException e) {
			// 접근권한이 없을때 - 파일이 접근할 수 없는 디렉토리에 존재할때 
			e.printStackTrace();
		}

	}

}
