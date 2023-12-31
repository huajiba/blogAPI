package club.la0shu5.blog.controller;

import club.la0shu5.blog.entity.User;
import club.la0shu5.blog.mapper.UserMapper;
import club.la0shu5.blog.service.IUserService;
import club.la0shu5.common.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author La0Shu5
 * @since 2023-12-29
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/findAll")
    public Result<List<User>> getAll() {
        return Result.success(userService.list(),"查询成功");
    }

    @PostMapping("/login")
    public Result<Map<String,Object>> login(@RequestBody User user){
        Map<String,Object> data = userService.login(user);
        if (data!=null){
            return Result.success(data);
        }
        return Result.fail(20002,"用户名或密码错误");
    }
}
