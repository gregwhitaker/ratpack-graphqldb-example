# API
The following API is exposed by the ratpack-graphqldb-example service.

## Save Link
Saves a new link in the database.

### Request
Name: linkSave

Arguments:

| Property    | Type   | Required | Description                 |
|-------------|--------|----------|-----------------------------|
| url         | String | False    | The url of the link         |
| description | String | False    | The description of the link |

Example:

    mutation linkSave {
        linkSave(url: "http://www.test.com", description: "This is a test") {
          id
          url
          description
        }
    }
    
### Response
Type: Link

| Property    | Type   | Description                 |
|-------------|--------|-----------------------------|
| id          | String | The link identifier         |
| url         | String | The url of the link         |
| description | String | The description of the link |

Example:

    {
      "data": {
        "linkSave": {
          "id": "4",
          "url": "http://www.test.com",
          "description": "This is a test"
        }
      }
    }