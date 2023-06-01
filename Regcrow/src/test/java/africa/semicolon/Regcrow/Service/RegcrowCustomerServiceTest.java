package africa.semicolon.Regcrow.Service;

import africa.semicolon.Regcrow.dtos.Requests.CustomerRegistrationRequest;
import africa.semicolon.Regcrow.dtos.Response.CustomerRegistrationResponse;
import africa.semicolon.Regcrow.exceptions.CustomerRegistrationFailedException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import africa.semicolon.Regcrow.services.CustomerService;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class RegcrowCustomerServiceTest {
    @Autowired
    private CustomerService customerService;


    @Test public void testThatCustomerCanRegister() throws CustomerRegistrationFailedException {
        CustomerRegistrationRequest customerRegistrationRequest = new CustomerRegistrationRequest();
        customerRegistrationRequest.setEmail("tinu@email.com");
        customerRegistrationRequest.setPassword("");

       CustomerRegistrationResponse registrationResponse = customerService.register(customerRegistrationRequest);

       assertThat(registrationResponse).isNotNull();

    }
}
