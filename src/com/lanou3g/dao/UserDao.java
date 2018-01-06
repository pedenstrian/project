package com.lanou3g.dao;

import com.lanou3g.domain.User;
import com.lanou3g.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 * Created by Administrator on 2017/12/12.
 */
public class UserDao {


    public User findByNameAndPwd(User user) {
        Session session = HibernateUtils.getCurrentSession();
        Query query = session.createQuery("from User where username = ? and password = ?");
        query.setParameter(0, user.getUsername());
        query.setParameter(1,user.getPassword());
        return (User)(query.list().get(0));
    }
}
