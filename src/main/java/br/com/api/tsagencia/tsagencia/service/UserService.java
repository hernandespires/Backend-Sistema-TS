package br.com.api.tsagencia.tsagencia.service;

import br.com.api.tsagencia.tsagencia.exception.IdNotFoundException;
import br.com.api.tsagencia.tsagencia.model.User;
import br.com.api.tsagencia.tsagencia.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new IdNotFoundException("Usuário não encontrado"));
    }

    public User login(User user) {
         return userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword())
                 .orElseThrow(() -> new EntityNotFoundException("Email ou senha não loggados"));
    }
}