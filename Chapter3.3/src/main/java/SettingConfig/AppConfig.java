package SettingConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.project.CalculateInterest;
import za.ac.cput.project.Employee;
import za.ac.cput.project.Pensioner;
import za.ac.cput.project.Student;

/**
 * Created by student on 2015/02/20.
 */
@Configuration
public class AppConfig {
    @Bean(name = "calc1")
    public CalculateInterest getStudent()
    {
        return new Student();
    }
    @Bean(name = "calc2")
    public CalculateInterest getEmployee()
    {
        return new Employee();
    }
    @Bean(name = "calc3")
    public CalculateInterest getPensioner()
    {
        return new Pensioner();
    }
}
