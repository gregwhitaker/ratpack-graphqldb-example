package ratpack.graphqldb.example.data.link;

/**
 * Exception thrown when a link with the specified id cannot be found.
 */
public class LinkNotFoundException extends RuntimeException {
    private final Long id;

    public LinkNotFoundException(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
