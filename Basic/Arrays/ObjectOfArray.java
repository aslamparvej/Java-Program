package Basic.Arrays;

class ObjectOfArray{
    class Student{
        int roll_no;
        String name;
        Student(String s_name,int s_roll){
            this.name = s_name;
            this.roll_no = s_roll;
        }
    }
    public static void main(String[] args) {
        Student[] s1;
        s1 = new Student[2];
        
        

        s1[1].name = "Arifuddin Shaikh";
        s1[1].roll_no = 22;

        for(int i = 0; i<2; i++){
            System.out.println("Student Name: "+s1[i].name+" Roll number: "+s1[i].roll_no);
        }
    }
}