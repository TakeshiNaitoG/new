package cl.ucn.disc.dsm.tnaito.news.service;

import java.util.List;

/**
 *
 *
 */
public interface Contratos {

    List<News> retriveNews(Integer size);

    void saveNews(News news);

}
