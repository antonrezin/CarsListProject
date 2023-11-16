//package BackEndSpringBootProject.BackEndProject;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//import BackEndSpringBootProject.BackEndProject.controllers.UserDetailServiceImpl;
//
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//	@Autowired
//	private UserDetailServiceImpl userDetailsService;
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.authorizeRequests().antMatchers("/css/**").permitAll()
//		.and()
//		.authorizeRequests().anyRequest().authenticated()
//			.and()
//		.formLogin()
//			.loginPage("/login")
//			.permitAll()
//			.and()
//		.logout()
//			.permitAll();
//	}
//
//	@Bean
//	@Override
//	public UserDetails userDetailsService() {
//		List<UserDetails> users = new ArrayList();
//		UserDetails user = User.withDefaultPasswordEncoder()
//				.username("user")
//				.password("user")
//				.roles("USER")
//				.build();
//		
//		users.add(user);
//		
//		user = User.withDefaultPasswordEncoder()
//				.username("admin")
//				.password("admin")
//				.roles("USER", "ADMIN")
//				.build();
//				
//		users.add(user);
//		
//		return new InMemoryUserDetailsManager(users);
//	}
//
//}
