package com.example.config;

import com.example.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
//        if(customer.getCountry().equals("United States")) {
//            return customer;
//        }else{
//            return null;
//        }
    }
}
