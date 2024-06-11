# SnakeGame

This is a classic Snake game implemented in Java using Java GUI. The game features different levels of difficulty, high score storage in a database, and multiple functionalities accessible through a user-friendly interface.

Features:       
Start Game: Begin a new game of Snake.                          
Levels: Choose from three difficulty levels: Easy, Medium, and Hard.          
High Scores: View the high scores stored in a database.              
Help: Access the game instructions and controls.             
Exit: Exit the game.             

Technologies Used:     
Java: Core language used for game logic.
Java GUI: For creating the graphical user interface.
Threads: Used for handling game loop and animations.
JDBC: For connecting and interacting with the database to store high scores.

How to use:     
1.Clone the repository.     
2.Compile the Java files.    
3.Run the Main.java file to start the application.     
4.Ensure you have a database (e.g., MySQL) set up.      
  Create a table for storing high scores:
  sql    
  CREATE TABLE highscore(
  id int auto_increment primary key,
  easyHighScore int,
  mediumHighScore int,
  hardHighScore int);

Update the database configuration in the DatabaseConnection.java file with your database credentials.
Compile and run the game:

Usage:    
Start the Game: Click on the "Start" button to begin playing.    
Select Level: Choose a difficulty level (Easy, Medium, Hard) from the "Level" menu.   
View High Scores: Click on the "High Score" button to view the top scores.    
Get Help: Click on the "Help" button for instructions and controls.    
Exit the Game: Click on the "Exit" button to close the game.    

Game Controls:     
Arrow Keys(w,s,a,d): Control the direction of the snake (Up, Down, Left, Right).   
e: Exit the game.   

Photos:

![Screenshot 2024-06-11 113216](https://github.com/Arjun-Dalavayi/Practise/assets/159019136/181ccc58-38a4-4b03-8246-425d609b87a0)

![Screenshot 2024-06-11 113824](https://github.com/Arjun-Dalavayi/Practise/assets/159019136/6467af70-8812-4a81-b24b-8c7b0fdc8160)

![Screenshot 2024-06-11 113255](https://github.com/Arjun-Dalavayi/Practise/assets/159019136/6add0bd6-3f99-452c-b34a-a97a21438877)

![Screenshot 2024-06-08 120733](https://github.com/Arjun-Dalavayi/Practise/assets/159019136/8ea72407-1196-4a39-af7f-b68a759b4cf8)

![Screenshot 2024-06-11 113716](https://github.com/Arjun-Dalavayi/Practise/assets/159019136/5591cbb8-3804-4620-9483-44d9ba1a55b0)

![Screenshot 2024-06-11 113758](https://github.com/Arjun-Dalavayi/Practise/assets/159019136/5063e9c7-5f46-4fa7-8386-efc9bcbb4120)
