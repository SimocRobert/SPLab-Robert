package com.example.SpLab_Robert.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class RequestLoggingFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain
    ) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        System.out.println("[Before] Request: " + req.getMethod() + " " + req.getRequestURI());

        chain.doFilter(request, response);

        System.out.println("[After] Request processed: " + req.getMethod() + " " + req.getRequestURI());
    }
}
