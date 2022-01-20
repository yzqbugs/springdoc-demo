


```java

   @PostMapping("/query")
    public User query(User user) {
        return user;
    }
```
it should be  refactored to
``` 
    "parameters": [
                 {
                   "name": "username",
                   "in": "query",
                   "description": "The user name for login",
                   "required": true,
                   "schema": {
                     "type": "string"
                   }
                 },
                 {
                   "name": "password",
                   "in": "query",
                   "description": "The password for login in clear text",
                   "required": true,
                   "schema": {
                     "type": "string"
                   }
                 }
               ],
```



while it's recognised as(i didn't give it a @RequestBody annotation)
``` 
   "requestBody": {
                           "content": {
                               "application/json": {
                                   "schema": {
                                       "$ref": "#/components/schemas/User"
                                   }
                               }
                           },
                           "required": true
                       },
```
