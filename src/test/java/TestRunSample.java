import com.concretepage.RunSample;
import com.ocs.entity.SampleEntity;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Goodarzi on 02/16/2015.
 */
public class TestRunSample
        extends TestCase
{
    public void testRunn(){
//        ApplicationContext ctx = new XmlWebApplicationContext();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("persistContext.xml");

        RunSample runSample = ctx.getBean(RunSample.class);
        SampleEntity sampleEntity = new SampleEntity();
        sampleEntity.setDescription("asdas");
        runSample.run(sampleEntity);


    }
}
