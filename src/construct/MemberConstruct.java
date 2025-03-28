package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가 : 생성자 오버로딩
    MemberConstruct(String name, int age){
        // System.out.println("123"); // Call to 'this()' must be first statement in constructor body 오류, this()는 생성자 코드의 첫 줄에만 작성할 수 있다.
        this(name, age, 50); // 변경
    }

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
