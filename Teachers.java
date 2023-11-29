public class Teachers {
    private Integer teacherId;
    private String fnTeacher;
    private String snteacher;

    public Teachers (Integer teacherId, String fnTeacher, String snteacher){
        this.teacherId=teacherId;
        this.fnTeacher=fnTeacher;
        this.snteacher=snteacher;
    }
    Integer getteacherId(){
        return teacherId;
    }
    void setteacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
    String getfnTeacher(){
        return fnTeacher;
    }
    void setfnTeacher(String fnTeacher) {
        this.fnTeacher=fnTeacher;
    }
    String getsnteacher (){
        return snteacher;
    }
    void setsnteacher (String snteacher){
        this.snteacher=snteacher;
    }
    public String toString(){
        return "№"+getteacherId()+"Имя учителя"+getfnTeacher()+ "Фамилия учителя" + getsnteacher ();

    }

}
