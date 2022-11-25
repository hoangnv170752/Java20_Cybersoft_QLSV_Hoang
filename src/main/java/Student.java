import java.util.Scanner;

public class Student {
    private String ten;
    private String maSv;
    private float toan;
    private float ly;
    private float hoa;
    private float sinh;

    public Student(){}

    public Student(String ten, String maSv, float toan, float ly, float hoa, float sinh){
        this.ten = ten;
        this.maSv = maSv;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.sinh = sinh;
    }

    public String getTen() {
        return ten;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    public float getSinh() {
        return sinh;
    }

    public void setSinh(float sinh) {
        this.sinh = sinh;
    }

    public void getStudent() {
        System.out.println("Ten sinh vien:" + ten);
        System.out.println("Ma sinh vien: " + maSv);
        System.out.println("Diem toan: " + toan);
        System.out.println("Diem ly: " + ly);
        System.out.println("Diem hoa: " + hoa);
        System.out.println("Diem sinh: " + sinh);
        System.out.println("Diem trung binh: " + (toan + ly + hoa + sinh)/4);
    }

    static Scanner sc = new Scanner(System.in);

    public void inputStudent() {
        System.out.println("Nhap ten sinh vien: ");
        ten = sc.nextLine();
        System.out.println("Nhap ma SV: ");
        maSv = sc.nextLine();
        System.out.println("Nhap diem toan: ");
        toan = sc.nextFloat();
        System.out.println("Nhap diem ly: ");
        ly = sc.nextFloat();
        System.out.println("Nhap diem hoa: ");
        hoa = sc.nextFloat();
        System.out.println("Nhap diem sinh: ");
        sinh = sc.nextFloat();
    }

    public void xepLoai() {
        if (6 < ((toan + ly + hoa + sinh) / 4) && ((toan + ly + hoa + sinh) / 4) < 8 ){
            System.out.println("Sinh vien hoc luc kha.");
        } else if (((toan + ly + hoa + sinh) / 4) < 6){
            System.out.println("Sinh vien hoc luc kem.");
        } else if (8 < ((toan + ly + hoa + sinh) / 4)) {
            System.out.println("Sinh vien hoc luc tot.");
        }
    }
}
