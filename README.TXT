SOFTWARE: BlueJ(IDE)
BOOK: Object First with Java | Sixth Edition | Chapter 5
PROJECT TITLE: myMobile
PURPOSE OF PROJECT: University weekly assignment
VERSION or DATE: October 2019
AUTHOR: Plamen Savchev 

Individual Assessed Coursework 1 
October 2019

This homework is designed to test your ability to create basic objects and to allow limited interaction with those objects.  The material needed is primarily based upon Chapters 1 & 2 of the Barnes & Kolling book. Full marks may be obtained by using code similar in standard to that seen in the Barnes & Kolling book.

Overall specification: To write a simple Java class Mobile that models a mobile phone.

Details
The information stored about each mobile phone will include
•	its type e.g. " Sony Xperia XZ" or "Samsung Galaxy S7";
•	its screen size in inches;
o	you may assume that this is a whole number from the scale 3 to 5 inclusive.
•	its memory card capacity in gigabytes;
o	you may assume that this is a whole number.
•	the name of its present service provider;
o	you may assume that this is a single line of text.
•	the type of contract with the service provider;
o	you may assume that this is a single line of text.
•	its camera resolution in megapixels;
o	you should not assume that this is a whole number;
•	the percentage charge left on the phone e.g. a fully-charged phone will have a charge of 100;
o	you may assume that this is a whole number.
•	whether the phone has GPS or not.

Your class will need to have fields corresponding to these attributes. 

Start by opening BlueJ, creating a new project called myMobile which has a class Mobile and set up the fields that you need.  Make sure that the class compiles before continuing.

Next, you will need to write a constructor for the class.  Assume that each phone is "manufactured" by creating an object and specifying its type, its screen size, its memory card capacity, its camera resolution and whether it has GPS or not.  Therefore, you will need a constructor that allows you to pass arguments to initialise these five attributes.  Other fields should be set to appropriate default values.  You may assume that a new phone comes fully charged. Again, check that the class compiles before continuing.  If there are errors then you will know that they are caused by the code you have just typed in.  Never type in more than a single constructor or method without compiling -- otherwise if there are errors then it might be difficult to know which lines of code have caused the problem. 

To obtain information about your Mobile object, you should write accessor methods corresponding to three of its fields: 
o	getType() -- which returns the type of the mobile;
o	getProvider() -- which returns the present service provider;
o	getCharge() -- which returns its remaining charge.
Ideally, we should have an accessor method for every attribute that is of interest to us, but three accessor methods are sufficient for this exercise .

When the phone is sold to its owner, you will need to set the service provider so you will need mutator methods
•	setProvider() -- to set the service provider;
•	setContractType() -- to set the type of contract.
 

You should also write a mutator method chargeUp() which simulates fully charging the phone as well as an accessor method printDetails() to print, to the terminal window, a report about the phone similar to 
This mobile is a Sony Xperia XZ with service provider BigAl and type of contract PAYG. It has screen size of 5 inches, GPS, resolution of 13 MegaPixels and 64 Gig of memory. At present, it has 30% of its battery charge remaining.

Check that the new method works correctly by, for example,
o	creating a Mobile object and setting its fields;
o	calling printDetails() and checking that the report corresponds to the details you have just given for the mobile;
o	changing the service provider by calling setProvider();
o	calling printDetails() and checking that the report now prints out the new details.

Challenging exercises

•	write a mutator method switchedOnFor() which simulates using the phone for a specified period. You may assume that the phone loses 1% of its charge for each hour that it is switched on.
•	write an accessor method checkCharge() which checks the phone's remaining charge.  If this charge has a value less than 25%, then this method returns a string containing the message Be aware that you will soon need to re-charge your phone otherwise it returns a string containing Your phone charge is sufficient.
o	A mark is available for those who are able to output this message when the constructor is executed.
•	write a method changeProvider() which simulates changing the provider (and presumably also the type of service contract). 

Finally, you may add up to four additional fields, with appropriate methods, that might be required in a more detailed model. The more original your idea, the more marks you get  

Remember that your code should be similar in standard to that seen in the Barnes & Kolling book so make sure that it is has appropriate comments and sensible indentation -- if in doubt, compare your code to that in the ticket-machine project.

Hand in a hard copy (i.e. printed paper) of your code to Dr D E Newton at your workshop on 17th October 2019 in a plastic wallet.

Your name should be on the front page with your Java group i.e. 1, 2, 3, 4, 5, 6 or 7. 

Note that by the act of following these instructions and handing your work in, it is deemed that you have read and understand the rules on plagiarism as written in your student handbook.
