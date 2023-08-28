package Concretes;

import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

    // bu sınıf herhangi bir kontrol olmaksızın true dondürsün. yani mernis kullanmasın
    @Override
    public boolean checkIfRealCustomer(Customer customer) {
        return true;
    }
}
