package com.Patience.Medicine.Appointment.System.service;

import com.Patience.Medicine.Appointment.System.dto.UserRegistrationRequest;
import com.Patience.Medicine.Appointment.System.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    void registerUser(UserRegistrationRequest request);

    //org.springframework.security.core.userdetails.User getUserById(Long id);
    //User getUserById(Long id);
    void updateUser(User user);

    void deleteUser(Long id);

    org.springframework.security.core.userdetails.User getUserById(Long id);

    List<org.springframework.security.core.userdetails.User> getAllUsers();
}
