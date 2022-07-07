public class Main {
    public static void main(String[] args){
        Student[] stu = new Student[3];
        stu[0] = new Student();
        stu[1] = new Student();
        stu[2] = new Student();

        stu[0].setName("철수");
        stu[1].setName("영희");
        stu[2].setName("바둑");

        stu[0].setStuID(1420);
        stu[1].setStuID(1422);
        stu[2].setStuID(1421);

        for(int i = 0; i < stu.length; i++){
            stu[i].showInfo();
        }
    }
}
