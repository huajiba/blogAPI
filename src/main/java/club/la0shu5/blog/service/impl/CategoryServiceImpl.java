package club.la0shu5.blog.service.impl;

import club.la0shu5.blog.entity.Category;
import club.la0shu5.blog.mapper.CategoryMapper;
import club.la0shu5.blog.service.ICategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
