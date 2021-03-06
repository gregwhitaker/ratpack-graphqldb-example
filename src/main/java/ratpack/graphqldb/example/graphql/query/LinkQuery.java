package ratpack.graphqldb.example.graphql.query;

import com.google.inject.Inject;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import ratpack.graphqldb.example.data.link.LinkRepository;
import ratpack.graphqldb.example.data.link.model.Link;

/**
 * GraphQL query that returns a single link from the repository.
 */
public class LinkQuery implements DataFetcher<Link> {

    @Inject
    private LinkRepository linkRepo;

    @Override
    public Link get(DataFetchingEnvironment environment) {
        String id = environment.getArgument("id");

        return linkRepo.findOne(Long.parseLong(id));
    }
}
