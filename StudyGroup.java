/*— Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;*/

import java.util.List;

public class StudyGroup {
    private Integer numberGroup;

    private Teachers teachers;
    private List<Students> students;
    public StudyGroup() {

    }

    public Integer getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(Integer numberGroup) {
        this.numberGroup = numberGroup;
    }

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    public String toString() {
        return "№ Учебной группы" + getNumberGroup()+ " "+ getTeachers() + ", список учеников " + getStudents();
    }

}
