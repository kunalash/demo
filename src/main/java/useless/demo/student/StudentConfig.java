package useless.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student kunal = new Student(1L, "Kunal", "Kunalash.it17@gmail.com", LocalDate.of(1995, Month.JUNE, 21));
            Student jd = new Student(2L, "JD", "Kunalash.it17@gmail.com", LocalDate.of(1995, Month.JUNE, 21));
            Student digi = new Student(3L, "Digi", "Kunalash.it17@gmail.com", LocalDate.of(1995, Month.JUNE, 21));
            Student rahul = new Student(4L, "Rahul", "Kunalash.it17@gmail.com", LocalDate.of(1995, Month.JUNE, 21));
            Student bansal = new Student(5L, "Bansal", "Kunalash.it17@gmail.com", LocalDate.of(1995, Month.JUNE,
                    21));
            studentRepository.saveAll(List.of(kunal, jd, digi, rahul, bansal));
        };
    }

}
