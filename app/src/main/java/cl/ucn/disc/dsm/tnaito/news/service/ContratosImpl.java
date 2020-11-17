package cl.ucn.disc.dsm.tnaito.news.service;

import java.util.ArrayList;
import java.util.List;

/**
 * autor Takeshi Naito
 */

public class ContratosImpl implements Contratos {
    @Override
    public List<News> retriveNews(Integer size) {

        final List<News> news = new ArrayList<>();

        //TODO : Add the faker news to the list

        return news;
    }

    @Override
    public void saveNews(News news) {

    }

}
