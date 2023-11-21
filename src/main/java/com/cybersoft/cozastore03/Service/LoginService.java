package com.cybersoft.cozastore03.Service;

import com.cybersoft.cozastore03.Entity.UserEntity;
import com.cybersoft.cozastore03.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;
    public boolean checkLogin(String username, String password) {
        UserEntity userEntity = userRepository.findByEmail(username);
//        nếu truy vấn có dữ liệu tức user tồn tại
        if (userEntity != null)
//            kiểm tra password trong database có match với password user truyền lên hay không
            if (passwordEncoder.matches(password,userEntity.getPassword())){
                return true;
        }
        return false;
    }
}
