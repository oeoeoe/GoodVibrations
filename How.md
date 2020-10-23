---
title: How was Good Vibrations developed?
---

Here you can read about the process in developing Good Vibrations. The newest iteration of the project is at the top and the very first iteration can be found at the end. Related work can also be seen at the end of this page.

## Future Work
An interactive prototype is now being developed. Futher refinement of functions and design may be coming. 
## Stuff we have considered and chose to not include
This section will talk about some design desicions that we have made.
## iteration 4
This is the current iteration and it will be updated with new information during the iteration.

### What works right now?

- [x] Starting the app
- [x] Navigate between views
- [x] Tap a message
- [ ] Edit a message
- [ ] Delete taps in a message
- [x] Sending a message
- [x] Recieving a message
- [ ] Recieving a message when the app is not running (push notification)
- [ ] See message history
- [ ] Review messages in history
- [ ] Create an account
- [ ] Sign in
- [ ] Add contacts
- [ ] Choose contacts to send to
- [x] Add phrases into dictionary (to database, which you can't see)
- [ ] See phrases in dictionary (from the database)
- [ ] Quick send message from dictionary
- [ ] Set vibration intensity
- [ ] Set *new messsage alert*
- [ ] Secret mode (where all interface is hidden)

### MVP for testing the prototype
- [x] Starting the app
- [x] Tap a message
- [x] Sending a message
- [x] Recieving a message

## Iteration 3

### Targeting regular users

In the concept where we are targeting regular users, we wanted to make the learning curve as small as possible. Therefore the application needs to guide the user and offer an easier way to communicate than using regular morse code. Therefore the need to translate taps into letters and vice versa were removed. Instead the application sends the taps as they are without any translations, this further allows the users to communicate in whatever way they want to. Using the dictionary is not mandatory, however it may help the user so that they do not have to remember all of the codes that they have come up with.

<img src="images\Log in Screen.png" alt="Log in Screen" style="zoom:50%;" /> <img src="images\Log in Screen-1.png" alt="Log in Screen-1" style="zoom:50%;" /> <img src="images\Send Message Screen (1)-1602833993789.png" alt="Log in Screen-1" style="zoom:50%;" /> 

<img src="images\Contacts Screen.png" alt="Log in Screen" style="zoom:50%;" /> <img src="images\Messages Screen.png" alt="Log in Screen-1" style="zoom:50%;" /> <img src="images\Settings Screen.png" alt="Log in Screen-1" style="zoom:50%;" /> 

<img src="images\Dictionary Screen.png" alt="Dictionary Screen" style="zoom:50%;" /> <img src="images\Dictionary Screen Edit.png" alt="Dictionary Screen Edit" style="zoom:50%;" /> <img src="images\Dictionary Screen 1.png" alt="Dictionary Screen Remove" style="zoom:50%;" />

**Third iterations description of the project aiming at regular users:** An app that let friends communicate simple messages via taps and vibrations. In the app, the dictionary is shared between persons who are connected in the app, and can be changed to accommodate the vocabulary and most frequent phrases between the persons. Entries in the dictionary can be used to quickly tap out a message, so that the user doesn’t have to tap in messages that they have already defined. When a person enters a message and sends it to their friend, the friend is notified by vibrations.

### Targeting advanced users

In this concept the users are thought to be trained in communication using secret codes, therefore the dictionary is removed. Also because the communication is to be top secret, the message history is also removed.

<img src="images\agentsmessage.png" alt="Log in Screen" style="zoom:50%;" /> <img src="images\agentssettings.png" alt="Log in Screen-1" style="zoom:50%;" /> <img src="images\agentscontacts.png" alt="Log in Screen-1" style="zoom:50%;" /> 

**Third iterations description of the project aiming at advanced users:**  The app lets users communicate via taps and vibrations. The intended user is someone who really needs to communicate secretly, like an undercover agent. In this app, the users only communicate in sequences of taps/vibrations, no dictionary is present. It is up to the users if they want to communicate in Morse code or use other codes that only the recipient understands.

### Evaluation
This iteration was evaluated using a Heuristic Waltkthrough, the result can be seen in the images below with motivations for their scores below the images. 
The version for regular users are to the left and its motivations are without parenteses. The version for advanced users are shown to the right and the motivation are in parenteses.

<img src="images\Friends.png" alt="Log in Screen" style="zoom:50%;" /> <img src="images\Agents.png" alt="Log in Screen-1" style="zoom:50%;" /> 

#1: Input is shown directly on the screen

#2: The app follows conventions for design

#3: No redo/undo buttons

#4: The design is consistent

#5: Confirmation screen for deleting messages and dictionary words. (No error prevention or message history)

#6: Predefined messages can be sent from dictionary. (There is no dictionary, the user needs to remember all the codes to be sent)

#7: Customizable dictionary. Other advanced functionality is lacking. (No dictionary with predefined phrases)

#8: No unneeded information is shown on the screen (Only core features makes less need for dialogues)

#9: There are no error messages in the prototype

#10: Some information for what is expected from the user is given. No help button or documentation is provided. 



### Outcomes and Learnings from iteration 3

In the evaluation, we saw that Idea 1 has better results. Mainly, the communication to the user is clearer. Idea 1 offers more help and guidance to the user and is therefore easier for the user to use.Idea 2 is targeting a very limited user group and use cases are few. Everything that can be done in Idea 2 can also be done using Idea 1 and we see no need to cut down on the functionality since this is on expense of the usability. Hence, we will continue to develop Idea 1. Next step is to start coding an interactive prototype in Android Studio and get the core functionality to work. If time is available we will look into the drawbacks found in the heuristic walkthrough, such as error prevention and guiding the user, in a second iteration. 



## Iteration 2

A rough prototype has been developed, together with an updated description of the concept.

<img src="images\2main.png" alt="Main Screen" style="zoom:50%;" /> <img src="images\2history.png" alt="Message History Screen" style="zoom:50%;" /> <img src="images\2settings.png" alt="Settings Screen" style="zoom:50%;" /> 



The sketches aims to showcase the core functionality of the application, at this stage the messages were preinstalled in the app, such as morse code for letters and the app would translate the code to letters, which are then sent and translated back to vibrations on the side. This form of preprogrammed messages makes it easier for the user so send predefined commands, such as directions. The interactions of the app was mainly gestures, taps and fields of the screen. Functionality at this stage included: sending and receiving messages, history of messages and changing the predefined messages. We also tried to find a solution for inputting messages with the phone in the pocket but we decided to not investigate this approach further due to lack of time and motivation for this direction.

**Second iterations description of the project:** Messages are secured by being sent as a form of morse code that the recipient can feel by the phones vibrations. The idea is that the vibrations will be strong enough so that the recipient can feel the individual vibrations with their phone in their pocket, but not to strong so that the some one else could hear the phones vibrations. All input/output can be changed by the user. Standard is Morse code for letters and numbers. When receiving a message you first get notified by a “New message alert”, a predefined vibration combination that can be edited. Then the morse code starts. 

### Evaluation

This iteration was evaluated by conduction interviews after the participants have seen the sketches and read the description of the concept. Core findings from this evaluation are:

**Strengths:** Unique and interesting. Discreet communication. Morse code is cool. Good to avoid shoulder surfing. Awakens awareness of integrity. Cares about personal integrity.

**Weaknesses:** Steep learning curve, especially for letters and morse code. If you don’t feel a vibration, the message may be lost or distorted. Few use cases.

**Unclarities:** Pre recorded messages? Hard to understand main screen and how to interact with the app. Can the morse code be changed? 

**Improvements:** More pre recorded messages. Control vibrations’ strength.

**Feelings:**  Confusion - Positive

### Outcomes and learnings from iteration 2

Based on the evaluations we decided to split the app into two separate projects. One direction of the concept was an app for regular users, this app would rely heavily on predefined messages instead of morse code. 
The second direction that we wanted to explore was for use by more advanced users, such as secret agents where the users are more inclined to accept the steep learning curve.

## iteration 1

 The idea for Good Vibrations was born by compiling a list of sensors that a smartphone contains. Based on this list some ideation were pursued, such as brainstorming. The idea of sending and receiving messages based on vibrations were born. Following the ideation was a desk study to see if this would be feasible, studies point out that learning to distinguish words in morse code based on vibrations might need a lot of training, but it is doable. [The study can be read here](https://dl.acm.org/doi/10.1145/3402935)
 
 
**The initial description of the concept:** Messages are secured by being sent as a form of morse code that the recipient can feel by the phones vibrations. The idea is that the vibrations will be strong enough so that the recipient can feel the individual vibrations with their phone in their pocket, but not to strong so that the some one else could hear the phones vibrations.

## Related Work