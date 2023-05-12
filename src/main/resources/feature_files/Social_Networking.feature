@smokeTest
Feature:Social_Networking
#  make posts: http://jsonplaceholder.typicode.com/posts
#   comment on post : https://jsonplaceholder.typicode.com/comments
#  List of Users: https://jsonplaceholder.typicode.com/users


  Scenario Outline: Get Specific Comment
    Given jsonplaceholder service is up and running
    When I search for comment with "<id>" with a get method
    Then I should get the status code of 200 and "<id>", "<name>", and "<email>"
    Examples:

      | id | name                          | email               |
      | 3  | odio adipisci rerum aut animi | Nikita@garfield.biz |

  Scenario Outline: Create A  Comment
    Given jsonplaceholder service is up and running
    When I create a new comment with details  "<postId>", "<name>", "<email>" and "<body>" using post method
    Then I should get the status code of 201 and "<postId>", "<name>", and "<email>" and "<body>"


    Examples:

      | postId | name     | email             | body               |
      | 40     | kin mind | minder@gmail.com  | Staying up late    |
      | 15     | Henry    | mankind@gmail.com | just the way it is |

# //@smokeTest
  Scenario Outline:  THIS IS A CREATE A POST REQUEST


    Given  jsonplaceholder service is up and running
    When I send request to create a new user with details "<userId>", "<id>", "<title>", "<body>", using a post method
    Then user is created  with the statusCode of 201 and "<userId>","<id>", "<title>" and "<body>".
    Examples:

      | userId | id | title | body                          |
      | 5      | 101 | MRS   | I AM MORE PRODUCTIVE THIS WAY |


  Scenario: Get All Users

    Given jsonplaceholder service is up and running
    When I send Get request to get all users
  Then all details of all the users are returned ith a statusCode of 200

