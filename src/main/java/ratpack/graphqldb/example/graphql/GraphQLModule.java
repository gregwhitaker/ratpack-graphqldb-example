package ratpack.graphqldb.example.graphql;

import com.google.inject.AbstractModule;
import ratpack.graphqldb.example.graphql.handler.GraphQLHandler;

public class GraphQLModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(GraphQLHandler.class);
    }
}
