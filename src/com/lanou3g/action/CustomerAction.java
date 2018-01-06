package com.lanou3g.action;

import com.lanou3g.domain.Customer;
import com.lanou3g.domain.User;
import com.lanou3g.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import java.util.List;

/**
 * Created by Administrator on 2017/12/12.
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
    private Customer customer = new Customer();
    public Customer getModel() {
        return customer;
    }

    public String save(){
        new CustomerService().save(customer);
        return NONE;
    }

    public String query(){
        List<Customer> customers = new CustomerService().queryAll();
//        ServletActionContext.getValueStack(ServletActionContext.getRequest()).push(customers);
        ServletActionContext.getValueStack(ServletActionContext.getRequest()).set("customers",customers);
        return "listCustomer";
    }
}
