package syou7;

//Person、Student、Teacharにwork()メソッドを追加しましょう。※「仕事する」「勉強する」「教える」
//Teacharクラスにだけ、makeTest()メソッドを追加しましょう。※「テストを作る」

public class PolymorphismExample {

	public static void main(String[] args) {

		Person[] persons = new Person[3];
		persons[0] = new Person();
		persons[1] = new Student();
		persons[2] = new Teacher();

		for (int i = 0; i < persons.length; i++) {
			persons[i].work();

			//makeTest()も呼ぶにはどうしたら良いでしょう
			if(persons[i] instanceof Teacher){
				((Teacher)persons[i]).makeTest();
			}
		}
	}


}
