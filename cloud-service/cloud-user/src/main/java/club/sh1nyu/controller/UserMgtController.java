package club.sh1nyu.controller;

import club.sh1nyu.blockhandler.UserMgtBlockHandler;
import club.sh1nyu.domain.UserModel;
import club.sh1nyu.service.IUserMgtService;
import club.sh1nyu.service.UserMgtService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.util.WebUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ShenYu
 * @Description:
 * @Date: Created in 2020/4/9 14:54
 * @Modified By:
 */
@Slf4j
@RestController
//@RequestMapping("/user/mgt")
@RefreshScope //动态刷新配置信息
public class UserMgtController implements IUserMgtService {

    @Value("${custom.testString}")
    private String testString;

    @Resource
    private UserMgtService userMgtService;

    @Override
//    @GetMapping(value = "/queryusers/{id}")
    @SentinelResource(value = "hot", blockHandler = "getUsersBlockHandler", blockHandlerClass = {UserMgtBlockHandler.class})
    public List<UserModel> getUsers(Long id) {
        log.info("热点id: {}", id);
        log.info("do something: {}", "getUsers");
        log.info("配置热更新测试: {}", testString);
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        log.info("origin头为 {}", request.getHeader("origin"));
        return userMgtService.getUsers();
    }

    @GetMapping(value = "/getTest")
    public String getTest() {
        return "测试2";
    }

    @Override
//    @GetMapping(value = "/testError")
    public Object testError() {
        log.info("do something: {}" + "testError");
        return userMgtService.testError();
    }

//    @PostConstruct
//    public void initDegradeRule() {
//        List<DegradeRule> rules = new ArrayList<>();
//        DegradeRule rule = new DegradeRule();
//        rule.setResource("getUsers");
//        // 80s内调用接口出现异常次数超过5的时候, 进行熔断
//        rule.setCount(2);
//        rule.setGrade(RuleConstant.DEGRADE_GRADE_EXCEPTION_COUNT);
//        rule.setTimeWindow(20);
//        rules.add(rule);
//        DegradeRuleManager.loadRules(rules);
//    }
}
