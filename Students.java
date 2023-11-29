public class Students {
     
    // № номер
    private Integer studentId;
    // имя студунта
    private String fnstudent;
    // фамилия студента
    private String snstudent;

    public Students (Integer studentId, String fnstudent, String snstudent) {
        this.studentId=studentId;
        this.fnstudent=fnstudent;
        this.snstudent=snstudent;

    }
    Integer getstudentId(){
        return studentId;

    }
    void setstudentId(Integer studentId) {
        this.studentId = studentId;
    }
    String getfnstudent(){
        return fnstudent;
    }
    void setfnstudent(String fnstudent) {
        this.fnstudent=fnstudent;
    }
    String getsnstudent (){
        return snstudent;
    }
    void setsnstudent(String snstudent){
        this.snstudent=snstudent;
    }
    public String toString(){
        return "№" +getstudentId() + "Имя студента" +getfnstudent()+ "Фамилия студента"+getsnstudent();

    }

}
