package com.lanou3g.service;

import com.lanou3g.dao.CustomerDao;
import com.lanou3g.domain.Customer;
import com.lanou3g.utils.HibernateUtils;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Administrator on 2017/12/12.
 */
public class CustomerService {
    /**
     * 保存客户
     * @param customer 客户
     */
    public void save(Customer customer){
        Transaction tx = HibernateUtils.getCurrentSession().beginTransaction();
        new CustomerDao().add(customer);
        tx.commit();
    };

    /**
     * 查询所有客户
     * @return
     */
    public List<Customer> queryAll() {
        Transaction tx =  HibernateUtils.getCurrentSession().beginTransaction();
        List<Customer> customers = new CustomerDao().queryAll();
        tx.commit();
        return customers;
    }
}
