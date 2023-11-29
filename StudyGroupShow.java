import java.util.List;

public class StudyGroupShow {
    public void showStudyGroup(Integer numberGroup, Teachers teachers, List<Students> students){
        System.out.println("№ Учебной группы"+numberGroup);
        System.out.println("Учитель"+teachers.getteacherId()+" "+teachers.getfnTeacher()+" "+ teachers.getsnteacher());
        System.out.println("Список учеников: ");
        for(Students item: students){
            System.out.println("№ ученика"+item.getstudentId()+"Имя Фамилия"+item.getfnstudent()+" "+item.getsnstudent());
        }

    }
}
