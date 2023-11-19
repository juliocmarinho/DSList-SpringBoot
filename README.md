# DSList - Game List with Java Spring

This is a Java Spring project aimed at creating an application to manage a game list, inspired by the data available on the https://github.com/devsuperior/dslist-backend repository.

## Description

DSList is a Spring Boot application designed to manage information about games and their respective genres. The application utilizes Spring Data JPA for data access and Spring Web to create RESTful APIs for interacting with resources.

The project consists of three main parts:

1. **Games**: Contains information about the games, such as title, description, among other details.
2. **GameList**: Stores the different genres associated with the games.
3. **Association**: Table that establishes the relationship between games and their respective genres.

#### DS List Model
 ![dslist-model](https://github.com/juliocmarinho/DSList-SpringBoot/assets/133365222/d4f9a976-2339-44db-b62e-8761610770b9)

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Web
- H2 Database (runtime)
- PostgreSQL (runtime)
- Lombok
- Spring Boot Test

## Project Setup

To run this project locally, ensure that you have Java 17 installed. Additionally, you'll need to set up PostgreSQL or the H2 database as per the configurations in the `application.properties` file.

### Steps to Run:

1. Clone this repository.
2. Configure PostgreSQL or H2 according to the settings in the `application.properties` file.
3. Run the application using Maven:
mvn spring-boot:run

The application will be available locally at `http://localhost:8080`.
## Endpoints

### Game Controller

#### Retrieve Game by ID
- **GET** `/games/{id}`
  - Returns detailed information about a specific game by its ID.

#### Retrieve All Games
- **GET** `/games`
  - Returns a list of minimal game information for all games.

### Game List Controller

#### Retrieve All Lists
- **GET** `/lists`
  - Returns all game lists.

#### Retrieve Games by List ID
- **GET** `/lists/{listid}/games`
  - Returns minimal information about games belonging to a specific list.

#### Move Games Within a List
- **POST** `/lists/{listid}/replacement`
  - Moves games within a list. Requires a JSON body with source and destination indices.
 


