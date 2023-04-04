package org.course.skeleton.model;

public class Leaflet extends Book {

    private final String coverImage;

    public Leaflet(String coverImage, String name, int pages) {
        super(name, pages);
        this.coverImage = coverImage;
    }

    public Leaflet(String coverImage) {
        super("My Leaflet", 1);
        this.coverImage = coverImage;
    }
}
