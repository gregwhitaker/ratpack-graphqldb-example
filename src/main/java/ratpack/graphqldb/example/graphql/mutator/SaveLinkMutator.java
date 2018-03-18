package ratpack.graphqldb.example.graphql.mutator;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import ratpack.graphqldb.example.data.link.model.Link;

public class SaveLinkMutator implements DataFetcher<Link> {

    @Override
    public Link get(DataFetchingEnvironment environment) {
        return null;
    }
}
