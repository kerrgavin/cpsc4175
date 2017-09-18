# Homework 4
## Gavin Kerr

1. An entity clss models information that is long lived. A boundry class models the interaction between the software product and its actors. A control class models complex computations and algorithms. 
2. Located in homework folder
3. Successful Scenario:
	1. User A enters their debit card 
	2. User A is promted to enter their pin to access their account
	3. The ATM uses that information to access their account
	4. User A is granted access to their account and provided the options to view their account status, withdraw money, and deposit money
	5. User A choose to withdraw money
	6. User A is prompted to enter the amount to withdraw
	7. User A enters the amount to withdraw
	8. The ATM checks this amount against User A's account balance
	9. The ATM deposits the required amount
	10. User A logs out of the ATM Machine and retrieves their debit card
4. Unsuccessful Scenario:
	1. User A enters their debit card 
	2. User A is promted to enter their PIN to access their account
	3. The ATM uses that information to access their account
	4. User A is notified that the PIN number is incorrect and prompted to re-enter their PIN
	5. The ATM uses that information to access their account
	6. User A is granted access to their account and provided the options to view their account status, withdraw money, and deposit money
	7. User A choose to withdraw money
	8. User A is prompted to enter the amount to withdraw
	9. User A enters the amount to withdraw
	10. The ATM checks this amount against User A's account balance
	11. User A is notified that the amount entered is beyond their balance and is prompted to enter a different amount.
	12. User A enters the amount to withdraw
	13. The ATM checks this amount against User A's account balance
	14. The ATM deposits the required amount
	15. User A logs out of the ATM Machine and retrieves their debit card
5. Stage one:
		The User inserts the debit card into the ATM to gain access to their account resources. The ATM them promts the User to enter their PIN number. Once the PIN has been entered and verified, the User is prestented with options to display their account status, withdraw money, and deposit money. If the User selects the first option, they are presented the information and then redirected to the previous screen. If the User selects the second option, they are promted to enter the value to withdraw. The entered value is then checked against the account balance, and deposits the money if the value is less than the balance. Otherwise, the user is required to re-enter the value. If the third option is selected, the User is promted to physically enter money into the machine. Their account balance is then updated and they return to the previous screen. Once the User is ready to finish, their debit card is ejected and returned to the User.
	Stage two:
		Nouns: User, debit card, ATM, account, PIN, screen, money, option, value.
		Inconsequential: screen, money, option, value.
		Entities: User, debit card, account.
		Boundary: ATM
		Attributes: PIN
	
6. The diagram is located in the homework folder
7. The diagram is located in the homework folder
8. The diagram is located in the homework folder
9. The diagram is located in the homework folder
10. The diagram is located in the homework folder