package com.divyansh.security.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


import com.divyansh.services.UserServiceImpl;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserServiceImpl userServiceImpl;       
       
        @Override
    	protected void configure(HttpSecurity http) throws Exception {
    		http.authorizeRequests().antMatchers(
    				 "/registration**",
    	                "/js/**",
    	                "/css/**",
    	                "/img/**").permitAll()
    		.antMatchers("/users.html").hasAuthority("ADMIN")
    		.anyRequest().authenticated()
    		.and()
    		.formLogin()
    		.loginPage("/login")
    		.permitAll()
    		.and()
    		.logout()
    		.deleteCookies("JSESSIONID")
    		.invalidateHttpSession(true)
    		.clearAuthentication(true)
    		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
    		.logoutSuccessUrl("/login?logout")
    		.permitAll();

	}

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(userServiceImpl);
        auth.setPasswordEncoder(passwordEncoder());
        return auth;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }
} 
