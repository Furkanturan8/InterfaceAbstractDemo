package Abstracts;

import Entities.Customer;

public interface ICustomerCheckService {

    boolean checkIfRealCustomer(Customer customer);

}
