package club.la0shu5.blog.controller;

import club.la0shu5.blog.entity.User;
import club.la0shu5.blog.mapper.UserMapper;
import club.la0shu5.blog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public List<User> getAll() {
        return userService.list();
    }
}
