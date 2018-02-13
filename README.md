1. This Testng framework will access google and search for Instawork keyword and validates that Instawork official site appears on first position. If not, then it iterates through the result and displays the position of keyword "Instawork".
2. There are functions within baseclass which reads url from config.properties file and then searches for the keyword "Instawork" in Google.
3. The function "searchForInstawork" in baseclass.java file has the logic to search for the position of "Instawork" keyword and prints it out.
4. The function "Instawork" in class Testcases has the test method which uses the above mentioned base functions to complete the task.

