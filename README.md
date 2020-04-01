**Title**
----
  Show All Tasks.

* **URL**

  /printAllTasks

* **Method:**

  `GET`
  
*  **URL Params**

   None

   **Required:**
 
   None

   **Optional:**
 
   None


* **Success Response:**
  
  * **Code:** 200 <br />
    **Content:** `{ Content: 1, Groceries, Get Groceries from SafeWay, 2020-02-29, true, 2020-03-25 05:37:12.0}`
 
 

* **Sample Call:**

  <_ url: curl -X GET http://localhost:8080/printAllTasks_> 






**Title**
----
  Show Single Task.

* **URL**

  /searchTask/:id

* **Method:**
 
  `GET`
  
*  **URL Params**

   **Required:**
 
   `id=[integer]`

   **Optional:**
 
    None

* **Data Params**

    None

* **Success Response:**
  
  * **Code:** 200 <br />
    **Content:** `{  2, Hiking, Go for Hiking at San Thomas Aquino Creek Trail, 2020-03-01, true, 2020-03-25 05: 39: 48.0 }`
 
* **Error Response:**

  * **Code:** 400 UNAUTHORIZED <br />
    **Content:** `{     "timestamp": "2020-03-29T18:14:28.992+0000",
                 `      "details": "Invalid input for Task Id",
                 `      "message": "uri=/searchTask/200" }`


* **Sample Call:**

  <_curl -X GET http://localhost:8080/searchTask/3._> 





**Title**
----
  Add Task

* **URL**

  /addTask

* **Method:**
  
  <_The request type_>

  `POST`
  
*  **URL Params**

   **Required:**

   `task_name=[String]`
   `task_description=[String]`
   `Task_date=[Date (yyyy-mm-dd)]`

   **Optional:**
 
    None

* **Data Params**

    None
    
* **Success Response:**

  * **Code:** 201 Created <br />
    **Content:** None
              Location: http://localhost:8080/addTask<br/>
 
* **Error Response:**

  <_Most endpoints will have many ways they can fail. From unauthorized access, to wrongful parameters etc. All of those should be liste d here. It might seem repetitive, but it helps prevent assumptions from being made where they should be._>

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:**  `{ "timestamp": "2020-03-29T18:14:28.992+0000",
                  `"details": "Invalid input for Task Id",
                  ` "message": "uri=/searchTask/200" }`

* **Sample Call:**

   Url: curl -i -H "Accept: application/json" -H "Content-Type:application/json" -X POST --data "{\"taskName\": \"Outing\", \"taskDescription\": \"Visit Almaden Lake\", \"date\": \"2020-03-16\"}" "http://localhost:8080/addTask"



**Title**
----
 Mark Task
 Returns number of rows update.

* **URL**

  /markTaskAsDone/:id

* **Method:**

  `POST`
  
*  **URL Params**

   <_If URL params exist, specify them in accordance with name mentioned in URL section. Separate into optional and required. Document data constraints._> 

   **Required:**
 
   `task_id=[Integer]`

   **Optional:**
 
    None

* **Data Params**

   /markTaskAsDone/{id}

* **Success Response:**
  
  * **Code:** 200 <br />
    **Content:** Rows updated: 1
 
* **Error Response:**

  <_Most endpoints will have many ways they can fail. From unauthorized access, to wrongful parameters etc. All of those should be liste d here. It might seem repetitive, but it helps prevent assumptions from being made where they should be._>

  * **Code:** 404 UNAUTHORIZED <br />
    **Content:** `{"timestamp": "2020-03-29T20:30:06.268+0000",
                 `"details": "Invalid input for Task Id",
                 `"message": "uri=/markTaskAsDone/800"}`

* **Sample Call:**

      Url: curl -X POST --data"http://localhost:8080/markTaskAsDone/8"
    


**Title**
----
  Delete Task

* **URL**

  /deleteTask/:id

* **Method:**

  `DELETE`
  
*  **URL Params**

   **Required:**
 
   `task_id=[Integer]`

   **Optional:**
 
   `photo_id=[alphanumeric]`

* **Data Params**
    
    `deleteTask/{id}`
  
* **Success Response:**
  

  * **Code:** 200 <br />
    **Content:** Rows updated: 1
 
* **Error Response:**

  * **Code:** 400 NOT FOUND <br />
    **Content:** `{"timestamp": "2020-03-29T20:30:06.268+0000",
                 `"details": "Invalid input for Task Id",
                  `"message": "uri=/deleteTask/800"}`

* **Sample Call:**

       Url: curl -X POST --data"http://localhost:8080/deleteTask/8"
 
 
 

**Title**
----
  Create Event in Google Calendar

* **URL**

  /createCalenderEvent/:id

* **Method:**

  `POST`
  
*  **URL Params**

   **Required:**
 
   `task_id=[Integer]`

   **Optional:**
 
   `photo_id=[alphanumeric]`

* **Data Params**
    
    `createCalenderEvent/{id}`
  
* **Success Response:**
  

  * **Code:** 200 <br />
    **Content:** Event created in Google Calendar
 
* **Error Response:**

  * **Code:** 400 NOT FOUND <br />
    **Content:** `{"timestamp": "2020-03-29T20:30:06.268+0000",
                 `"details": "Invalid input for Task Id",
                  `"message": "uri=/createCalendarEvent/800"}`

* **Sample Call:**

       Url: curl -X POST --data"http://localhost:8080/deleteTask/8"
    

