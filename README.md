# ForumX
(work in progress)

ForumX is a web service that allows users to write articles/posts, share interesting stories and ideas.

Technologies used : Spring Boot REST API + Angular
## REST API (provided by Spring Boot)

The app offers REST API for accessing data.

### POST
| resource  | description  | body |
| :------------ |:---------------|:-----|
| `/api/client`|creates client |client JSON |
| `/api/hobby` | creates hobby | hobby JSON|
| `/api/status`| creates status |status JSON|
| `/api/post`| creates post (must specify the creator of the post)|post JSON|
| `/api/client/{idClient}/hobby/{idHobby}`| adds hobby to the client|none|
| `/api/client/{idClient}/post/{idPost}`| adds information about client's post/article visit|none|
| `/api/post/client/{idClient}/favoritePost/{idPost}`| adds post to the client's favorites |none|

#### Example Jsons
* Client
``` javascript
{
	"firstName" : "Jerzy",
	"lastName" : "Rosicki",
	"email" : "johan.smith@myserver.com",
	"username" : "jerzy",
	"password" : "ccb6ede3b0af912ffb9e2f0e620d21fbe11f0c26c4ca6698c8f6780451068396",
	"status" : {
		"idStatus" : 3
	}
}
```
* Post
``` javascript
{
	"name": "My first post",
	"content" : "Lorem ipsum...",
	"dateOfCreation" : "2019-03-15",
	"creator" : {
		"idClient" : 4
	}
}
```
### GET
| resource  | description|
| :------------ |:---------------|
| `/api/(client)(post)(status)(hobby)`|shows all clients or posts or statuses or hobbies |
| `/api/hobby` | creates hobby |
