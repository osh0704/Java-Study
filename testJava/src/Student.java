public class Student {
    int stuID;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getName() {
        return name;
    }

    public int getStuID() {
        return stuID;
    }
    public void showInfo(){
        System.out.println(this.getStuID() + " " + this.getName());
    }
}
