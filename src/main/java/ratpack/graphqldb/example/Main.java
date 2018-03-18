package ratpack.graphqldb.example;

import ratpack.graphqldb.example.config.DatabaseConfig;
import ratpack.graphqldb.example.data.DataModule;
import ratpack.graphqldb.example.graphql.GraphQLModule;
import ratpack.graphqldb.example.graphql.handler.GraphQLHandler;
import ratpack.guice.Guice;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;

/**
 * Starts the ratpack-graphqldb-example service.
 */
public class Main {

    public static void main(String... args) throws Exception {
        RatpackServer.start(s -> s
                .serverConfig(c -> c
                        .yaml("config.yaml")
                        .require("/database", DatabaseConfig.class)
                        .env()
                        .baseDir(BaseDir.find())
                        .build()
                )
                .registry(Guice.registry(b -> b
                        .module(GraphQLModule.class)
                        .module(DataModule.class))
                )
                .handlers(chain -> chain
                        .post("graphql", GraphQLHandler.class)
                )
        );
    }
}
