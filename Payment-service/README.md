# **Payment Service**

**Description**
The Payment Service is a backend application built using Spring Boot, providing payment functionalities such as payment initiation and webhook handling for Razorpay. The service integrates with the Razorpay Payment Gateway and is designed to be easily extensible to support additional payment gateways in the future.

**Features**
* Initiate Payment: Generate payment links using Razorpay.
* Webhook Handling: Support for Razorpay webhook updates.
* Extensible Payment Gateway Architecture: Easily add more payment gateway integrations.


**Tech Stack**
* Languages: Java
* Frameworks: Spring Boot
* Database: MySQL
* Payment Gateway SDKs: Razorpay Java SDK, Stripe Java SDK
* Build Tool: Maven


**Setup Instructions**
1. Clone the repository.
   `git clone https://github.com/Sky2709/Payment-service.git
   cd Payment-service`
2. Build the project:
   `./mvnw clean install`
3. Configure environment variables:
   Set the following environment variables for Razorpay credentials in the application.properties file:
   `razorpay.key.id=YOUR_RAZORPAY_API_KEY
   razorpay.key.secret=YOUR_RAZORPAY_API_SECRET`
4. Run the application:
   `./mvnw spring-boot:run`


**Usage Instructions**
* Initiate Payment:Use the endpoint:
  `POST /payments/`
  Request Body:
  `{
  "orderId": "12345",
  "email": "user@example.com",
  "phoneNumber": "9876543210",
  "amount": 1000
  }`
* Webhook Handling: Razorpay webhook events can be sent to the /razorPayPGUpdate/ endpoint

**Architecture**
* The service follows a modular architecture:
* Controller Layer: Handles HTTP requests and responses.
* Service Layer: Contains business logic.
* Payment Gateway Strategy: Implements a strategy pattern to choose the best payment gateway.
* Payment Gateway Integration: Encapsulates individual payment gateway SDKs.

**Contribution**
* Contributions are welcome! Follow these steps:
* Fork the repository.
* Create a new branch: `git checkout -b feature-name`.
* Commit your changes: `git commit -m 'Add feature-name'`.
* Push to the branch: `git push origin feature-name`.
* Open a pull request.

**License**
This project is licensed under the MIT License.

**Contact**
* Author: Akash Kumar
* GitHub: [Sky2709](https://github.com/Sky2709)
* LinkedIn: [Akash Kumar](https://www.linkedin.com/in/akashkr98/)

**Future Plans**
* Add support for more payment gateways such as Stripe.
* Enhance webhook handling for various event types.
* Implement payment validation and reconciliation.