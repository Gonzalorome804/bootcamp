package globant.appFarmer;

import java.util.logging.Logger;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class AppFarmerApplication {


    public static void main(String[] args) {
        SpringApplication.run(AppFarmerApplication.class, args);

    }

    //have a global ModelMapper instance so as not to be instantiating every time
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();
        return mapper;
    }

}