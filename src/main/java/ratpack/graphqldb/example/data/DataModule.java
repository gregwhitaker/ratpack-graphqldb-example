package ratpack.graphqldb.example.data;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ratpack.graphqldb.example.config.DatabaseConfig;
import ratpack.graphqldb.example.data.link.DefaultLinkRepository;
import ratpack.graphqldb.example.data.link.LinkRepository;

import javax.sql.DataSource;

public class DataModule extends AbstractModule {
    private static final Logger LOG = LoggerFactory.getLogger(DataModule.class);

    @Override
    protected void configure() {
        bind(DatabaseMigrator.class);
        bind(LinkRepository.class).to(DefaultLinkRepository.class);
    }

    @Singleton
    @Provides
    public DataSource dataSource(final DatabaseConfig config) {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl("jdbc:postgresql://" + config.host + ":" + config.port + "/" + config.database);
        hikariConfig.setConnectionTestQuery("SELECT 1");
        hikariConfig.setUsername(config.user);
        hikariConfig.setMaximumPoolSize(10);

        if (config.password != null) {
            hikariConfig.setPassword(config.password);
            LOG.info("Configured database connection: [url: {}, user: {}, passwordSet: true]", hikariConfig.getJdbcUrl(), hikariConfig.getUsername());
        } else {
            LOG.info("Configured database connection: [url: {}, user: {}, passwordSet: false]", hikariConfig.getJdbcUrl(), hikariConfig.getUsername());
        }

        return new HikariDataSource(hikariConfig);
    }
}
