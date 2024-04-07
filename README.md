APIs


1. Rate Mentor
Endpoint: /mentors/{mentorId}/rate
Method: POST
Description: Allows a user to give a rating to a mentor.
Request Body:

2. Review Mentor
Endpoint: /mentors/{mentorId}/review
Method: POST
Description: Allows a user to give a review to a mentor.
Request Body:

3. Get Mentor Details
Endpoint: /mentors/{rating}
Method: GET
Description: Retrieves mentors filtered by rating.
Parameters:
rating: The rating to filter mentors (1 to 5).
Response:

   
4. Recommend Student
Endpoint: /mentors/{mentorId}/recommend
Method: POST
Description: Allows a mentor to recommend a student.
Request Body:

Error Handling
In case of any errors, appropriate error messages and status codes are returned.


Rate Limiting
There are no rate limiting restrictions on the APIs.





Here are some relevant test cases to ensure the sanctity of the Mentor Recommendation System APIs:

1. Rate Mentor API Test Cases:

Test that a user can successfully rate a mentor with a valid rating (e.g., 1 to 5 stars).
Test that the overall rating of the mentor is updated correctly after a user rates them.
Test that an error is returned if the provided mentor ID does not exist.
Test that an error is returned if the provided rating is invalid (e.g., less than 1 or greater than 5).

2. Review Mentor API Test Cases:

Test that a user can successfully submit a review for a mentor.
Test that the review is stored correctly in the database.
Test that an error is returned if the provided mentor ID does not exist.
Test that an error is returned if the review comment exceeds 50 words.

3. Get Mentor Details API Test Cases:

Test that all mentors are returned when no rating filter is applied.
Test that mentors are filtered correctly based on the provided rating.
Test that the returned mentors include their corresponding reviews.
Test that an error is returned if an invalid rating filter is provided.

4. Recommend Student API Test Cases:

Test that a mentor can successfully recommend a student.
Test that the recommendation is stored correctly in the database.
Test that an error is returned if the provided mentor ID does not exist.
Test that an error is returned if the recommendation text exceeds a certain length.

5. Error Handling Test Cases:

Test that appropriate error messages and status codes are returned for invalid requests.
Test that error handling is consistent across all APIs.

6. Integration Test Cases:

Test the entire flow of the system by simulating user interactions with the APIs.
Test edge cases such as submitting multiple ratings/reviews for the same mentor, handling concurrent requests, etc.

7. Performance Test Cases:

Test the performance of the APIs under different load conditions to ensure they can handle a reasonable number of requests without significant degradation in response time.
