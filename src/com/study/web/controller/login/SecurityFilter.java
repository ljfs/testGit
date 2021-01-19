package com.study.web.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * 过滤登录
 * @author 刘俊沣
 *
 */
public class SecurityFilter extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("==>>Begin to Filter session====");
		// 创建session
        HttpSession session = request.getSession();
        //获取登录模型
        String login = (String) session.getAttribute("login");
        System.out.println("===??Current User=="+login);
        //获取路径的代码
        String curPath=request.getRequestURL().toString();
        System.out.println("===>> curpath:"+curPath);
        if (curPath.indexOf("WebRoot/layout")>=0){
            return true;
        }
        if(null==login || "".equals(login)){
            /**
             * 重定向到登录
             */
             request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
		return super.preHandle(request, response, handler);
	}
}
