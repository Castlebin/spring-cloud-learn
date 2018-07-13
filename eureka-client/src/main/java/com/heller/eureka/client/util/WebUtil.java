package com.heller.eureka.client.util;

import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WebUtil {

    public static ServletRequestAttributes getServletRequestAttributes() {
        try {
            Method method = WebApplicationContextUtils.class.getDeclaredMethod("currentRequestAttributes");
            method.setAccessible(true);
            Object result = method.invoke(WebApplicationContextUtils.class);
            return (ServletRequestAttributes) result;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static HttpServletRequest getRequest() {
        return getServletRequestAttributes().getRequest();
    }

    public static HttpServletResponse getResponse() {
        return getServletRequestAttributes().getResponse();
    }

}
