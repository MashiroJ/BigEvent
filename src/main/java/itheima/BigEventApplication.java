package itheima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
@MapperScan(basePackages = "itheima.mapper")
public class BigEventApplication {
    public static void main(String[] args) {
        SpringApplication.run(BigEventApplication.class, args);
        System.out.println("                           ┏━┓     ┏━┓\n" +
                "                          ┏┛ ┻━━━━━┛ ┻┓\n" +
                "                          ┃　　　　　　 ┃\n" +
                "                          ┃　　　━　　　┃\n" +
                "                          ┃　┳┛　  ┗┳　┃\n" +
                "                          ┃　　　　　　 ┃\n" +
                "                          ┃　　　┻　　　┃\n" +
                "                          ┃　　　　　　 ┃\n" +
                "                          ┗━┓　　　┏━━━┛\n" +
                "                            ┃　　　┃   神兽保佑\n" +
                "                            ┃　　　┃   代码无BUG！\n" +
                "                            ┃　　　┗━━━━━━━━━┓\n" +
                "                            ┃   BitEvent    ┣┓\n" +
                "                            ┃      启动      ┏┛\n" +
                "                            ┗━┓ ┓ ┏━━━┳ ┓ ┏━┛\n" +
                "                              ┃ ┫ ┫   ┃ ┫ ┫\n" +
                "                              ┗━┻━┛   ┗━┻━┛\n" +
                "           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}
