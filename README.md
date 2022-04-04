# spring-azure-servicebus-sample

## Usage

1. Set the environment variable `SERVICEBUS_CONNECTION_STRING`.
2. Execute bootRun.
3. Send a request.
   - `GET http://localhost:8080/queue` sends a message to queue `sample-queue`
   - `GET http://localhost:8080/topic` sends a message to topic `sample-topic`
