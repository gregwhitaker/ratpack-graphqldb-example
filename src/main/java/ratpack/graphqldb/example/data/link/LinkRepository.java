package ratpack.graphqldb.example.data.link;

import ratpack.graphqldb.example.data.link.model.Link;

import java.util.List;

/**
 * Repository for accessing {@link Link} objects.
 */
public interface LinkRepository {

    /**
     * Retrieve all links in the repository.
     *
     * @return
     */
    List<Link> findAll();

    /**
     * Retrieve a single link by name from the repository.
     *
     * @param id link identifier
     * @return
     */
    Link findOne(String id);

    /**
     * Save a new link to the repository.
     *
     * @param url link url
     * @param description link description
     */
    Link save(String url, String description);

    /**
     * Update a named link in the repository.
     *
     * @param id link identifier
     * @param link updated link
     * @return
     */
    Link update(String id, Link link);

    /**
     * Delete a link from the repository.
     *
     * @param id link identifier
     */
    boolean delete(String id);
}
