package ratpack.graphqldb.example.graphql.mutator;

import com.google.inject.Inject;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import ratpack.graphqldb.example.data.link.LinkRepository;
import ratpack.graphqldb.example.data.link.model.Link;

public class SaveLinkMutator implements DataFetcher<Link> {

    @Inject
    private LinkRepository linkRepo;

    @Override
    public Link get(DataFetchingEnvironment environment) {
        return null;
    }
}
