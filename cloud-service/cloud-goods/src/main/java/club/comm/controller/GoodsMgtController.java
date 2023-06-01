package club.comm.controller;

import club.comm.domain.UserModel;
import club.comm.service.IUserMgtService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
