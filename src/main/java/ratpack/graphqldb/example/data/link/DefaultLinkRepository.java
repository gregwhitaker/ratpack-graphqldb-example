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
             PreparedStatement ps = conn.prepareStatement("")) {
            return null;
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public Link findOne(String id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("")) {
            return null;
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public Link save(Link link) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("")) {
            return null;
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public Link update(String id, Link link) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("")) {
            return null;
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public boolean delete(String id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("")) {
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
