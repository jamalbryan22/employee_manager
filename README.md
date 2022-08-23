# Employee manager

## Java employee management api built using maven and spring-boot framework for connection to a local database
Please see: https://github.com/jamalbryan22/employee_manager_frontend for accompanying front end angular application

### Prerequisite
mysql with a created database named "employeemanager"


### Run the app

   `mvn spring-boot:run`

## REST API

## Add a new employee

`POST  http://localhost:8080/employee/add`

### Request Body example

{  
    "email":"Alex@bryanscode.com",  
    "imageUrl":"https://www.bootdey.com/app/webroot/img/Content/avatar/avatar3.png",  
    "jobTitle":"Chef",  
    "name":"Alex Bryan",  
    "phone":"214-444-5553"  
}

### Response Body example
{  
    "id": 1,  
    "name": "Alex Bryan",  
    "email": "Alex@bryanscode.com",  
    "jobTitle": "Chef",  
    "phone": "214-444-5553",  
    "imageUrl": "https://www.bootdey.com/app/webroot/img/Content/avatar/avatar3.png",  
    "employeeCode": "fbdf6ad2-8e01-44ba-a58d-ecf72d2f6876"  
}  


## Get an employee by id

`GET  http://localhost:8080/employee/find/{id}`

Note: where {id} is the id of the employee you're searching for i.e. 1

### Response Body example
{  
    "id": 1,  
    "name": "Alex Bryan",  
    "email": "Alex@bryanscode.com",  
    "jobTitle": "Chef",  
    "phone": "214-444-5553",  
    "imageUrl": "https://www.bootdey.com/app/webroot/img/Content/avatar/avatar3.png",  
    "employeeCode": "fbdf6ad2-8e01-44ba-a58d-ecf72d2f6876"  
}  

## Get all employees 

`GET  http://localhost:8080/employee/all`

## Update an employee by id

`PUT http://localhost:8080/employee/update`

Note: must include id of employee to be updated

### Request Body example

{  
    "id":"1",  
    "email":"Alex@bryanscode.com",  
    "imageUrl":"https://www.bootdey.com/app/webroot/img/Content/avatar/avatar3.png",  
    "jobTitle":"Chef",  
    "name":"Alexandra Bryan",  
    "phone":"214-444-5553"  
}  

### Reponse Body example
{  
    "id": 1,  
    "name": "Alexandra Bryan",  
    "email": "Alex@bryanscode.com",  
    "jobTitle": "Chef",  
    "phone": "214-444-5553",  
    "imageUrl": "https://www.bootdey.com/app/webroot/img/Content/avatar/avatar3.png",  
    "employeeCode": "18d496bb-d322-4af1-84be-3707e427f6c6"  
}

## Delete an employee by id

`DELETE  http://localhost:8080/employee/delete/{id}`

Note: where {id} is the id of the employee you're searching for i.e. 1

Response Status Code = 200 for a successful deletion
