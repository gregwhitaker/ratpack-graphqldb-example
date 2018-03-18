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
    Link findOne(long id);

    /**
     * Save a new link to the repository.
     *
     * @param link {@link Link} to save
     */
    void save(Link link);

    /**
     * Update a named link in the repository.
     *
     * @param id link identifier
     * @param link updated link
     * @return
     */
    Link update(long id, Link link);

    /**
     * Delete a link from the repository.
     *
     * @param id link identifier
     */
    void delete(long id);
}
