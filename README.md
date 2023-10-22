# SwagLabs 

Swag Labs is a website for testing purposes where the main goal is to add items to cart and finish shopping

## Dependencies

* Run on Windows 10 OS
* IDE for this project is IntelliJ IDEA Community Edition 2023.2.2
* Browser needed is Chrome

## Instalation

Open terminal in IDE and git clone the repository

```
git clone https://github.com/OgnjenCurcic/SwagLabs.git
```

* Java version "21" 2023-09-19 LTS
* Apache Maven 3.9.5

## Executing program

Run all tests from terminal with:

```
mvn test
```
Run specific class from terminal with:
```
mvn test -Dtest="LoginTest"
```
Run specific xml file form terminal with:
```
mvn clean test -DsuiteXmlFile="testing.xml"
```

# Framework Walkthrough

Packages:

* Base - Contains classes used through the app
* Helpers - Contains classes that could be useful for DDT
* Pages - Contains classes for each page
* Tests - Contains test classes
