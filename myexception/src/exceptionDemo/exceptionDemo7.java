package exceptionDemo;

public class exceptionDemo7 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[10]);//1
            System.out.println("一键三连" );
        } catch (ArrayIndexOutOfBoundsException e) {
            //String message = e.getMessage();
            //System.out.println(message);//5

            //String toString = e.toString();
            //System.out.println(toString);  java.lang.ArrayIndexOutOfBoundsException: 5


            //e.printStackTrace();//java.lang.ArrayIndexOutOfBoundsException: 5
            //at exceptionDemo.exceptionDemo7.main(exceptionDemo7.java:12)

            System.out.println("索引越界了");
        }
        System.out.println("看看我执行了吗？");//看看我执行了吗？





    }
}
