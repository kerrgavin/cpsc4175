# ATM SRS
## 3.2 Functional Requirements
### 3.2.1 User Class 1 - The User
#### 3.2.1.1 Log in
3.2.1.1.1 The user must be able to log into account by entering thier bank card and pin in sequential order.

3.2.1.1.2 The bank card information must be checked against the database to ensure correct credentials.

3.2.1.1.3 If the credentials are correct, the pin number is verified using the account information that corresponds to the bank card information.

3.2.1.1.4 The user is then given access to account and directed to the main selection screen. 

3.2.1.1.5 If either authentication step fails, then the user is returned their card and prompted to start the process over again.

#### 3.2.1.2 Review Account Status

3.2.1.2.1 The user must be able to access thier account status.

3.2.1.2.2 The ATM must display the balance using a set notation.

3.2.1.2.3 The first line must label and contain the identication number for the account (account number).

3.2.1.2.4 The second line must label and contain the user name for the account.

3.2.1.2.5 The third line must label and contain the balance for the account.

#### 3.2.1.3 Deposit Money

3.2.1.3.1 The user must be able to deposit money. 

3.2.1.3.2 The user must be prompted to enter the money to be deposited.

3.2.1.3.3 There must be a mechanism by which the user can deposit money.

3.2.1.3.4 The ATM must keep track of the money being deposited.

3.2.1.3.5 The ATM must verify and display the amount of money deposited.

3.2.1.3.6 The ATM must update the user's balance.

3.2.1.3.7 The ATM must verify that the balance has been updated.

3.2.1.3.8 The ATM must display the new balance.

#### 3.2.1.4 Withdraw Money

3.2.1.4.1 The user must be able to withdraw money.

3.2.1.4.2 The user must be prompted enter the amount of money they wish to take out.

3.2.1.4.3 There must be a mechanism by which the user can enter the amount to withdraw.

3.2.1.4.4 The ATM must verify that the user has sufficent funds to withdraw the desired amount.

3.2.1.4.5 The ATM must verify that there is sufficent funds held within the machine to accommodate the desired amount.

3.2.1.4.6 If both verifications pass, the ATM must display the amount entered and must prompt the user to confirm the amount.

3.2.1.4.7 If either verification fails, then the user is notified that there was an error and redirected to the main selection screen.

3.2.1.4.8 If the user confirms that the amount is correct, then that amount is withdrawn and despensed to the user.

3.2.1.4.9 There must be a mechanism by which the ATM can despense money to the user.

3.2.1.4.10 The ATM must verify that the correct amount was despensed to the user and then update the account balance

3.2.1.4.11 The updated balance must be displayed to the user.

3.2.1.4.12 If the user does not confirm that the amount is correct, they are notified of the cancelation and redirected to the main selection screen.