package club.la0shu5.blog.service.impl;

import club.la0shu5.blog.entity.User;
import club.la0shu5.blog.mapper.UserMapper;
import club.la0shu5.blog.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author La0Shu5
 * @since 2023-12-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
