# Simple Banking Chatbot

A Java-based GUI chatbot for simple banking interactions like checking balance, viewing loan and credit card information, and managing debit card status. Includes user login functionality.

## Features

- ✅ User login authentication (default: `user` / `password`)
- ✅ Check balance
- ✅ View loan types, required documents, and interest rates (ROI)
- ✅ Check loan interest rates summary
- ✅ View credit card types and details
- ✅ Block and unblock debit cards
- ✅ Simple, beginner-friendly GUI using Java Swing

## Technologies Used

- Java (JDK 8 or higher)
- Swing for GUI

## How to Run

1. **Clone the repository**
```bash
git clone <repository_url>
```

2. **Navigate to the directory**
```bash
cd banking-chatbot
```

3. **Compile the Java file**
```bash
javac Chatbottt.java
```

4. **Run the chatbot**
```bash
java Chatbottt
```

## Default Login
- **Username:** `user`
- **Password:** `password`

## Screens and Actions

| Function               | Description                                                                           |
|-----------------------|--------------------------------------------------------------------------------------- |
| Login Screen          | Prompt for username and password.                                                      |
| Check Balance         | Displays current balance.                                                              |
| Loan Info             | Shows loan types, required documents, and interest rates.                              |
| Check Loan ROI        | Displays interest rates for various loan types.                                        |
| Credit Card Info      | Shows details of Silver, Gold, and Platinum credit cards.                              |
| Block Debit Card      | Blocks your debit card (if not already blocked).                                       |
| Unblock Debit Card    | Unblocks your debit card (if blocked).                                                 |
| Exit                  | Closes the application.                                                                |

## Folder Structure (Recommended for GitHub Upload)
```
📂 banking-chatbot/
 ├─ 📜 Chatbottt.java
 ├─ 📜 README.md
```

## Improvements You Can Add
- Store user data in files or a database
- Add transaction history feature
- Add mobile number/email verification
- Add styling with custom icons and colors



