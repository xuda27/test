package cn.eden.test;



import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.eden.domain.User;
import cn.eden.service.IUserService;

import com.alibaba.fastjson.JSON;

/**
 * 测试Spring和MyBatis是否整合成功
 * @author eden
 *
 */

@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class Test {
	  private static Logger logger = Logger.getLogger(Test.class);  
	//  private ApplicationContext ac = null;  
	    @Resource  
	    private IUserService userService = null;  
	  
	//  @Before  
	//  public void before() {  
//	      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//	      userService = (IUserService) ac.getBean("userService");  
	//  }  
	  
	    @org.junit.Test  
	    public void test1() {  
	        User user = userService.getUserById(1);  
	        // System.out.println(user.getUserName());  
	        // logger.info("值："+user.getUserName());  
	        logger.info(JSON.toJSONString(user));  
	    }
}
