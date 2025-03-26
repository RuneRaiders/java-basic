package ref;

public class MethodChange1 {

    // 기본형과 메서드 호출
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 a = " + a);    // 10
        changePrimitive(a);                             // a의 값(10)을 x에 전달, 메서드 안에서 20으로 변경됨
        System.out.println("메서드 호출 후 a = " + a);    // a의 값은 10으로 유지
    }

    public static void changePrimitive(int x){
        x = 20;
    }
}
