package ac.za.cput.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("john").password("passwordjohn").roles("USER").and().withUser("peter").password("passwordpeter").roles("ADMIN");
    }
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests().antMatchers("/user/**","/admin/**","/restaurant/**","/foodinfo/**","/foodrate/**").hasRole("ADMIN")
                .and().authorizeRequests().antMatchers("/user/**","/foodrate/**","/foodinfo/**").hasRole("USER").and().csrf().disable().headers().frameOptions().disable();
    }


}
