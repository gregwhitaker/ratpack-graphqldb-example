# API

    mutation linkSave {
        linkSave(url: "http://www.test.com", description: "This is a test") {
          id
          url
          description
        }
    }