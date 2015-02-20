package za.ac.cput.project;

import SettingConfig.AppConfig;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;

/**
 * Created by student on 2015/02/20.
 */
public class CalculateInterestTest {
    private CalculateInterest calc;
    @BeforeMethod
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotionConfigApplicationContext(AppConfig.class);
        calc = (CalculateInterest)ctx.getBean("calc1");
    }
    @Test
    public void testCalc()
    {

    }
    @AfterMethod
    public void tearDown() throws Exception{

    }

}
