import com.learning.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ahmadhassan on 6/6/17.
 */
public class Application {
    public static void main(String[] args) {
        //CustomerService service = new CustomerServiceImpl();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(service.findAll().get(0).getFirst_name());
    }
}
