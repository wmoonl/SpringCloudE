package club.comm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: ShenYu
 * @Description:
 * @Date: Created in 2020/4/24 14:39
 * @Modified By:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication
{
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
