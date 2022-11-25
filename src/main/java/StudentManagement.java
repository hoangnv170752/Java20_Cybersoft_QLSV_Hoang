import java.util.Scanner;

public class StudentManagement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so sinh vien: ");
//        int no = sc.nextInt();
        Student student = new Student();
//        int i = 0;
//        do{
//        System.out.println("Thong tin sinh vien thu " + (i+1));
        student.inputStudent();
        student.getStudent();
        student.xepLoai();
//            i++;
//        } while(i < no);
    }
}
