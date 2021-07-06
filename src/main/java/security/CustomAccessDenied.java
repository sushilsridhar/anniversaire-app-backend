package security;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomAccessDenied implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {

        System.out.println(httpServletRequest.getCookies());
        System.out.println(httpServletRequest.getHeaderNames());

        System.out.println(httpServletResponse.getHeaderNames());
        System.out.println(httpServletResponse.getStatus());

        System.out.println(e.getStackTrace());

    }
}
