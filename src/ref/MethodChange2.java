package ref;

public class MethodChange2 {

    // 참조형과 메서드 호출
    public static void main(String[] args) {
        Data dataA = new Data();    // 메모리에 생성
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value);  // 10
        changeReference(dataA);                                             // 참조하는 주소 내 값 변경
        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value);  // 20
    }

    public static void changeReference(Data dataX){
        dataX.value = 20;
    }
}
