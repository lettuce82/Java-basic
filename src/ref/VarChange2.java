package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA = " + dataA);
        System.out.println("dataB = " + dataB);
        System.out.println("dataA = " + dataA.value);
        System.out.println("dataB = " + dataB.value);

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA = " + dataA.value);
        System.out.println("dataB = " + dataB.value);

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataA.value = 30");
        System.out.println("dataA = " + dataA.value);
        System.out.println("dataB = " + dataB.value);
    }
}
