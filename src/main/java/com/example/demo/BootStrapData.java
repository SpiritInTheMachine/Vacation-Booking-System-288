package com.example.demo;

import com.example.demo.dao.CustomersRepository;
import com.example.demo.dao.DivisionsRepository;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomersRepository customersRepository;
    private final DivisionsRepository divisionsRepository;

    //constructor
    public BootStrapData(CustomersRepository customersRepository, DivisionsRepository divisionsRepository) {
        this.customersRepository = customersRepository;
        this.divisionsRepository = divisionsRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(customersRepository.count() == 1) {

            Customer customer1 = new Customer();
            customer1.setFirstName("George");
            customer1.setLastName("Sears");
            customer1.setPostal_code("11111");
            customer1.setAddress("111 La-Li-Lu-Le-Lo St.");
            customer1.setPhone("(111)222-1234");
            customer1.setDivision(divisionsRepository.findAll().get(1));
            customer1.setCreateDate(new Date());
            customer1.setLastUpdate(new Date());

            customersRepository.save(customer1);

            Customer customer2 = new Customer();
            customer2.setFirstName("Kojima");
            customer2.setLastName("Hideo");
            customer2.setPostal_code("22222");
            customer2.setAddress("222 The Patriots St.");
            customer2.setPhone("(222)212-4321");
            customer2.setDivision(divisionsRepository.findAll().get(2));
            customer2.setCreateDate(new Date());
            customer2.setLastUpdate(new Date());

            customersRepository.save(customer2);

            Customer customer3 = new Customer();
            customer3.setFirstName("Makoto");
            customer3.setLastName("Kusanagi");
            customer3.setPostal_code("33333");
            customer3.setAddress("333 Eastside Square 6-27-30 Shinjuku");
            customer3.setPhone("(333)313-1342");
            customer3.setDivision(divisionsRepository.findAll().get(3));
            customer3.setCreateDate(new Date());
            customer3.setLastUpdate(new Date());

            customersRepository.save(customer3);

            Customer customer4 = new Customer();
            customer4.setFirstName("Elend");
            customer4.setLastName("Venture");
            customer4.setPostal_code("44444");
            customer4.setAddress("444 The Well of Ascension St.");
            customer4.setPhone("(444)141-2341");
            customer4.setDivision(divisionsRepository.findAll().get(4));
            customer4.setCreateDate(new Date());
            customer4.setLastUpdate(new Date());

            customersRepository.save(customer4);

            Customer customer5 = new Customer();
            customer5.setFirstName("Viktor");
            customer5.setLastName("Idinarohk");
            customer5.setPostal_code("55555");
            customer5.setAddress("555 Arcs Styrie St.");
            customer5.setPhone("(555)551-3214");
            customer5.setDivision(divisionsRepository.findAll().get(5));
            customer5.setCreateDate(new Date());
            customer5.setLastUpdate(new Date());

            customersRepository.save(customer5);

            customersRepository.save(customer1);
            customersRepository.save(customer2);
            customersRepository.save(customer3);
            customersRepository.save(customer4);
            customersRepository.save(customer5);


            System.out.println("Customers added.");
        } else {
            System.out.println("Customers already exist.");
        }



    }
}
