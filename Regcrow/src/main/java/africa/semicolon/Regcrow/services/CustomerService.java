package africa.semicolon.Regcrow.services;

import africa.semicolon.Regcrow.dtos.Requests.CustomerRegistrationRequest;
import africa.semicolon.Regcrow.dtos.Response.CustomerRegistrationResponse;
import africa.semicolon.Regcrow.exceptions.CustomerRegistrationFailedException;

public interface CustomerService {
    CustomerRegistrationResponse register(CustomerRegistrationRequest CustomerRegistrationRequest) throws CustomerRegistrationFailedException;
}
