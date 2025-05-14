package exceptionDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exceptionDemo1 {
    public static void main(String[] args) throws ParseException {


        //编译时异常
        String time = "2020一月一日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date =sdf.parse(time);
        System.out.println(date);


        //运行时异常
        int a = 10;
        int b = 0;
        System.out.println(a/b);

    }
}
