package ratpack.graphqldb.example.graphql.mutator;

import com.google.inject.Inject;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import ratpack.graphqldb.example.data.link.LinkRepository;

public class DeleteLinkMutator implements DataFetcher<Boolean> {

    @Inject
    private LinkRepository linkRepo;

    @Override
    public Boolean get(DataFetchingEnvironment environment) {
        return null;
    }
}
