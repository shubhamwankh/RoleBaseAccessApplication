Normal Spring Boot Java Application Without Dockerization

use below curl to generate toke

```
curl --location 'https://dev-j733rp14m1zbn18a.us.auth0.com/oauth/token' \
--header 'content-type: application/json' \
--data '{"client_id":"xxxxxxxxx","client_secret":"xxxxxxxxxxx","audience":"xxxxxxx","grant_type":"client_credentials"}'
```