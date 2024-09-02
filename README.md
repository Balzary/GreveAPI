# GreveAPI

##  About this project

This is a Java API that contains a simple CRUD with three different forms of searches

### Technologies
<p display="inline-block">
  <img width="48" src="https://raw.githubusercontent.com/jmnote/z-icons/master/svg/java.svg" alt="java-logo"/>
  <img width="48" src="https://raw.githubusercontent.com/tandpfun/skill-icons/main/icons/Spring-Dark.svg" alt="spring-logo"/>
</p>

### Development Tools

<p display="inline-block">
  <img width="48" src="https://raw.githubusercontent.com/tandpfun/skill-icons/65dea6c4eaca7da319e552c09f4cf5a9a8dab2c8/icons/Docker.svg" alt="docker-logo"/>
  <img width="48" src="https://raw.githubusercontent.com/tandpfun/skill-icons/main/icons/Idea-Dark.svg" alt="intellij-logo"/>
</p>

# Instalation 

clone this project on a directory of your choice:

    git clone https://github.com/Balzary/GreveAPI.git

then go to the directory "organizadorGreve":    

    cd ~/organizadorGreve

to install docker check this out: https://docs.docker.com/desktop/

via Docker: 

    docker-compose up
    
Curl for GET requests "find all strikes":
    
    http://localhost:8080/v1/greve 

Curl for POST requests "create strike":
    
    http://localhost:8080/v1/greve 

And JSON example for strike creation:

    {
    	"motivo":"direitos de trabalho 6",
    	"categoria":"professores",
    	"sindicato":"sindicato dos professores de SP",
    	"localGreve":"São Paulo, SP",
    	"numeroTrabalhadores":1500,
    	"dataInicio":"28/08/2024",
    	"dataFim":"01/09/2024",
    	"estadoGreve":"Em aberto"
    }

