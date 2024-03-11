package com.Patience.Medicine.Appointment.System.repository;

import com.Patience.Medicine.Appointment.System.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
