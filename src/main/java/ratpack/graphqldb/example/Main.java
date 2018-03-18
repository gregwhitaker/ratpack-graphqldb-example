package ratpack.graphqldb.example;

import ratpack.graphqldb.example.data.DataModule;
import ratpack.graphqldb.example.graphql.GraphQLModule;
import ratpack.graphqldb.example.graphql.handler.GraphQLHandler;
import ratpack.guice.Guice;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;

public class Main {

    public static void main(String... args) throws Exception {
        RatpackServer.start(s -> s
                .serverConfig(c -> c
                        .yaml("config.yaml")
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
