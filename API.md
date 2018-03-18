# API

## Save Link
Saves a new link in the database.

Name: linkSave

Arguments:
| Property    | Type   | Required | Description                 |
|-------------|--------|----------|-----------------------------|
| url         | String | False    | The url of the link         |
| description | String | False    | The description of the link |

Returns: Link

Example:

    mutation linkSave {
        linkSave(url: "http://www.test.com", description: "This is a test") {
          id
          url
          description
        }
    }