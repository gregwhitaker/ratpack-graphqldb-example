# API
The following API is exposed by the ratpack-graphqldb-example service.

**Queries**

* [Get All Links](#get-all-links)
* [Get Link](#get-link)

**Mutators**

* [Save Link](#save-link)
* [Update Link](#update-link)
* [Delete Link](#delete-link)

## <a name="get-all-links"></a>Get All Links
Retrieves all links in the database.

### Request
Name: allLinks

Arguments: None

Query Fields:

| Property    | Type   | Description                 |
|-------------|--------|-----------------------------|
| id          | String | The link identifier         |
| url         | String | The url of the link         |
| description | String | The description of the link |

Example:

    {
      allLinks {
        id
        url
        description
      }
    }
    
### Response
Type: List of Link

| Property    | Type   | Description                 |
|-------------|--------|-----------------------------|
| id          | String | The link identifier         |
| url         | String | The url of the link         |
| description | String | The description of the link |

Example:

    {
      "data": {
        "allLinks": [
          {
            "id": "1",
            "url": "http://www.google.com",
            "description": "Google"
          },
          {
            "id": "2",
            "url": "http://www.test.com",
            "description": "This is a test"
          }
        ]
      }
    }


## <a name="get-link"></a>Get Link
Retrieves a link from the database.

### Request
Name: allLinks

Arguments:

| Property    | Type   | Required | Description                 |
|-------------|--------|----------|-----------------------------|
| id          | String | True     | The link identifier         |

Query Fields:

| Property    | Type   | Description                 |
|-------------|--------|-----------------------------|
| id          | String | The link identifier         |
| url         | String | The url of the link         |
| description | String | The description of the link |

Example:

    {
      link(id: "1") {
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
        "link": {
          "id": "1",
          "url": "http://www.google.com",
          "description": "Google"
        }
      }
    }
    
## <a name="save-link"></a>Save Link
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
    
## <a name="update-link"></a>Update Link
Updates an existing link in the database.

### Request
Name: linkUpdate

Arguments:

| Property    | Type   | Required | Description                 |
|-------------|--------|----------|-----------------------------|
| id          | String | True     | The link identifier         |
| url         | String | False    | The url of the link         |
| description | String | False    | The description of the link |

Example:

    mutation linkUpdate {
        linkUpdate(id: "1", url: "http://www.google.com/test", description: "This is a test") {
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
        "linkUpdate": {
          "id": "1",
          "url": "http://www.google.com/test",
          "description": "This is a test"
        }
      }
    }

## <a name="delete-link"></a>Delete Link
Deletes an existing link from the database.