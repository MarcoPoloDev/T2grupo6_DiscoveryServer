package pe.edu.cibertec.discoveryservergrupo06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServerGrupo06Application {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerGrupo06Application.class, args);
    }

}
