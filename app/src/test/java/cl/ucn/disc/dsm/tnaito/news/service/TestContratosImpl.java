package cl.ucn.disc.dsm.tnaito.news.service;

import com.github.javafaker.Faker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


/*
*
 */
public class TestContratosImpl {

    private static final Logger log = (Logger) LoggerFactory.getLogger(TestContratosImpl.class);
    @Test
    public void testRetriverNews()
    {
        log.debug("testing..");
        // the implementacion
        Contratos contratos = new ContratosImpl();
        //llama al metodo
        List<News> news = contratos.retriveNews(5);
        Assertions.assertNotNull(news," List was null :( ");
        Assertions.assertTrue(news.size() != 0 , " lista vacia :(" );
        Assertions.assertTrue(news.size() == 5 , "lista distinta a 5");

        log.debug("Done. ");
        
    }

    public void testFaker(){
        Faker faker = Faker.instance();
        for(int i = 0; i<5;i++){
            log.debug("Name:{}",faker.name().fullName());
            //FIXME Removerme
            System.out.println("Name:{}"+faker.name().fullName());

        }
    }
}
