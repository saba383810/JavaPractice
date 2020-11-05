package syou7;
public class IStudentCard extends StudentCard {
	//追加する分
    String nationality;

	//メソッド

    void printInfo()
    {
        super.printInfo();
        System.out.println("国籍" + this.nationality);
    }
}
