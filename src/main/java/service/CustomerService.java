package service;

import model.Customer;
import model.enums.AccountType;
import repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

public class CustomerService {

    private CustomerRepository customerRepository = new CustomerRepository();

    public void save(String name, String surname, String email, String password) {

        Customer customer1 = new Customer(name, surname, email, password); // hash olarak tutulsun.

        customerRepository.createCustomer(customer1);

    }

    public List<Customer> getCustomerList() {
        return customerRepository.getCustomerList();
    }

    public void changeAccountType(String email, AccountType accountType) {

        Optional<Customer> foundCustomer = getCustomerList()
                .stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findFirst();

        if (foundCustomer.isPresent()) {
            foundCustomer.get().setAccountType(accountType);
        }
    }

    public void changeAccountTypeByCredit(String email, AccountType accountType) { //ödev

    }


}
