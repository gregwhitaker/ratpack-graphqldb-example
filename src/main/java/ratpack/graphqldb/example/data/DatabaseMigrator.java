package ratpack.graphqldb.example.data;

import com.google.inject.Inject;
import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ratpack.service.Service;
import ratpack.service.StartEvent;

import javax.sql.DataSource;

/**
 * Migrates database to latest version on application startup.
 */
public class DatabaseMigrator implements Service {
    private static final Logger LOG = LoggerFactory.getLogger(DatabaseMigrator.class);

    @Inject
    private DataSource dataSource;

    @Override
    public String getName() {
        return "DatabaseMigratorService";
    }

    @Override
    public void onStart(StartEvent event) throws Exception {
        LOG.info("Running Database Migration...");

        Flyway flyway = new Flyway();
        flyway.setDataSource(dataSource);
        flyway.migrate();
    }
}
