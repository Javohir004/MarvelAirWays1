package uz.jvh.userservice.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import uz.jvh.userservice.domain.DTO.request.LoginDto;
import uz.jvh.userservice.domain.DTO.response.JwtResponse;
import uz.jvh.userservice.domain.entity.User;


@Service
public class AuthService {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtService jwtService;

    public JwtResponse login(LoginDto loginDto) {
        User user = userService.findByUsername(loginDto.getUsername());
        if(passwordEncoder.matches(loginDto.getPassword(), user.getPassword())) {
            return new JwtResponse(jwtService.generateToken(user));
        }
        throw new UsernameNotFoundException("Wrong username or password");
    }

}
