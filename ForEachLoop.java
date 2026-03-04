class Student{
    String name;
    int rollno;
    int marks;

}


public class ForEachLoop {

    public static void main(String args[]){

        int nums[] = new int[4];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;

        for(int i : nums){
            System.out.println(i);
        }



        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "John";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Yash";
        s2.marks = 99;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Rahul";
        s3.marks = 80;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
       for(Student s : students){
            System.out.println(s.name + " : " + s.rollno + " , " + s.marks);
       }


    }
    
}
