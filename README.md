# ratpack-graphqldb-example

An example of exposing database data using [GraphQL](http://graphql.org/) and [Ratpack](https://www.ratpack.io).

## Prerequisites
This example requires that you have a running [PostgreSQL](https://www.postgresql.org/) database. You can start one as a Docker container using the following commands:

    $ docker pull postgres
    $ docker run -p 5432:5432 postgres

## Running the Example
You can start the example by running the following Gradle command:

    $ ./gradlew run 

Once the application has started, use [GraphQL Playground](https://github.com/graphcool/graphql-playground) to explore the API at [http://localhost:5050/graphql](http://localhost:5050/graphql).

Please refer to the [API Documentation](API.md) for example queries.

## Bugs and Feedback
For bugs, questions, and discussions please use the [Github Issues](https://github.com/gregwhitaker/ratpack-graphqldb-example/issues).

## License
MIT License

Copyright (c) 2018 Greg Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.