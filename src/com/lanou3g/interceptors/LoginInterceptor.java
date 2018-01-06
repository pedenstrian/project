package com.lanou3g.interceptors;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

/**
 * Created by Administrator on 2017/12/12.
 */
public class LoginInterceptor extends MethodFilterInterceptor{

    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        Object currenUser = ServletActionContext.getRequest().getSession().getAttribute("CurrentUser");
        if(currenUser==null) {
            return "login";
        }
        return actionInvocation.invoke();
    }
}
