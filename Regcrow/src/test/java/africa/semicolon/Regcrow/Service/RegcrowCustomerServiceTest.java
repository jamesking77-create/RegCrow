package africa.semicolon.Regcrow.Service;

import dtos.Requests.CustomerRegistrationRequest;
import dtos.Response.CustomerRegistrationResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import services.CustomerService;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class RegcrowCustomerServiceTest {
    @Autowired
    private CustomerService customerService;


    @Test public void testThatCustomerCanRegister(){
        CustomerRegistrationRequest customerRegistrationRequest = new CustomerRegistrationRequest();
        customerRegistrationRequest.setEmail("tinubu@email.com");
        customerRegistrationRequest.setPassword("");

       CustomerRegistrationResponse registrationResponse = customerService.register(customerRegistrationRequest);

       assertThat(registrationResponse).isNotNull();

    }
}
