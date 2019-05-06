package com.bdqn.Interceptor;

import com.bdqn.filter.BodyReaderHttpServletRequestWrapper;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyHandlerInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception{
       /* try{
            response.setHeader("Content-type", "application/json;charset=UTF-8");
            String requestMethord = request.getRequestURI();//请求方法
            if(requestMethord==null){
                return false;
            }
            //获取请求参数
            JSONObject parameterMap = JSON.parseObject(new BodyReaderHttpServletRequestWrapper(request).getBodyString(request));
           if (parameterMap != null){
               String dataFrom = String.valueOf(parameterMap.get("dataFrom"));
           }
        }catch (Exception e){
            e.printStackTrace();
        }*/
        System.out.println("22");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception{
        System.out.println("11");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,Object handler,Exception ex) throws Exception{
        System.out.println("00");
    }


}
