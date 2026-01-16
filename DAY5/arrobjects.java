class Student{
    int roll;
    String name;
    int mark;
}


public class arrobjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll =1;
        s1.name ="manoj";
        s1.mark =89;
        Student s2 = new Student();
        s2.roll =2;
        s2.name ="rinky";
        s2.mark =90;
        Student s3 = new Student();
        s3.roll =3;
        s3.name ="ashu";
        s3.mark =88;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i =0;i<students.length;i++){
            System.out.println(students[i].roll + " :" +students[i].name + " : " + students[i].mark);
        }

        
    }
}
