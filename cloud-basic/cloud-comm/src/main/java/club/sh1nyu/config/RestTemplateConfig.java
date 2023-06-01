package club.sh1nyu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: ShenYu
 * @Description:
 * @Date: Created in 2020/4/9 14:39
 * @Modified By:
 */
@Configuration
public class RestTemplateConfig
{
    @Bean
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }
}
