package com.zxx.mgr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @description:
 * @author: Andy
 * @time: 2021/4/17 15:59
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected  void configure(HttpSecurity http) throws  Exception{

         http.headers().frameOptions().sameOrigin();
         http.authorizeRequests()
                 .anyRequest()
                 .authenticated()
                 .and()
                 .formLogin()
                 .loginPage("/loginPage")
                 .permitAll()

                 .and()
                 .logout()
                 .logoutUrl("/logoutPage")
                 .logoutSuccessUrl("/loginPage?logout")
                 .permitAll();

    }

}
