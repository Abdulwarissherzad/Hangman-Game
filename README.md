
## Hang Mane Word Game
![Static Badge](https://img.shields.io/badge/Language-Java-brightgreen/)(https://img.shields.io/badge/Tech-Object%20Serialization-brightgreen)



The user tries to guess letters in **-** a secret word, and loses after guesses that are not in the word. The * user guesses a letter by clicking a button whose text is that letter. 
#### Remaining chance of guesses are calculated as follow:
**Remaining chance = Number of the characters in the word / 2**

For example;

Consider the random word is **Compression**
Remaining **chance = 11 / 2**
This is equal to **5.5**

You will **round this number as 5**
## GUI of the Game
The Game contain menu bar which contains two menu items **File** and **Options**.
#### 1- File Menu Bar
* **New game option:** will start a new game by selecting a random word from word database. Word file is explained below.
* **Save game option:** will save the current game. When user selects save game option, a file chooser appear in order to get the save file name. You will define your own save file format and save the file with *.sav extension.
* **Load game option:** will load a saved game. When user selects load game option, a file chooser appear. In this file chooser, you will add a filter for extension. This filter will extract *.sav files from other file formats.
* **Exit option:** will quit game, but before it will ask from user if s/he really wants to quit. Also it's offer to save game.
#### 2- Option Menu Bar
* **Option:** A new frame should appear. In this frame user can configure game properties, also it's the setting of the game.

## HangMan GUI


## HangMan Game GUI with Menu Bar

![Email GUI'Email GUI'](https://github.com/Abdulwarissherzad/QR-Code-Generator/blob/main/Pictures/Email.jpg)

## How to use it ?
This application gets the words from a text file. This file contains **“*.db”** extension. I was free to design my own database file. However, I have put at least 20 words to the database. When the game started, the application will **select a random** word from database.
During game play, when user clicks on one of the letters on the frame, the clicked button
**will be disabled** in order to avoid using same letter again. This rule is also valid for
saved games. 
#### Here is an example:
Assume that the word was **Application**.
* User pressed on A letter. (This letter should become disabled.)
* User pressed on L letter. (This letter should become disabled.)
* User pressed on X letter. (This letter should become disabled.)
* User pressed on O letter. (This letter should become disabled.)
* User saved the game.
* User loaded the same game.
* At this point, A, L, X, O letters will be disabled.

If user may guess what the word is, the application provide a textfield to enter the word. If s/he is right, a dialog box apear, that indicates the player has **won the game**. Otherwise player have **lost the game**.
## Contributing

Contributions are always welcome!

See `contributing.md` for ways to get started.

Please adhere to this project's `code of conduct`.


## 🚀 About Me
I'm a Java developer, and I graduated in 2021, and subsequently, I worked for one year at Neptune Company. Following that, I have continued to work independently 🦾🔥 on my own projects....


## Authors

- [@Abdulwarissherzad](https://www.get-in-it.de/profil/WuQ0LQ7GtXDmViHNmcSNL5uyjDkBqKbh)

- [@Github](https://github.com/Abdulwarissherzad)
- [@Instrgram](https://www.instagram.com/engineer_waris/)
- [@Youtube](https://youtu.be/SgaaYnrrWHk?si=oF4pGKyNUdzw7WQ6)