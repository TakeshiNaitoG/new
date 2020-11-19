package cl.ucn.disc.dsm.tnaito.news.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;

public class TestContratosImplFaker {

    private static final Logger log = LoggerFactory.getLogger(TestContratosImplFaker.class);
    @Test
    public void testRetriveNews(){

        log.debug("testing ..");
        // crea la implementacion
        Contratos contratos = (Contratos) new ContratoImplFaker();
        //llamada al metodo
        List<News> news = contratos.retriveNews(5);
        //the list cant be null
        Assertions.assertNotNull(news, "lista nula");
        // the list cant be empty
        Assertions.assertFalse(news.isEmpty(),"lista vacia");
        //the size (list) == 5
        Assertions.assertEquals(5, news.size(),"lista != 5");
        //debug to log
        for (News n : news){
            log.debug("News: {}",n);
        }
        //size = 0
        Assertions.assertEquals(0,contratos.retriveNews(0),"lista!= 0");
        //size=3
        Assertions.assertEquals(3,contratos.retriveNews(3),"lista!=3");
        //size = 10
        Assertions.assertTrue(contratos.retriveNews(10).size()<=10,"lista != 10");
        log.debug("Done. ");
    }

    public void testSaveNews()
    {

    }
    


}
