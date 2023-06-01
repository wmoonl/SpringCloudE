package club.comm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: ShenYu
 * @Description:
 * @Date: Created in 2020/4/9 14:37
 * @Modified By:
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("club.comm.dao")
@EnableFeignClients
public class GoodsApplication
{
    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class, args);
    }
}
