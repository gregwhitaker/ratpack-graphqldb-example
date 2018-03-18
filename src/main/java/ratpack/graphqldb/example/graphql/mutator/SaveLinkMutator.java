package ratpack.graphqldb.example.graphql.mutator;

import com.google.inject.Inject;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import ratpack.graphqldb.example.data.link.LinkRepository;
import ratpack.graphqldb.example.data.link.model.Link;

/**
 * GrapQL mutator that saves a new link to the repository.
 */
public class SaveLinkMutator implements DataFetcher<Link> {

    @Inject
    private LinkRepository linkRepo;

    @Override
    public Link get(DataFetchingEnvironment environment) {
        String url = environment.getArgument("url");
        String desc = environment.getArgument("description");

        return linkRepo.save(url, desc);
    }
}
