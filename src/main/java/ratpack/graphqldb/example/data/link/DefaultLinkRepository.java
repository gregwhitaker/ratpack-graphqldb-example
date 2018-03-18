package ratpack.graphqldb.example.data.link;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import ratpack.graphqldb.example.data.link.model.Link;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Default implementation of {@link LinkRepository} that accesses link
 * objects stored in a SQL database.
 */
@Singleton
public class DefaultLinkRepository implements LinkRepository {

    @Inject
    private DataSource dataSource;

    @Override
    public List<Link> findAll() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM public.link")) {

            try (ResultSet rs = ps.executeQuery()) {
                List<Link> links = new ArrayList<>();

                while (rs.next()) {
                    links.add(new Link(Long.toString(rs.getLong("link_id")),
                            rs.getString("link_url"),
                            rs.getString("link_desc")));
                }

                return links;
            }
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public Link findOne(Long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM public.link WHERE link_id = ?")) {

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    return new Link(Long.toString(rs.getLong("link_id")),
                            rs.getString("link_url"),
                            rs.getString("link_desc"));
                }

                throw new LinkNotFoundException(id);
            }
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
    public Link update(Long id, Link link) {
        if (findOne(id) != null) {
            throw new LinkNotFoundException(id);
        }

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("UPDATE public.link SET link_url = ?, link_desc = ? WHERE link_id = ?")) {
            return null;
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public boolean delete(Long id) {
        if (findOne(id) != null) {
            throw new LinkNotFoundException(id);
        }
        
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("DELETE FROM public.link WHERE link_id = ?")) {
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
