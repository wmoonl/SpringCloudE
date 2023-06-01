package club.sh1nyu.blockhandler;

import club.sh1nyu.domain.UserModel;
import club.sh1nyu.service.UserMgtService;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ShenYu
 * @Description:
 * @Date: Created in 2020/4/16 14:22
 * @Modified By:
 */
@Slf4j
@Component
public class UserMgtBlockHandler
{
    @Resource
    private UserMgtService userMgtService;

    public static List<UserModel> getUsersBlockHandler(Long id, BlockException e)
    {
        log.debug("发生限流异常");
        List<UserModel> aa = new ArrayList<>();
        UserModel user = new UserModel(100, "限流用户");
        aa.add(user);
        return aa;
    }

    public static Object testError(Exception e)
    {
        log.debug("降级");
        return "降级";
    }
}
