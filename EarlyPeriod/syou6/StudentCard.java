package syou6;


public class StudentCard {
   static int counter = 0;
   int id;
   String name;

   public StudentCard(){
      this(0,"未定");

   }
   public StudentCard(int id){
      this.id = id;
      this.name = "未定";
   }
   public StudentCard(String name){
      this.id = id;
      this.name = name;
   }
   public StudentCard(int id , String name){
      this.id = id;
      this.name = name;
      counter++;
   }
   public StudentCard(String name,int id){
      this.id = id;
      this.name = name;
      counter++;
   }

   public void printInfo(){
      System.out.println(counter+"枚あるよ");
      System.out.println("番号:"+id);
      System.out.println("名前:"+name);
   }
}

