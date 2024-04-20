# Sets-and-Maps-Advanced-Java-Advanced-course-with-Java-Software-University
Courses from my education Java advanced in @SoftUni
Problems for exercises: Sets and Maps Advanced
Problem 1.	Unique Usernames
Write a simple program that reads from the console a sequence of usernames and keeps a collection with only the unique ones. Print the collection on the console in order of insertion

Problem 2.	Sets of Elements
On the first line, you are given the length of two sets N and M. On the next N + M lines there are N numbers, that are in the first set and M numbers that are in the second one. Find all non-repeating element that appears in both of them, and print them in the same order at the console:
Set with length N = 4: {1, 3, 5, 7}
Set with length M = 3: {3, 4, 5}
Set that contains all repeating elements -> {3, 5}
Problem 3.	Periodic Table
You are given an n number of chemical compounds. You need to keep track of all chemical elements used in the compounds and at the end print all unique ones in ascending order
Problem 4.	Count Symbols
Write a program that reads some text from the console and counts the occurrences of each character in it. Print the results in alphabetical (lexicographical) order. 
Problem 5.	Phonebook
Write a program that receives some info from the console about people and their phone numbers.
You are free to choose how the data is entered. Each entry should have just one name and one number (both of them strings). If you receive a name that already exists in the phonebook, simply update its number.
After filling this simple phonebook, upon receiving the command "search", your program should be able to perform a search of contact by name and print her details in the format "{name} -> {number}". In case the contact isn't found, print "Contact {name} does not exist.".
Problem 6.	Fix Emails
You are given a sequence of strings, each on a new line until you receive the "stop" command. The first string is a name of a person. On the second line, you receive his email. Your task is to collect their names and emails and remove emails whose domain ends with "us", "uk" or "com" (case insensitive). Print in the following format:
"{name} – > {email}"
Problem 7.	Hands Of Cards
You are given a sequence of people and for every person what cards he draws from the deck. The input will be separate lines in the format:
"{personName}: {PT, PT, PT,… PT}"
Where P (2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A) is the power of the card and T (S, H, D, C) is the type. The input ends when a "JOKER" is drawn. The name can contain any ASCII symbol except ":". The input will always be valid and in the format described, there is no need to check it.
A single person cannot have more than one card with the same power and type, if he draws such a card he discards it. The people are playing with multiple decks. Each card has a value that is calculated by the power multiplied by the type. Powers 2 to 10 have the same value and J to A are 11 to 14. Types are mapped to multipliers the following way (S -> 4, H-> 3, D -> 2, C -> 1).
Finally print out the total value each player has in his hand in the format:
"{personName}: {value}"
Problem 8.	User Logs
Marian is a famous system administrator. The person to overcome the security of his servers has not yet been born. However, there is a new type of threat where users flood the server with messages that are hard to be detected since they change their IP address all the time. Well, Marian is a system administrator and is not so into programming. Therefore, he needs a skillful programmer to track the user logs of his servers. You are the chosen one to help him!
You are given an input in the format:
"IP={IP.Address} message={A&sample&message} user={username}"
Your task is to parse the IP and the username from the input and for every user, you have to display every IP from which the corresponding user has sent a message and the count of the messages sent with the corresponding IP. In the output, the usernames must be sorted alphabetically while their IP addresses should be displayed in the order of their first appearance. The output should be in the following format:
"username: 
{IP} => {count}, {IP} => {count}."
For example, given the following input - IP=192.23.30.40 message='Hello&derps.' user=destroyer, you have to get the username destroyer and the IP 192.23.30.40 and display it in the following format:
"destroyer: 
192.23.30.40 => 1. "
The username destroyer has sent a message from IP 192.23.30.40 once.
Check the examples below. They will further clarify the assignment.
Input
The input comes from the console as a varying number of lines. You have to parse every command until the command that follows is "end". The input will be in the format displayed above, there is no need to check it explicitly.
Output
For every user found, you have to display each log in the format:
The IP addresses must be split with a comma, and each line of IP addresses must end with a dot.


