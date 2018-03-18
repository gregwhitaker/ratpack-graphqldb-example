package ratpack.graphqldb.example.data;

import com.google.inject.AbstractModule;
import ratpack.graphqldb.example.data.link.DefaultLinkRepository;
import ratpack.graphqldb.example.data.link.LinkRepository;

public class DataModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(LinkRepository.class).to(DefaultLinkRepository.class);
    }
}
