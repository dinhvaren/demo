package com.cybersoft.cozastore03.Security;

import com.cybersoft.cozastore03.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

import java.time.Clock;

@Service
public class CustomAuthenProvider implements AuthenticationProvider {
    @Autowired
    private LoginService loginService;

//    nếu trả ra một authentication là đăng nhập thành công nếu ngược lại sẽ là thất bại
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();
        if (loginService.checkLogin(username,password)){
            return authentication;
        }
        System.out.println("kiểm tra: " + username + " - " + password);
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {

        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
