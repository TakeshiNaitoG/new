package cl.ucn.disc.dsm.tnaito.news.service;


import com.github.javafaker.Faker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

import java.util.ArrayList;
import java.util.List;

public class ContratoImplFaker {

    private static final Logger log = LoggerFactory.getLogger(ContratoImplFaker.class);
   //lista de news
    private final List<News> theNews= new ArrayList<>();
    public ContratoImplFaker()
    {
        final Faker faker = Faker.instance();

        for(int i = 0; i< 5; i++)
        {
            this.theNews.add(new News(
                Integer.toUnsignedLong(i),
                faker.book().title(),
                faker.name().username(),
                faker.name().fullName(),
                faker.internet().url(),
                faker.internet().avatar(),
                faker.harryPotter().quote(),
                faker.lorem().paragraph(3),
                ZonedDateTime.now(ZoneId.of("-3"))
                ));
        }
    }

    public List<News>retriverNews(final Integer size)
    {
        return theNews.subList(theNews.size() - size,theNews.size());
    }
    public void saveNews (final News news)
    {
        this.theNews.add(news);
    }


}
