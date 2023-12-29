package club.la0shu5;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3366/nblog";
        String username = "root";
        String password = "123456";
        String outputDir = "D:\\Project\\MyBlog\\blogAPI\\src\\main\\java";
        String moduleName = "blog";
        String mapperXml = "D:\\Project\\MyBlog\\blogAPI\\src\\main\\resources\\mapper\\" + moduleName;
        String tables = "about,blog,blog_tag,category,city_visitor,comment,exception_log,friend,login_log,moment,operation_log,schedule_job,schedule_job_log,site_setting,tag,user,visit_log,visit_record,visitor";
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("La0Shu5") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            //.fileOverride() // 覆盖已生成文件
                            .outputDir(outputDir); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("club.la0shu5") // 设置父包名
                            .moduleName(moduleName) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, mapperXml)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tables); // 设置需要生成的表名
                    //.addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
