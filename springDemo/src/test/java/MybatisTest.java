import com.jimmieRan.springDemo.modules.sys.service.UserServiceI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ran on 2017/1/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml", "classpath:mybatis-config.xml" })
public class MybatisTest {

    @Autowired
    UserServiceI userService;

    @Test
    public void testFindUserByNameMethod(){
        User user = userService.findByUsername("admin");
        if( user == null ){
            System.out.println("search failure!!!!!");
        }
        System.out.println(user.getUsername());
    }


}
