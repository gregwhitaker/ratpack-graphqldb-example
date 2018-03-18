package ratpack.graphqldb.example.graphql.mutator;

import com.google.inject.Inject;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import ratpack.graphqldb.example.data.link.LinkRepository;

/**
 * GraphQL mutator that deletes a link from the repository.
 */
public class DeleteLinkMutator implements DataFetcher<Boolean> {

    @Inject
    private LinkRepository linkRepo;

    @Override
    public Boolean get(DataFetchingEnvironment environment) {
        String id = environment.getArgument("id");

        return linkRepo.delete(Long.parseLong(id));
    }
}
