package exceptionDemo;

public class exceptionDemo6 {
    public static void main(String[] args) {
        //灵魂三问：如果try中遇到的问题没有被捕获，怎么执行？
        //答：交给JVM处理，JVM会把异常的名称，异常原因及出现的位置等信息输出在控制台，同时会结束程序

        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[10]);//1m // new ArrayIndexOutOfBoundsException()
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }
        System.out.println("看看我执行了吗？");//看看我执行了吗？
    }
}
