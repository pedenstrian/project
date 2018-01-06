package com.lanou3g.dao;

import com.lanou3g.domain.Customer;
import com.lanou3g.utils.HibernateUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/12/12.
 */
public class CustomerDao {

    /**
     * 保存客户
     */
    public void add(Customer customer){
        HibernateUtils.getCurrentSession().save(customer);
    }

    public List<Customer> queryAll() {
        return HibernateUtils.getCurrentSession().createQuery("from Customer").list();
    }
}
