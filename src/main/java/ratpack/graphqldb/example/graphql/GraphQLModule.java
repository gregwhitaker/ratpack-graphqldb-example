package ratpack.graphqldb.example.graphql;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Provides;
import com.google.inject.multibindings.MapBinder;
import graphql.schema.DataFetcher;
import graphql.schema.idl.RuntimeWiring;
import ratpack.graphqldb.example.graphql.handler.GraphQLHandler;
import ratpack.graphqldb.example.graphql.mutator.DeleteLinkMutator;
import ratpack.graphqldb.example.graphql.mutator.SaveLinkMutator;
import ratpack.graphqldb.example.graphql.mutator.UpdateLinkMutator;
import ratpack.graphqldb.example.graphql.query.AllLinksQuery;
import ratpack.graphqldb.example.graphql.query.LinkQuery;

import java.util.Map;

public class GraphQLModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(GraphQLHandler.class);

        MapBinder<String, DataFetcher> dataFetchersBinder = MapBinder.newMapBinder(binder(), String.class, DataFetcher.class);
        dataFetchersBinder.addBinding(AllLinksQuery.class.getName()).to(AllLinksQuery.class);
        dataFetchersBinder.addBinding(LinkQuery.class.getName()).to(LinkQuery.class);
        dataFetchersBinder.addBinding(DeleteLinkMutator.class.getName()).to(DeleteLinkMutator.class);
        dataFetchersBinder.addBinding(SaveLinkMutator.class.getName()).to(SaveLinkMutator.class);
        dataFetchersBinder.addBinding(UpdateLinkMutator.class.getName()).to(UpdateLinkMutator.class);
    }

    @Inject
    @Provides
    public RuntimeWiring runtimeWiring(Map<String, DataFetcher> dataFetchers) {
        return RuntimeWiring.newRuntimeWiring()
                .type("QueryType", wiring -> wiring
                        .dataFetcher("allLinks", dataFetchers.get(AllLinksQuery.class.getName()))
                        .dataFetcher("link", dataFetchers.get(LinkQuery.class.getName()))
                )
                .type("MutationType", wiring -> wiring
                        .dataFetcher("linkSave", dataFetchers.get(SaveLinkMutator.class.getName()))
                        .dataFetcher("linkUpdate", dataFetchers.get(UpdateLinkMutator.class.getName()))
                        .dataFetcher("linkDelete", dataFetchers.get(DeleteLinkMutator.class.getName()))
                )
                .build();
    }
}
