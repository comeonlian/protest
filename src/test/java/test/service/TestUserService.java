package test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.lian.domain.User;
import com.lian.service.IUserService;


@RunWith(SpringJUnit4ClassRunner.class)  
@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })  
@ContextConfiguration(locations={"classpath:applicationContext.xml"}) 
public class TestUserService {
	@Autowired
	private IUserService service;
	
	@Test
	public void hasMatchUser() throws Exception{
		Boolean b1 = service.hasMatchUsesr("admin", "123456");
		Boolean b2 = service.hasMatchUsesr("admin", "1111");
		/*assertTrue(b1);
		assertTrue(b2);*/
	}
	
	@Test
	public void findUserByUserName() throws Exception{
		User user = service.findUserByUserName("admin");
		System.out.println(user);
	}
	
	@Test
	public void loginSuccess() throws Exception{
		User user = service.findUserByUserName("admin");
		service.loginSuccess(user);
	}
	
}
