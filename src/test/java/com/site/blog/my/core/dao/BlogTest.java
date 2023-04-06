package com.site.blog.my.core.dao;

import com.site.blog.my.core.entity.Blog;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @ClassName BlogTest
 * @Description TODO
 * @Author OuYangCong
 * @Date 2023/3/17
 * @Version 1.0
 **/
@SpringBootTest
public class BlogTest {
    @Resource
    BlogMapper blogMapper;

    @Test
    public void test1(){
        Blog blog=blogMapper.selectByPrimaryKey(1L);
        System.out.println(blog);
    }
}
