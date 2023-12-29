package club.la0shu5.blog.service.impl;

import club.la0shu5.blog.entity.LoginLog;
import club.la0shu5.blog.mapper.LoginLogMapper;
import club.la0shu5.blog.service.ILoginLogService;
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
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements ILoginLogService {

}
