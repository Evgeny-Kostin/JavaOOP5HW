/*— Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры
 - (Teacher, List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его; */

import java.util.List;

public class StudyGroupServise {
    public StudyGroup studyGroup  = new StudyGroup();
    public StudyGroup createStudyGroup (Integer numberGroup, Teachers teachers,List<Students> students){
        studyGroup.setNumberGroup(numberGroup);
        studyGroup.setStudents(students);
        studyGroup.setTeachers(teachers);
        return studyGroup;

    }
}
