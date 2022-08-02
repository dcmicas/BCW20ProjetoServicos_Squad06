# Services Backend Project - Squad 06

<b><p> This project is part of the Java Full Stack bootcamp at SoulCode Academy. </b> </p> 

It was generated with Java at Intelij, using MySql, Spring and Postman.

## Development server

Run `ServicosApplication` to star the <b>Java server on Intelij</b>. <br>
Run<b> Redis </b> application with the command `redis-server` for cache.<br>
Run <b>Postman</b> application and import the file `BCW20-Servicos_Squad06.postman_collection.json` for the endpoints. <br>

The application will automatically reload if you change any of the source files.

## Token

Token expires every 24 hours. To update it, follow the steps bellow: <br>
- At <b> Postman </b> , open the folder `Usuarios` and get the end point `login` to generate a new token; <br>
- At the main folder called `BCW20-Servicos_Squad06` > `Auth` > Token Tipe: `Bearer Token` > Copy the generated token
