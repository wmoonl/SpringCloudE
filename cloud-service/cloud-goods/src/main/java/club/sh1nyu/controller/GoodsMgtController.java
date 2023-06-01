package club.sh1nyu.controller;

import club.sh1nyu.domain.UserModel;
import club.sh1nyu.service.IUserMgtService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ShenYu
 * @Description:
 * @Date: Created in 2020/4/9 14:58
 * @Modified By:
 */
@Slf4j
@RestController
@RequestMapping("/goods/mgt")
public class GoodsMgtController {
//    @Resource
//    private RestTemplate restTemplate;
//
//    @Resource
//    private LoadBalancerClient loadBalancerClient;

    @Resource
    private IUserMgtService userMgtService;

    @GetMapping(value = "/getgoodsusers")
    public List<UserModel> getGoodsUsers() {
        log.info("do something: {}", "getGoodsUsers");
        return userMgtService.getUsers(23L);
    }

    @GetMapping(value = "/testError")
    public Object testError() {
        log.info("do something: {}", "testError");
        return userMgtService.testError();
    }

    @GetMapping(value = "/testgoods")
    public Object testGoods() {
        log.info("do something: {}", "testGoods");
        return "testGoods";
    }

    @GetMapping(value = "/testgoodserr")
    public Object testGoodsErr() {
        log.info("do something: {}", "testGoodsErr");
        throw new IllegalArgumentException("非法参数异常");
    }
}
