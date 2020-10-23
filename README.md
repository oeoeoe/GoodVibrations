# Welcome to Good Vibrations

To find out more about the app, please check out [Good Vibrations](https://oeoeoe.github.io/GoodVibrations/) webpage.


--- 
## Features, definitley not bugs

When the app starts it will recieve the latest message from the database, the app is unresponsive when recieving messages. This is a feature, not a bug!

Right now there can only be one message in the database at a time, sending a message will be recieved by all running apps including yours. Please dont spam messages! 

---
### Installation

The app requires no extra libraries or files, just download the files from the repo, import it into *Android Studio* and click **run**.

### Dummy Data
Some views only contains dummy data, these views are: **Dictionary view**, **Settings view** and **Message History view**. These views have no functionality, but only serve as placeholders to showcase which functionality the app should have in its fully fledged form. 

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

### About the views

**New Message view:** 
Use the large button in the middle to create a message, using short and long taps. The message will be output below the button. Pressing send button will send the message to the database and all apps will recieve it, including yours.
The Recipients row is just a placeholder. In this prototype, you can't interact with it. In a functioning version, the x next to the name should delete the recipient, and the + should be used to add a new recipient, so that you can send the message to several recipients.

**Dictionary view:**
Use the FAB button to open a modal view where you use short and long taps to create a new phrase in your dictionary. Change the EditText to set a meaning for the tap sequence. The Save button does not do anything yet. Press the FAB button again to close the modal view. 

**Message History view:** 
This should be a list of all received messages. Right now it only shows the tap sequences, but it should also be possible to see when the messages were recieved, as well as from whom.

**Contacts view:**
This is a placeholder showing how your screen could look if you had two contacts in the app. The buttons for edit, delete, and add contacts are not holding any functionality at the moment, but only show what should be possible to do in this view. The QR code should be an option for simple adding of new contacts. 

**Settings view:** 
This view currently has no functionality, but only shows what should be possible in a complete version of the app. 
New Message Alert: When receiving a new message, it should be possible to switch on and of a vibration signal, depending on how discreet you want to be. The signal should also be possible to change. 
Vibration Strength: Should be from off to max, so that you can choose how obvious the signal should be. 
*Activate Button:* In the complete version of the app, it should be possible to open the app discreetly, using for instance Volume down. It should be possible to edit how to activate the app. The secret mode will let the user tap in a message oon the home screen while holding the activation button. This means that there will be no interface showing, except for the home screen or app that the user is currently in (does not need to be Good Vibrations)







