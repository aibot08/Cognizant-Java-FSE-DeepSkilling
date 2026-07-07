package StockManagementBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.stock.service.StockService;

@SpringBootApplication(scanBasePackages = "com.stock")
@EntityScan("com.stock.entity")
@EnableJpaRepositories("com.stock.repository")
public class StockManagementBootApplication implements CommandLineRunner {

    @Autowired
    private StockService service;

    public static void main(String[] args) {
        SpringApplication.run(StockManagementBootApplication.class, args);
    }

    @Override
    public void run(String... args) {
        service.getFacebookStocks().forEach(System.out::println);
    }
}
