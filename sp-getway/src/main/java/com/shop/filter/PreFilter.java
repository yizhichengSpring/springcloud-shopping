package com.shop.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static com.shop.constants.RequestNames.GET;

/**
 * @author yi
 * @ClassName PreFilter
 * @Description 请求分发之前，我们在这里校验参数
 * @Date
 **/
@Slf4j
@Component
public class PreFilter extends ZuulFilter {


    /**
     * 过滤器类型 pre
     * @return
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     * 优先级 数字越小越先执行
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否开启过滤器 true开启
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return false;
    }


    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String method = request.getMethod();
        if (!checkToken(method,request)) {
            log.info("error!");
            return false;
        }
        return true;
    }


    private boolean checkToken(String method,HttpServletRequest request) {
        if (GET.equals(method)) {
            String queryString = request.getQueryString();
            return queryString.contains("token") ? true:false;
        } else {
            String queryString = request.getQueryString();
            return queryString.contains("token") ? true:false;
        }

    }
}
