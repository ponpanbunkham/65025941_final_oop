import java.util.ArrayList;

public class final1 {
    public static void main(String[] args) {
        ArrayList<project> project = new ArrayList<project>();

        
    }
}
class employee {
    private String name;
    private double age;
    private String position;
    private String edmid;
    private ArrayList<project> myproject;

    public void addproject(project myproject){
        this.myproject.add(myproject);
    }
    public void showDtails(){
        this.showDtails();
    }
    
    
}
class person extends employee{
    public String neme;
    public int age;

    public String getname(){
        return this.neme;
    }
    public void setname(String name){
        this.neme = name;
        System.out.println("Name : " + neme);
    }

    public int getage(){
        return this.age;
    }
    public void setage(int age){
        this.age = age;
    }
}
class jop extends employee {
    public String position;
    public String empid;

    public String getPosition(){
        return this.position;
    }
    public void setPosition(String position){
        this.position = position;
        System.out.println("Position : " + position);
    }
    public String getEmpId(){
        return this.empid;
    }
    public void setEmpId(String empid){
        this.empid = empid;
        System.out.println("EmpiID");
    }
}
class project{
    protected String projectname;
    protected String description;

    public String getproject(){
        return this.getproject();
    }

    public void showDtails(){
        System.out.println("Projects : " + this.projectname);
        System.out.println("    " + this.description);
    }
}