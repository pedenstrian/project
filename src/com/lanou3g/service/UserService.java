package com.lanou3g.service;

import com.lanou3g.dao.UserDao;
import com.lanou3g.domain.User;
import com.lanou3g.utils.HibernateUtils;
import org.hibernate.Transaction;

/**
 * Created by Administrator on 2017/12/12.
 */
public class UserService {

    public User findByNameAndPwd(User user) {
        Transaction tx = HibernateUtils.getCurrentSession().beginTransaction();
        User u = new UserDao().findByNameAndPwd(user);
        tx.commit();
        return u;
    }
}
