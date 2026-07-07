package QuizManagementBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.quiz.service.QuizService;

@SpringBootApplication(scanBasePackages={"QuizManagementBoot","com.quiz"})
public class QuizManagementBootApplication implements CommandLineRunner {

    @Autowired
    private QuizService service;

    public static void main(String[] args) {
        SpringApplication.run(QuizManagementBootApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println(service.getQuestion(1));

        service.getQuestion(1)
               .getOptionList()
               .forEach(System.out::println);

    }

}
