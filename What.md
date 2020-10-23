---
title: What is Good Vibrations?
---

## The Challenge

Private messages can contain sensitive and secret information that no one but the recipient is supposed to see. A question that we have set out to solve is: How can you send and receive secret messages via cellphones without the need of hiding the screen from others?

## The Solution

In Good Vibrations, messages are secured by being sent as vibrations instead of plain text. The idea is that the vibrations should be strong enough so that the recipient can feel the individual vibrations with their phone in their pocket, but not too strong so that the someone else could hear the phone’s vibrations. The information is hidden in plain sight - because the vibrations are in a code that only the people with access to the private dictionary knows. Even if someone else were to overhear the vibrations, they wouldn’t know what it meant. 

By sending short codes in the form of vibrations, you can quickly and discreetly send messages that you don’t want anyone except your friend to see. Just tap a predefined sequence of long and short taps, and send the message by swiping right. Your friend will receive the message as vibrations matching your taps. In the app, you and your friend can define a dictionary so that a short set of short and long vibrations can convey something of importance to you, such as a place to meet, or the name of a secret crush.


## Functionality of Good Vibrations 

This list is far from complete, but it's gonna be good.

* Sends secret messages
* Share new words with the dictionary
* Edit words in the dictionary
* Remove words in the dictionary
* Fast type messages directly from the dictionary
* See message histoory
* Add contacts to send messages to
* Send messages without opening the application
* Edit/Review messages before ssending them

## Screenshots with descriptions 

### Main Screens

<img src="images\Log in Screen.png" alt="Log in Screen" style="zoom:50%;" /> | <img src="images\Log in Screen-1.png" alt="Log in Screen-1" style="zoom:50%;" />|<img src="images\Send Message Screen (1)-1602833993789.png" alt="Log in Screen-1" style="zoom:50%;" />
Authorization is done by entering your phone number which the user is linked to. | A code is sent to the user phone number and the app asks for this code. | When tapping in a message, the user can see a preview of that message before sending.

### Additional Screens

<img src="images\Contacts Screen.png" alt="Log in Screen" style="zoom:50%;" /> | <img src="images\Messages Screen.png" alt="Log in Screen-1" style="zoom:50%;" />|<img src="images\Settings Screen.png" alt="Log in Screen-1" style="zoom:50%;" />
Enter a phone number or scan a QR code to add a contact. | History of received messages. Click a message to play it. | In the settings screen, the user can change various settings.


The user can switch in what mode the messages are being sent, either every tap is sent instantly or the user can tap out the whole message before sending. Messages can be tapped in without opening the app by assigning an activate button, messages are sent when the button is released.

### Dictionary Screens

<img src="images\Dictionary Screen.png" alt="Dictionary Screen" style="zoom:50%;" /> | <img src="images\Dictionary Screen Edit.png" alt="Dictionary Screen Edit" style="zoom:50%;" />|<img src="images\Dictionary Screen 1.png" alt="Dictionary Screen Remove" style="zoom:50%;" />
The dictionary is shared between the user and the contact and can be edited by both. | A word or phrase can be edited by changing what it stands for and how the vibrations are assigned. | When deleting an entry in the dictionary, the user must accept the deletion in two steps.
### About the views

New Message view: 
Use the large button in the middle to create a message, using short and long taps. The message will be output below the button. Pressing send button will send the message to the database and all apps will recieve it, including yours.
The Recipients row is just a placeholder. In this prototype, you can't interact with it. In a functioning version, the x next to the name should delete the recipient, and the + should be used to add a new recipient, so that you can send the message to several recipients.

Dictionary view: 
Use the FAB button to open a modal view where you use short and long taps to create a new phrase in your dictionary. Change the EditText to set a meaning for the tap sequence. The Save button does not do anything yet. Press the FAB button again to close the modal view. 

Message History view: 
This should be a list of all received messages. Right now it only shows the tap sequences, but it should also be possible to see when the messages were recieved, as well as from whom.

Contacts view: 
This is a placeholder showing how your screen could look if you had two contacts in the app. The buttons for edit, delete, and add contacts are not holding any functionality at the moment, but only show what should be possible to do in this view. The QR code should be an option for simple adding of new contacts. 

Settings view: 
This view currently has no functionality, but only shows what should be possible in a complete version of the app. 
New Message Alert: When receiving a new message, it should be possible to switch on and of a vibration signal, depending on how discreet you want to be. The signal should also be possible to change. 
Vibration Strength: Should be from off to max, so that you can choose how obvious the signal should be. 
Activate Button: In the complete version of the app, it should be possible to open the app discreetly, using for instance Volume down. It should be possible to edit how to activate the app. The secret mode will let the user tap in a message oon the home screen while holding the activation button. This means that there will be no interface showing, except for the home screen or app that the user is currently in (does not need to be Good Vibrations)


