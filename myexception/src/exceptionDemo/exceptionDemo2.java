package exceptionDemo;

public class exceptionDemo2 {
    public static void main(String[] args) {
       // 异常作用一：异常是用来查询bug的关键参考信息
        //异常作用二：异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况

        // 异常的处理方式一：try-catch
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界");

        }
        System.out.println("程序继续执行");



    }
}
