package ratpack.graphqldb.example.data.link;

import ratpack.graphqldb.example.data.link.model.Link;

import java.util.List;

public interface LinkRepository {

    List<Link> findAll();

    Link findOne(String name);

    void save(Link link);

    Link update(String name, String link);

    void delete(String name);
}
