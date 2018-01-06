package com.lanou3g.action;

import com.lanou3g.domain.User;
import com.lanou3g.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/12/12.
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();
    public User getModel() {
        return user;
    }

    public String login(){
        User u = new UserService().findByNameAndPwd(user);
        if(u!=null){
            HttpSession session = ServletActionContext.getRequest().getSession();
            session.setAttribute("CurrentUser",u);
            return SUCCESS;
        }
        return LOGIN;
    }
}
