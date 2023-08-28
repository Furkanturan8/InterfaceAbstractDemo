import Abstracts.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concretes.CustomerCheckManager;
import Concretes.NeroCustomerManager;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        // Engin Demiroğ'un eğitiminde ödev verdiği projedir...

        BaseCustomerManager customerManager = new NeroCustomerManager(new CustomerCheckManager());
            customerManager.save(new Customer(1,"Furkan","Turan",new Date(2003,5,28),"123456")); // herhangi bir koşul istemeksizin kaydeder
        BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
            customerManager2.save(new Customer(2,"Mehmet","Turan",new Date(1999,4,21),"12345")); // özel koşul istediği için (veritabanından çekilen tc uyuştuğu için) kaydeder
        BaseCustomerManager customerManager3 = new NeroCustomerManager(new MernisServiceAdapter());
            customerManager3.save(new Customer(3,"Yusuf","Turan",new Date(2000,3,20),"2223")); //  özel koşul istediği için (veritabanından çekilen tc uyuşmadığı için) hata verir


    }
}