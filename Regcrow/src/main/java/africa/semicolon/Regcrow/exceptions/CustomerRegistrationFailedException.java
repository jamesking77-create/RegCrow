package africa.semicolon.Regcrow.exceptions;

public class CustomerRegistrationFailedException extends RegcrowException{
    public CustomerRegistrationFailedException(String customerRegistrationFailed) {
        super(customerRegistrationFailed);
    }
}
