package ref;

public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90);

        // 아래에 있는 코드 한 번에 바꾸기 : SHIFT + F6
        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        // 복사 단축키 : CTRL + D
        printStudent(student1);
        printStudent(student2);
    }

    // 전달한 학생 객체의 필드에 값을 설정한다.
    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    // 전달한 학생 객체의 필드 값을 읽어서 출력한다.
    static void printStudent(Student student){
        System.out.println("이름 : " + student.name + " 나이 : "+student.age + " 성적 : "+student.grade);
    }


}
