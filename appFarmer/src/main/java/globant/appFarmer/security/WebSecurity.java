package globant.appFarmer.security;

import globant.appFarmer.services.UserService;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFilter;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

    private final UserService userService;

    public WebSecurity(UserService userService) {
        this.userService = userService;
    }

    //Security rules for our app
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //In this way we specify that the url of / users with the POST method will be public but the other other requests must be authenticated
        http.cors().and()
                .csrf().disable().authorizeRequests()
                .antMatchers(HttpMethod.POST, "/api/v1/users").permitAll()
                .anyRequest()
                .permitAll();
    }


}
