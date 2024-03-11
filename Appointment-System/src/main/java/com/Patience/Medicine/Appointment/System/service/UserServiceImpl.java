package com.Patience.Medicine.Appointment.System.service;

import com.Patience.Medicine.Appointment.System.dto.UserRegistrationRequest;
import com.Patience.Medicine.Appointment.System.model.AppUser;
import com.Patience.Medicine.Appointment.System.model.User;
import com.Patience.Medicine.Appointment.System.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void registerUser(UserRegistrationRequest request) {
        AppUser appUser = new AppUser();
        appUser.setUsername(request.getUsername());
        appUser.setPassword(passwordEncoder.encode(request.getPassword()));
        appUser.setName(request.getName());
        appUser.setContact(request.getContact());
        appUser.setMedicalHistory(request.getMedicalHistory());

        //userRepository.save(appUser);
    }

    // Implement other UserService methods as needed

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        org.springframework.security.core.userdetails.User appUser = userRepository.findByUsername(username);

        if (appUser == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

        return org.springframework.security.core.userdetails.User.builder()
                .username(appUser.getUsername())
                .password(appUser.getPassword())
                .roles("USER")  // Add user roles here if needed
                .build();
    }

    @Override
    public org.springframework.security.core.userdetails.User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void updateUser(User user) {
        // Implementation for updating a user
    }

    @Override
    public void deleteUser(Long id) {
        // Implementation for deleting a user
        userRepository.deleteById(id);
    }

    @Override
    public List<org.springframework.security.core.userdetails.User> getAllUsers() {
        // Implementation for retrieving all users
        return userRepository.findAll();
    }
}
