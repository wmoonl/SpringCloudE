package club.sh1nyu.fallbackexception;

import club.sh1nyu.domain.UserModel;
import club.sh1nyu.service.IUserMgtService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ShenYu
 * @Description:
 * @Date: Created in 2020/4/16 14:20
 * @Modified By:
 */
@Slf4j
@Component
public class UserMgtFallBack implements FallbackFactory<IUserMgtService>
{
    @Override
    public IUserMgtService create(Throwable cause) {
        return new IUserMgtService() {
            @Override
            public List<UserModel> getUsers( Long id) {
                log.info("***********获取用户发送异常！**************");
                List<UserModel> aa = new ArrayList<>();
                UserModel user = new UserModel(100, "降级用户");
                aa.add(user);
                return aa;
            }

            @Override
            public Object testError() {
                log.error("降级");
                return "熔断降级";
            }
        };
    }
}
