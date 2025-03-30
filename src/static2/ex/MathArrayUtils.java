package static2.ex;

public class MathArrayUtils {
    private static int[] array;

    private MathArrayUtils(){
        // private으로 생성자 생성을 막는다.
    }

    public static int sum(int[] values) {
        int total = 0;
        for(int value : values){
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for(int value : values){
            if(value < minValue){
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for(int value : values){
            if(value > maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }
}
