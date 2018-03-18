package ratpack.graphqldb.example.data.link;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ratpack.graphqldb.example.data.link.model.Link;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Default implementation of {@link LinkRepository} that accesses link
 * objects stored in a SQL database.
 */
@Singleton
public class DefaultLinkRepository implements LinkRepository {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultLinkRepository.class);

    @Inject
    private DataSource dataSource;

    @Override
    public List<Link> findAll() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM public.link")) {
            return null;
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public Link findOne(String id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM public.link WHERE link_id = ?")) {
            return null;
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public Link save(String url, String description) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("INSERT INTO public.link (link_url, link_desc) VALUES (?, ?)")) {
            return null;
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public Link update(String id, Link link) {
        if (findOne(id) != null) {
            // TODO: Make this a more explicit exception
            throw new RuntimeException();
        }

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("UPDATE public.link SET link_url = ?, link_desc = ? WHERE link_id = ?")) {
            return null;
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public boolean delete(String id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("DELETE FROM public.link WHERE link_id = ?")) {
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
