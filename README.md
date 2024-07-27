### References
#### Docker - Dockerizing your Spring Boot Application | Java Techie https://www.youtube.com/watch?v=e3YERpG2rMs

### Executions
```Docker
docker build -t phongvo0222/devops-automation-integration .
docker run -d --name infallible_franklin2 -p 9192:8090 -e SERVER_PORT=8090 phongvo0222/devops-automation-integration
```
```Postman
GET >> localhost:9192/devops-automation
```