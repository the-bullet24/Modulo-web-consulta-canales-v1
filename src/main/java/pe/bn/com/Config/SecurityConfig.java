package pe.bn.com.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
	


@Configuration
@EnableWebSecurity

public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain (HttpSecurity httpSecurity) throws Exception {
		
		return httpSecurity
				.authorizeHttpRequests( auth -> {
					auth.requestMatchers("/datos/lista").permitAll();
					auth.requestMatchers("/datos/**").permitAll();
					auth.requestMatchers("/datos/eliminar/**").permitAll();	
					auth.anyRequest().authenticated();																	
				})
				
				.formLogin() .successHandler(successHandler()) //URL Redirect Sesion
				  .permitAll() // Permite para todos 
				  	.and()	
				  	.sessionManagement()	
					.sessionCreationPolicy(SessionCreationPolicy.ALWAYS)//ALWAYS - IF_REQUEIRED - NEVER - STATELESS
					.invalidSessionUrl("/form")
						.maximumSessions(2)
					//	.expiredUrl("/login")
					.sessionRegistry(sessionRegistry())
				.and()
					.sessionFixation()
						.migrateSession()
				.and()
					
				.build();
	
	}

@Bean
public SessionRegistry sessionRegistry() {
	return new SessionRegistryImpl();
}
	
	
	
public AuthenticationSuccessHandler successHandler () {
	return ((request, response, authentication) ->{
			response.sendRedirect("/datos/menu");
		});
			
}

	
}
