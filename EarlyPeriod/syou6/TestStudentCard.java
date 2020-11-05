package syou6;

public class TestStudentCard {
    public static StudentCard compareCards(StudentCard sc1,StudentCard sc2){
        if(sc1.id < sc2.id) return sc1;
        else return sc2;
    }

    public static void main(String[] args) {
        System.out.println(StudentCard.counter+"枚あるよ");
        StudentCard a = new StudentCard(777,"佐藤はなこ");
        a.printInfo();

        StudentCard b = new StudentCard(888,"田中たろう");
        b.printInfo();


//        StudentCard scMin = compareCards(a,b);
//        printCardInfo(scMin);


    }
}
