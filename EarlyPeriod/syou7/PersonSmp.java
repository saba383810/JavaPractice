package syou7;

//ポリモフィズムはjavaの重要な性質です
//まずは、ここを埋めていきましょう

//Personクラスの作成
class Person {
    void work() {
        System.out.println("仕事します。");
        }
}
//Personクラスを継承して。Studentクラスを作成
class Student extends Person {
    void work() {
        System.out.println("勉強します。");
        }
}
//Personクラスを継承して、Teacherクラスを作成
class Teacher extends Person {
    void work() {
        System.out.println("授業します。");
    }
    void makeTest() {
            System.out.println("テスト作ります。");
    }
}

//全然関係なく、Carクラスを作成




class PersonSmp {

	//personインスタンス生成
	//Studentインスタンス生成
	//Teacherインスタンス生成
	
	//Carインスタンス生成
	
	//重要！！！！！！
	//Person型に代入しながら、Studentインスタンス生成
	
	
	//Person型に代入しながら、Teacherインスタンス生成
	
	
	//Person型に代入しつつ、Carインスタンス生成
}
