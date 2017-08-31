
Ian Medina
icm27@drexel.edu
CS338:GUI, Assignment #1




Program Overview: 

Simple GUI program that adds text field values to a list, and then to a table which
includes basic functions such as add, delete, move, and update. This program was 
created using Netbeans IDE. The program has also been exported as a .jar file to 
reduce the chances of running into an issue which can prevent the program from 
runnning in TUX or in some machines.

Source code can be found in ../RealEstateList/src folder.



*** How to Run *** IMPORTANT! PLEASE READ!

- To run in TUX, simply type in the command line: 

		'make' 

		or 

		'make run'

- To run outside tux, simply launch: 

		RealEstateList.jar
	- this can be located in the /dist directory in RealEstateList
		or in the same location as the RealEstateList




Functions Overview:

* Add
	- Users must enter a value in all of the fields, you'll get an error 
		message otherwise
	- Click "Add" button to add to the jList
	- Values entered in the text fields will now show up in the list 
		separated by commas
* Delete
	- Users can use "Clear List" button to delete all entries in the list
	- Users can also select a row in the table and click the "Delete" button

* Update
	- Users can select any row in the table to update any entries
	- Once selected, the text fields will be populated based on their respective 
		column names
    - When done editing changes, simply click "Update" and all changes will be made
      	to the row in the table that was selected
* Move
	- Move to Table
		- Select a list entry and click ">>" to move the entry to the table
	- Move to List
		- Select a row in the table and click "<<" to move the row in the the list


Self Rating: 

- Clean, logical visual layout and components: 2
- Adding Items: 2
- Removing Items: 2
- Editing Items: 2
- Error Checking: 1
- Proper underlying data structures: 1
- Robust to user functions: 2
- Documentation: 2

