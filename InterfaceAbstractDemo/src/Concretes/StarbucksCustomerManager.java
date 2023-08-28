package Concretes;

import Abstracts.BaseCustomerManager;
import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    // starbucks kurumu mernis kullanma zorunluluğu olsun diyelim.
    // Main de starbucks mernis kullanıcak
    private  ICustomerCheckService iCustomerCheckService;
    public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
        this.iCustomerCheckService = iCustomerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {

        if(iCustomerCheckService.checkIfRealCustomer(customer)){
            super.save(customer);
        }else {
            System.out.println("Kayıt oluşturulamadı, tc hatalı!");
            throw new Exception("The registration process has not been completed!!");
        }

    }
}
