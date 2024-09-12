/*
 * package in.yuktisoftwares.query_management;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.http.SessionCreationPolicy; import
 * org.springframework.security.web.SecurityFilterChain;
 * 
 * //@Configuration public class SecurityConfiguration {
 * 
 * //@Bean SecurityFilterChain securityFilterChain(HttpSecurity http) throws
 * Exception { return
 * http.authorizeRequests().requestMatchers("/").permitAll().and()
 * .authorizeRequests().requestMatchers("/console/**").permitAll();
 * http.csrf().disable(); http.headers().frameOptions().disable(); } }
 */