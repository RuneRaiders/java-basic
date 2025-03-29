package access.b;

//import access.a.DefaultClass1; // cannot be accessed from outside package
//import access.a.DefaultClass2; // cannot be accessed from outside package
import access.a.PublicClass;

public class PublicClassOuterMain {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        //DefaultClass1 defaultClass1 = new DefaultClass1(); // 다른 패키지 접근 불가
        //DefaultClass2 defaultClass2 = new DefaultClass2(); // 다른 패키지 접근 불가
    }
}
