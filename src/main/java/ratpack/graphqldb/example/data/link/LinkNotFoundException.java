package ratpack.graphqldb.example.data.link;

public class LinkNotFoundException extends RuntimeException {
    private final Long id;

    public LinkNotFoundException(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
