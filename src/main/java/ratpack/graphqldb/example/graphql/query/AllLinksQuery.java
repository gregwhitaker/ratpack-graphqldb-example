package ratpack.graphqldb.example.graphql.query;

import com.google.inject.Inject;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import ratpack.graphqldb.example.data.link.LinkRepository;
import ratpack.graphqldb.example.data.link.model.Link;

import java.util.List;

public class AllLinksQuery implements DataFetcher<List<Link>> {

    @Inject
    private LinkRepository linkRepo;

    @Override
    public List<Link> get(DataFetchingEnvironment environment) {
        return null;
    }
}
