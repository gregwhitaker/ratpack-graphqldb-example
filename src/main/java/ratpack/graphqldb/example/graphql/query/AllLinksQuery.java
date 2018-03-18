package ratpack.graphqldb.example.graphql.query;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import ratpack.graphqldb.example.data.link.model.Link;

import java.util.List;

public class AllLinksQuery implements DataFetcher<List<Link>> {
    
    @Override
    public List<Link> get(DataFetchingEnvironment environment) {
        return null;
    }
}
