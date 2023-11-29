/*
— Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;
— Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher, List<Strudent>))
 формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
— Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id)
и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
 */

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Students studyGroup1 = new Students(1,"Evgeny","Kostin");
        Students studyGroup2 = new Students(2,"Oleg","Skalski");
        Students studyGroup3 = new Students(3,"Olga","Vibornaya");
        Students studyGroup4 = new Students(22, "Ivan", "Ivanov");
        Students studyGroup5 = new Students(220, "Ivan", "Obyshkov");
        Students studyGroup6 = new Students(20, "Igor", "Popov");
        
        Teachers teachers1 = new Teachers(1, "Elvira", "Annaeva");
        Teachers teachers2 = new Teachers(2, "Yuri", "Urri");

        

        List<Students>students1=new ArrayList<>();
        students1.add(0,studyGroup2);
        students1.add(1,studyGroup3);
        students1.add(2,studyGroup1);

        List<Students>students2=new ArrayList<>();
        students2.add(0,studyGroup4);
        students2.add(1,studyGroup5);
        students2.add(2,studyGroup6);

        Controller controller1=new Controller();
        Controller controller2= new Controller();

        controller1.createFinalGroup(1, teachers1, students1);
        controller2.createFinalGroup(2, teachers2, students2);

        StudyGroupShow studyGroupShow1=new StudyGroupShow();
        StudyGroupShow studyGroupShow2 = new StudyGroupShow();

        studyGroupShow1.showStudyGroup(1,teachers1,students1);
        System.out.println();
        studyGroupShow2.showStudyGroup(2,teachers2,students2);
        System.out.println();


       




    }
    
 }