package exceptionDemo;

public class exceptionDemo4 {
    public static void main(String[] args) {
        //灵魂二问：如果try中可能会遇到多个问题，怎么执行？
        //答：多个catch分别处理
        //注意：
//        会写多个catch与之对应
//        细节：
//        如果我们要捕获多个异常，这些异常中如果存在父子关系的话，那么父类一定要写在下面


        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[10]);//1
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界了");
        }
        System.out.println("看看我执行了吗？");//看看我执行了吗？
    }
}
