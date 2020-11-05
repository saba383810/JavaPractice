package syou5;

public class TestStudentCard {

    public static void printCardInfo(StudentCard sc){
        System.out.println("id ="+sc.id);
        System.out.println("name ="+sc.name);
    }
    public static StudentCard compareCards(StudentCard sc1,StudentCard sc2){
        if(sc1.id < sc2.id) return sc1;
        else return sc2;
    }

    public static void main(String[] args) {
        StudentCard a = new StudentCard();
        a.id = 1234;
        a.name = "鈴木太郎";
//        System.out.println("id ="+a.id);
//        System.out.println("name ="+a.name);
        printCardInfo(a);
        StudentCard b = new StudentCard();
        b.id = 1235;
        b.name = "佐藤花子";
        printCardInfo(b);

//        StudentCard scMin = compareCards(a,b);
//        printCardInfo(scMin);
        printCardInfo(compareCards(a,b));


    }
}
