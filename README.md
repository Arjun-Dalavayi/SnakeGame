# SnakeGame

This is a classic Snake game implemented in Java using Java GUI. The game features different levels of difficulty, sound effects, high score storage in a database, and multiple functionalities accessible through a user-friendly interface.

Features:       
Start Game: Begin a new game of Snake.                          
Levels: Choose from three difficulty levels: Easy, Medium, and Hard.          
High Scores: View the high scores stored in a database.  
Sound Effects: Enjoy sound effects that enhance the gaming experience.     
Help: Access the game instructions and controls.             
Exit: Exit the game.             

Technologies Used:     
Java: Core language used for game logic.      
Java GUI: For creating the graphical user interface.    
Threads: Used for handling game loop and animations.    
JDBC: For connecting and interacting with the database to store high scores.      
Sound: Integrated sound effects for a better user experience.     

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

Image-1   
![Screenshot 2024-06-11 113216](https://github.com/Arjun-Dalavayi/Hotel-Room-Management/assets/159019136/2569887d-0090-4e4d-82d3-68e9a8783333)

Image-2   
![Screenshot 2024-06-11 113255](https://github.com/Arjun-Dalavayi/Hotel-Room-Management/assets/159019136/488fc299-a963-48e3-8af5-c6a9b4226886)

Image-3   
![Screenshot 2024-06-11 113824](https://github.com/Arjun-Dalavayi/Hotel-Room-Management/assets/159019136/38224b60-a494-4348-9c99-9b7425858dbd)

Image-4     
![Screenshot 2024-06-08 120733](https://github.com/Arjun-Dalavayi/Hotel-Room-Management/assets/159019136/bce346d2-712e-434d-8eaa-75672b6e4e27)

Image-5    
![Screenshot 2024-06-11 113716](https://github.com/Arjun-Dalavayi/Hotel-Room-Management/assets/159019136/13456e07-ceca-40c0-bc7e-986e7a1a2836)

Image-6    
![Screenshot 2024-06-11 113758](https://github.com/Arjun-Dalavayi/Hotel-Room-Management/assets/159019136/611bf0ca-a0db-4eea-8ceb-a40ec73302f2)



