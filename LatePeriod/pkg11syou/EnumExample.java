package pkg11syou;


//enumを使ってみよう（定数を独自の型で扱う）→入力値に間違いがなくなる

//Studentクラス
class Student{
//	final static int  MALE = 0;
//	final static int  FEMALE = 1;
	enum Gender {MALE,FEMALE}

	String name;
	Gender gender;
	
	void show() {
		
		System.out.printf("名前は%s,  性別は%s\n", name, gender);
	}
	
}

//実行クラス
public class EnumExample {

	public static void main(String[] args) {

		//太郎くん登場
		Student s = new Student();
		s.gender=Student.Gender.MALE;
		s.name="太郎";
		
		//花子ちゃん登場
		Student s2 = new Student();
		s2.gender=Student.Gender.FEMALE;
		s2.name="花子";
		
		//自己紹介
		s.show();
		s2.show();
	}

}
