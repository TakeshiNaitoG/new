/*
 *
 * Copyright 2020.  Takeshi Naito-Galleguillos
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 *  including without limitation the rights to use, copy, modify, merge, publish, distribute,
 *  sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 *  BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

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
    //asdasdsadasdasd


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
