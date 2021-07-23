package com.zyh.dianying.domain;

import java.util.Date;

public class Film {
    private Long id;
    private String film_id;
    private String name;
    private String director;
    private String player;
    private String type;
    private String country;
    private int length;
    private String synopsis;
    private int status;
    private Date   playtime;
    private String imgpath;

    public Film() {
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", film_id='" + film_id + '\'' +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", player='" + player + '\'' +
                ", type='" + type + '\'' +
                ", country='" + country + '\'' +
                ", length=" + length +
                ", synopsis='" + synopsis + '\'' +
                ", status=" + status +
                ", playtime=" + playtime +
                ", imgpath='" + imgpath + '\'' +
                '}';
    }

    public Film(Long id, String film_id, String name, String director, String player, String type, String country, int length, String synopsis, int status, Date playtime, String imgpath) {
        this.id = id;
        this.film_id = film_id;
        this.name = name;
        this.director = director;
        this.player = player;
        this.type = type;
        this.country = country;
        this.length = length;
        this.synopsis = synopsis;
        this.status = status;
        this.playtime = playtime;
        this.imgpath = imgpath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilm_id() {
        return film_id;
    }

    public void setFilm_id(String film_id) {
        this.film_id = film_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getPlaytime() {
        return playtime;
    }

    public void setPlaytime(Date playtime) {
        this.playtime = playtime;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }
}
