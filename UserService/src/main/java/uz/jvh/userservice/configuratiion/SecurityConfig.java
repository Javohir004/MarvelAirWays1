package uz.jvh.userservice.configuratiion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import uz.jvh.userservice.filter.JwtFilter;


@Configuration
public class SecurityConfig {
    private final String[] WHITE_LIST = {"/register", "/login", "api/v1/"};

    @Autowired
    private JwtFilter jwtFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((authorizeHttpRequestsConfigurer) -> {
                    authorizeHttpRequestsConfigurer
                            .requestMatchers("/css/**", "/js/**").permitAll()
                            .requestMatchers(WHITE_LIST).permitAll()
                            .anyRequest().authenticated();
                })
                .addFilterBefore(jwtFilter,
                        UsernamePasswordAuthenticationFilter.class)
                .build();
    }

}