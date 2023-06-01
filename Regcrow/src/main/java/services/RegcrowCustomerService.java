package services;

import data.models.BioData;
import data.models.Customer;
import data.repositories.CustomerRepository;
import dtos.Requests.CustomerRegistrationRequest;
import dtos.Response.CustomerRegistrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public CustomerRegistrationResponse register(CustomerRegistrationRequest customerRegistrationRequest) {
        String customerEmail = customerRegistrationRequest.getEmail();
        String customerPassword = customerRegistrationRequest.getPassword();

        BioData bioData = BioData.builder()
                .email(customerEmail)
                .password(customerPassword)
                .build();


        Customer customer = new Customer();
        return null;
    }

    private void email(String customerEmail) {
    }
}
