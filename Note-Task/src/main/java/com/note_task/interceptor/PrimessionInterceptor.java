package com.note_task.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/***
 *拦截器
 *
 * 1.创建一个类 实现一个接口HandlerInterceptor
 */
@Component //交给spring管理
public class PrimessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //获取前端提供的参数
        String token = request.getParameter("token");
        //判断token是否为空
        if (StringUtils.isEmpty(token)) {
            if ("123456".equals(token)) {
                //到达controller
                return true;
            } else {
                //指定指定响应字符集；处理乱码问题
                response.setContentType("text/html;charset=UTF-8");
                response.getWriter().println("权限不足");
            }
        }
        return false;

    }
}