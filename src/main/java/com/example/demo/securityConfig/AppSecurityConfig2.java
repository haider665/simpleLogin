package com.example.demo.securityConfig;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
public class AppSecurityConfig2 {//extends WebSecurityConfigurerAdapter {

	
//	@Autowired
//	DataSource dataSource;
//	
//	@Autowired
//	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
//		
//	  auth.jdbcAuthentication().dataSource(dataSource)
//		.usersByUsernameQuery(
//			"select email,password, enabled from users where email=?")
//		.authoritiesByUsernameQuery(
//			"select email, role from user_roles where email=?");
//	}	
	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		
//		UserBuilder user = User.withDefaultPasswordEncoder();
//		auth.inMemoryAuthentication()
//			.withUser(user.username("haider").password("123").roles("ADMIN","EMPLOYEE"))
//			.withUser(user.username("mofiz").password("123").roles("MANAGER","EMPLOYEE"))
//			.withUser(user.username("mojib").password("123").roles("EMPLOYEE"));
//		
//		
//	}
	

//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http.authorizeRequests()
////			.antMatchers("/").hasRole("EMPLOYEE")
////			.antMatchers("/leader/**").hasRole("MANAGER")
//			.antMatchers("/admin/**").hasRole("ADMIN")
//			.and()
//			.formLogin()
//				.loginPage("/adminLogin")
//				.loginProcessingUrl("/authenticateTheUser")
//				
//				.permitAll()
//			.and()
//			
//			
//			.logout().permitAll()
//			.and()
//			.exceptionHandling().accessDeniedPage("/accessDenied");
//		
//	}
	


//	@Override
//    public void configure(WebSecurity web) throws Exception {
//        //Web resources
//        web.ignoring().antMatchers("/css/**");
//        web.ignoring().antMatchers("/scripts/**");
//        web.ignoring().antMatchers("/images/**");
//        web.ignoring().antMatchers("/fonts/**");
//    }


	
	
	
	

}
