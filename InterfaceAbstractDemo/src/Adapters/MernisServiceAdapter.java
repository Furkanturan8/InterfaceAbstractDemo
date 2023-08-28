package Adapters;

import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {

    // burada aslında olması gereken bir veri tabanı ve bu veritabanından customer bilgilerine göre tc uyuşuyor mu uyuşmuyor mu, bu kontrol ediliyor
    // biz default olarak kullanıcının tc si : 12345 olsun diyelim ve uyuşmaz ise hata verdiğini düşünelim

    @Override
    public boolean checkIfRealCustomer(Customer customer) {
        if(customer.getNationalityId()=="12345"){
            return true;
        }
        else {
            return false;
        }
    }
}
