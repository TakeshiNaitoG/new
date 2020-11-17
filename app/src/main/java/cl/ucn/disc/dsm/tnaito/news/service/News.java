package cl.ucn.disc.dsm.tnaito.news.service;

import org.threeten.bp.ZonedDateTime;

public final class News {
    private Long id;
    private String tittle;
    private String source;
    private String author;
    private String url;
    private String urlImage;
    private String description;
    private String content;
    private ZonedDateTime publishiedAt;




    // constructor
    public News(Long id, String tittle, String source, String author, String url, String urlImage, String description, String content, ZonedDateTime publishiedAt) {
        this.id = id;
        this.tittle = tittle;
        this.source = source;
        this.author = author;
        this.url = url;
        this.urlImage = urlImage;
        this.description = description;
        this.content = content;
        this.publishiedAt = publishiedAt;
    }
    //return de id
    public Long getId() {
        return id;
    }
    // return tittle
    public String getTittle() {
        return tittle;
    }
    //return source
    public String getSource() {
        return source;
    }
    //return
    public String getAuthor() {
        return author;
    }
    //return url
    public String getUrl() {
        return url;
    }
    //return url imagen
    public String getUrlImage() {
        return urlImage;
    }
    //return
    public String getDescription() {
        return description;
    }

    public String getContent() {
        return content;
    }

    public ZonedDateTime getPublishiedAt() {
        return publishiedAt;
    }


}
