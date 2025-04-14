package _03_behavioral_patterns._13_chain_of_responsibilities._03_java;

import demo.beanContainer.annotation.Bean;
import demo.beanContainer.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/** Note
  WebSecurityConfigurerAdapter
   * Spring Security 5.7부터 Deprecated
   * Spring Security 6.0에서는 완전히 제거됨
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig{
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth ->
                        auth.anyRequest().authenticated()
                )
                .formLogin(Customizer.withDefaults());

        return http.build();
    }
}
