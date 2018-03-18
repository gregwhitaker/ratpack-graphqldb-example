package ratpack.graphqldb.example.data.link.model;

public class Link {
    private final long id;
    private final String url;
    private final String description;

    public Link(final long id, final String url, final String description) {
        this.id = id;
        this.url = url;
        this.description = description;
    }

    /**
     * @return link identifier
     */
    public long getId() {
        return id;
    }

    /**
     * @return link url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return link description
     */
    public String getDescription() {
        return description;
    }
}
