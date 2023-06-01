package services;

import dtos.Requests.CustomerRegistrationRequest;
import dtos.Response.CustomerRegistrationResponse;
import org.springframework.stereotype.Service;

public interface CustomerService {
    CustomerRegistrationResponse register(CustomerRegistrationRequest CustomerRegistrationRequest);
}
