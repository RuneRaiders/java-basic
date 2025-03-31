package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        // final 지역 변수2
        final int data1;
        data1 = 10; // 최초 한 번만 할당 가능
        //data1 = 20; // Variable 'data1' might already have been assigned to

        // final 지역 변수2
        final int data2 = 10;
        //data2 = 20; // Cannot assign a value to final variable 'data2'
    }

    static void method(final int parameter){
        //parameter = 20; // Cannot assign a value to final variable 'parameter'
    }
}
