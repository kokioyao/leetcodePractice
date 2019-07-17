package cn.footman.complexityExp;

/**
 * @author footman77
 * @create 2018-11-19 22:53
 */
public class Test01 {
    public static void main(String[] args) {

        // 数据规模倍乘测试findMax
        // O(n)
        System.out.println("Test for findMax:");
        for( int i = 10 ; i <= 28 ; i ++ ){

            int n = (int)Math.pow(2, i);
            Integer[] arr = MyUtil.generateRandomArray(n, 0, 100000000);

            long startTime = System.currentTimeMillis();
            Integer maxValue = MyAlgorithmTester.findMax(arr, n);
            long endTime = System.currentTimeMillis();

            System.out.print("data size 2^" + i + " = " + n + "\t");
            System.out.println("Time cost: " + (endTime - startTime) + " ms");
        }
    }
}
