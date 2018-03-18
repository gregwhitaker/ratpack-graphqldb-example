package ratpack.graphqldb.example.graphql.mutator;

import com.google.inject.Inject;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import ratpack.graphqldb.example.data.link.LinkRepository;
import ratpack.graphqldb.example.data.link.model.Link;

public class UpdateLinkMutator implements DataFetcher<Link> {

    @Inject
    private LinkRepository linkRepo;

    @Override
    public Link get(DataFetchingEnvironment environment) {
        String id = environment.getArgument("id");
        String url = environment.getArgument("url");
        String desc = environment.getArgument("description");

        Link link = new Link(id, url, desc);

        return linkRepo.update(id, link);
    }
}