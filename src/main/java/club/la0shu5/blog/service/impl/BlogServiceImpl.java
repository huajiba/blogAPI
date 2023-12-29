package club.la0shu5.blog.service.impl;

import club.la0shu5.blog.entity.Blog;
import club.la0shu5.blog.mapper.BlogMapper;
import club.la0shu5.blog.service.IBlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
