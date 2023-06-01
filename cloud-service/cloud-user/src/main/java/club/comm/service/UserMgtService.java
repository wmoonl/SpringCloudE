package club.comm.service;

import club.comm.dao.UserDao;
import club.comm.domain.UserModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ShenYu
 * @Description:
 * @Date: Created in 2020/4/13 14:50
 * @Modified By:
 */
@Service
public class UserMgtService
{
    @Resource
    private UserDao userDao;

//    @SentinelResource(value = "getUsers"/*, blockHandler = "getUsersBlockHandler", blockHandlerClass = {UserMgtBlockHandler.class}*/)
    public List<UserModel> getUsers() {
        return userDao.queryUsers();
    }

//    @SentinelResource(value = "testError"/*, fallback = "testError", fallbackClass = {UserMgtBlockHandler.class}*/)
    public Object testError() {
        throw new IllegalArgumentException("非法参数异常");
//        return null;
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
