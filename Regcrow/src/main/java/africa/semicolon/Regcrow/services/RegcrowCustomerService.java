package africa.semicolon.Regcrow.services;

import africa.semicolon.Regcrow.data.models.Customer;
import africa.semicolon.Regcrow.data.repositories.BioDataRepository;
import africa.semicolon.Regcrow.utils.ExceptionUtils;
import africa.semicolon.Regcrow.utils.ResponseUtils;
import africa.semicolon.Regcrow.data.models.BioData;
import africa.semicolon.Regcrow.data.repositories.CustomerRepository;
import africa.semicolon.Regcrow.dtos.Requests.CustomerRegistrationRequest;
import africa.semicolon.Regcrow.dtos.Response.CustomerRegistrationResponse;
import africa.semicolon.Regcrow.exceptions.CustomerRegistrationFailedException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class RegcrowCustomerService implements CustomerService {
    private final CustomerRepository customerRepository;







    // TODO: 6/1/2023 review this manual all args constructor...
//    @Autowired
//    public RegcrowCustomerService(CustomerRepository customerRepository){
//        this.customerRepository = customerRepository;
//    }
    @Override
    public CustomerRegistrationResponse register(CustomerRegistrationRequest customerRegistrationRequest) throws CustomerRegistrationFailedException {
        String customerEmail = customerRegistrationRequest.getEmail();
        String customerPassword = customerRegistrationRequest.getPassword();

        BioData bioData = BioData.builder()
                .email(customerEmail)
                .password(customerPassword)
                .build();

        Customer customer = new Customer();
        customer.setBioData(bioData);
        customer.setTimeCreated(LocalDateTime.now());
        Customer savedCustomer = customerRepository.save(customer);
        boolean isNotSavedCustomer = savedCustomer.getId() != null;
        if (!isNotSavedCustomer) throw new CustomerRegistrationFailedException(
                String.format( ExceptionUtils.USER_REGISTRATION_FAILED, customerEmail));

        CustomerRegistrationResponse customerRegistrationResponse = new CustomerRegistrationResponse();
        customerRegistrationResponse.setMessage(ResponseUtils.USER_REGISTRATION_SUCCESSFUL);
        return customerRegistrationResponse;
    }


}
