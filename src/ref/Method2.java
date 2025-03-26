package ref;

public class Method2 {

    public static void main(String[] args) {

        // 아래에 있는 코드 한 번에 바꾸기 : SHIFT + F6
        Student student1 = createStudent( "학생1", 15, 90);
        System.out.println("student1="+student1);
        Student student2 = createStudent( "학생2", 16, 80);
        System.out.println("student2="+student2);

        // 복사 단축키 : CTRL + D
        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student();    // 객체 생성
        System.out.println("student="+student);
        student.name = name;                // 초기값 설정
        student.age = age;
        student.grade = grade;
        return student;                     // 호출 결과를 반환
    }

    static void printStudent(Student student){
        System.out.println("이름 : " + student.name + " 나이 : "+student.age + " 성적 : "+student.grade);
    }


}
