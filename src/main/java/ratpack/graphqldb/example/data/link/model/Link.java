package ratpack.graphqldb.example.data.link.model;

public class Link {
    private final String id;
    private final String url;
    private final String description;

    public Link(final Long id, final String url, final String description) {
        this(Long.toString(id), url, description);
    }

    public Link(final String id, final String url, final String description) {
        this.id = id;
        this.url = url;
        this.description = description;
    }

    /**
     * @return link identifier
     */
    public String getId() {
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
