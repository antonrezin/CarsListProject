//package BackEndSpringBootProject.BackEndProject.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import BackEndSpringBootProject.BackEndProject.domain.UserRepository;
//
//@Service
//public class UserDetailServiceImpl implements UserDetailsService {
//	private final UserRepository repository;
//
//	@Autowired
//	public UserDetailServiceImpl(UserRepository userRepository) {
//		this.repository = userRepository;
//	}
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		User curruser = repository.findByUsername(username);
//		UserDetails user = new org.springframework.security.core.userdetails.User(username, curruser.getPasswordHash(),
//				AuthorityUtils.createAuthorityList(curruser.getRole()));
//		return user;
//	}
//	
//	@Autowired
//	private UserDetailServiceImpl userDetailsService;
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//	auth.userDetailsService(userDetailsService).passwordEncoder(new
//	BCryptPasswordEncoder());
//	}
//	
//}