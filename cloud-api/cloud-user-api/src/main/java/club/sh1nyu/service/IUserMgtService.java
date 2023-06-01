package club.sh1nyu.service;

import club.sh1nyu.domain.UserModel;
import club.sh1nyu.fallbackexception.UserMgtFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "cloud-user", fallbackFactory = UserMgtFallBack.class)
public interface IUserMgtService
{
    @GetMapping(value = "/user/mgt/queryusers/{id}")
    List<UserModel> getUsers(@PathVariable Long id);

    @GetMapping("/user/mgt/testError")
    Object testError();
}
