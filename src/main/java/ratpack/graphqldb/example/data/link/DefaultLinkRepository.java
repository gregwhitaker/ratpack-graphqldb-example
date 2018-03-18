package ratpack.graphqldb.example.data.link;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import ratpack.graphqldb.example.data.link.model.Link;

import javax.sql.DataSource;
import java.util.List;

@Singleton
public class DefaultLinkRepository implements LinkRepository {

    @Inject
    private DataSource dataSource;

    @Override
    public List<Link> findAll() {
        return null;
    }

    @Override
    public Link findOne(String name) {
        return null;
    }

    @Override
    public void save(Link link) {

    }

    @Override
    public Link update(String name, String link) {
        return null;
    }

    @Override
    public void delete(String name) {

    }
}
