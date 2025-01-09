# E-Commerce Project

**Overview**

This project is an E-Commerce application built using Java, Spring Boot, and Maven. It includes multiple microservices
such as Product-ServicesNew and Payment-service, which are managed as Git submodules.

**Prerequisites**

* Java 11 or higher
* Maven 3.6.0 or higher
* Git

**Setup**

* Cloning the Repository
  Clone the main E-Commerce repository and initialize the submodules:

  `git clone https://github.com/Sky2709/E-Commerce.git
  cd E-Commerce
  git submodule update --init --recursive`
* Adding Submodules

  To add the Product-ServicesNew and Payment-service microservices as submodules:

  Navigate to the root of your E-Commerce project

  `cd C:\Users\456ak\IdeaProjects\E-Commerce`

* Add the Product-ServicesNew repository as a submodule on the main branch

  `git submodule add -b main https://github.com/Sky2709/Product-ServicesNew.git Product-ServicesNew`

* Add the Payment-service repository as a submodule on the main branch

  `git submodule add -b main https://github.com/Sky2709/Payment-service.git Payment-service`

* Initialize and update the submodules

  `git submodule init`

  `git submodule update`

* Commit the changes

  `git add .gitmodules Product-ServicesNew Payment-service`

  `git commit -m "Add Product-ServicesNew and Payment-service as submodules on the main branch"`

  `git push origin main`

**Automating Submodule Updates**

To ensure that the submodules always track the latest commit from the main branch, set up a post-merge Git hook:

1. Create the post-merge file in the .git/hooks directory:

* Create the post-merge file if it doesn't exist

  `New-Item -Path .git/hooks/post-merge -ItemType File -Force`

* Make the post-merge file executable

  `Set-ItemProperty -Path .git/hooks/post-merge -Name IsReadOnly -Value $false`

2. Add the following script to the post-merge file:

   #!/bin/sh

   #Update Product-ServicesNew submodule

   `cd Product-ServicesNew`

   `git fetch`

   `git checkout origin/main`

   `cd ..`

   #Update Payment-service submodule

   `cd Payment-service`

   `git fetch`

   `git checkout origin/main`

   `cd ..`

  #Add the updated submodule references
  `git add Product-ServicesNew Payment-service`

  #Commit the changes
  `git commit -m "Update submodules to the latest commit from the main branch"`

  #Push the changes to the remote repository
  `git push origin main`

**Building the Project**

To build the project, run the following command from the root directory:
 
    `mvn clean install`

**Running the Application**

To run the application, use the following command:

    `mvn spring-boot:run`

**Contributing**

Contributions are welcome! Please fork the repository and create a pull request with your changes.  

**License**

This project is licensed under the MIT License. See the LICENSE file for more details.