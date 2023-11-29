//— Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id)
//и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;

import java.util.List;

public class Controller {
    private StudyGroupServise studyGroupServise;
    public Controller(){
        studyGroupServise=new StudyGroupServise();

    }
    public StudyGroup createFinalGroup(Integer numberGroup, Teachers teachers, List<Students> students){
        return studyGroupServise.createStudyGroup(numberGroup, teachers, students);
    }

}
