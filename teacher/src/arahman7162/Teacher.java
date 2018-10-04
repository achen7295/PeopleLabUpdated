package arahman7162;

public class Teacher extends Person{
    private String subject = "";
    private String title = "";
    public Teacher(String subject,String title, String firstName, String familyName)
    {
        super(firstName,familyName);
        this.subject = subject;
        this.title = title;
    }
    public  String getSubject(String subject)
    {
        return subject;
    }
    public  String getTitle(String titleName)
    {
        return titleName;
    }

}
