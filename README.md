# Bank Application
## The application should:
- Read a .csv file containing names, social security numbers, account types, and initial deposits.
- Use the proper data structure to hold these accounts.
- Assign a Safe Deposit Box to Saving account holders, identified by a 3-digit number and with a 4-digit access code.
- Assign a Debit Card to Checking account holders with a 12-digit number and a 4-digit PIN.
- Assign interest rates according to the account type:
    - Savings accounts will use .25 points less than the base rate.
    - Checking accounts will use 15% of the base rate.
- Display the account's relevant information.

### Both Checking and Saving accounts share some properties:
- deposits
- withdrawals
- transfers
- account details
- 11-Digit Account Number (generated according to the criteria: 1 or 2 if Savings or Checking, last two digits of SSN, unique 5-digit number, and random 3-digit number)

