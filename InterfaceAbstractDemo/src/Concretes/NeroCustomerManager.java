package Concretes;

import Abstracts.BaseCustomerManager;
import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

    // Nero kurumu ise serbest olsun, mernis de kullanabilir, herhangi bir kontrol sistemi olmasa bile kayıt imkanı sunsun
    // Main de hem mernisi hem de CustomerCheckManager kullandığını düşünelim.
    private ICustomerCheckService iCustomerCheckService;

    public NeroCustomerManager(ICustomerCheckService iCustomerCheckService) {
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
