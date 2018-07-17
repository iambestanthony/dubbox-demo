package com.jay;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jay.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/applicationContext-customer.xml")
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Reference
    private IUserService userService;
    @Test
    public void testSay()
    {
        System.out.println(userService.getClass());
        System.out.println(userService.getId());;
    }

}
