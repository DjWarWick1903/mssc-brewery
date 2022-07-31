package guru.springframework.msscbrewery.services.v1;

import guru.springframework.msscbrewery.web.model.v1.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
    CustomerDto saveNewCustomer(CustomerDto customerDto);
    void updateCustomer(UUID customerId, CustomerDto customerDto);
    void deleteById(UUID customerId);
}
