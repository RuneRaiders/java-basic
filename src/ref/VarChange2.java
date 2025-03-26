package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;
        System.out.println("dataA 참조값=" + dataA);           // dataA의 주소값
        System.out.println("dataB 참조값=" + dataB);           // dataB의 주소값
        System.out.println("dataA.value = " + dataA.value);   // 10
        System.out.println("dataB.value = " + dataB.value);   // 10

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);   // 20
        System.out.println("dataB.value = " + dataB.value);   // 20 -> 이유 : dataA의 주소값을 참조하기 때문

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);   // 30 -> 이유 : dataA의 주소값을 참조하기 때문
        System.out.println("dataB.value = " + dataB.value);   // 30
    }
}
