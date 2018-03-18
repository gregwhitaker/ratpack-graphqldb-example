package ratpack.graphqldb.example.graphql;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Provides;
import graphql.schema.idl.RuntimeWiring;
import ratpack.graphqldb.example.data.link.LinkRepository;
import ratpack.graphqldb.example.graphql.handler.GraphQLHandler;

public class GraphQLModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(GraphQLHandler.class);
    }

    @Inject
    @Provides
    public RuntimeWiring runtimeWiring(LinkRepository linkRepo) {
        return null;
    }
}
