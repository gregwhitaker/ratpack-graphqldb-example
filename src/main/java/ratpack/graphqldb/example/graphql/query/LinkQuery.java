package ratpack.graphqldb.example.graphql.query;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import ratpack.graphqldb.example.data.link.model.Link;

public class LinkQuery implements DataFetcher<Link> {

    @Override
    public Link get(DataFetchingEnvironment environment) {
        return null;
    }
}
