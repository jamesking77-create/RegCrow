package services;

import data.models.BioData;
import data.models.Customer;
import data.repositories.CustomerRepository;
import dtos.Requests.CustomerRegistrationRequest;
import dtos.Response.CustomerRegistrationResponse;
import exceptions.CustomerRegistrationFailedException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static utils.ExceptionUtils.USER_REGISTRATION_FAILED;
import static utils.ResponseUtils.USER_REGISTRATION_SUCCESSFUL;

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
        Customer savedCustomer = customerRepository.save(customer);
        boolean isNotSavedCustomer = savedCustomer.getId() != null;
        if (!isNotSavedCustomer) throw new CustomerRegistrationFailedException(
                String.format( USER_REGISTRATION_FAILED, customerEmail));

        CustomerRegistrationResponse customerRegistrationResponse = new CustomerRegistrationResponse();
        customerRegistrationResponse.setMessage(USER_REGISTRATION_SUCCESSFUL);
        return customerRegistrationResponse;
    }


}
