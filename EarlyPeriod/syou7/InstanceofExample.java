package syou7;

//Person型の変数だけど・・・それは仮の姿かもしれない

import jdk.jshell.spi.ExecutionControl;

import java.rmi.StubNotFoundException;

public class InstanceofExample {
	public static void main(String[] args) {
        Person[] persons = new Person[3];        //Person型でまとめて扱う
        persons[0] = new Person();
        persons[1] = new Student();                //本当はStudent型
        persons[2] = new Teacher();                //本当はTeacher型

        for (int i = 0; i < persons.length; i++) {
            //Personクラスのインスタンスなのか？
            if (persons[i] instanceof Person) {
                System.out.println("persons[" + i + "]はPersonクラスのインスタンスです");
            }
            //Studentクラスのインスタンスなのか
            if (persons[i] instanceof Student) {
                System.out.println("persons[" + i + "]はStudentクラスのインスタンスです");
            }
            //Teacharクラスのインスタンスなのか
            if(persons[i] instanceof Teacher){
                System.out.println("persons[" + i + "]はTeacherクラスのインスタンスです");
            }
        }
    }

}
