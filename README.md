# Sushi Order Management System

## Project Scope

The Sushi Order Management System is developed using NetBeans and Java, providing a comprehensive solution for user account management, sushi order processing, and payment handling.

The system caters to two main user roles: Staff and Admin. Access privileges are enforced through a login system.

### User Roles

#### Staff
Staff members can utilize various features within the program, including order placement and payment processing.

#### Admin
Admin users have broader access, enabling them to manage user accounts and perform actions such as registration, modification, and deletion of accounts.

### Main System Features

1. **Register and Login System**
   - Admins handle the registration process, specifying unique identifiers (Id), names, usernames, and passwords for each account.
   - To access the system, users must provide their registered username and password. The system validates the input, denying access in case of errors.

2. **Account Management System (For Admins)**
   - Admins can manage accounts, performing actions like addition, modification, and deletion.
   - Sorting and searching functionalities are available to organize and locate data efficiently.

3. **Sushi Ordering System**
   - Based on a Point of Sale (POS) system, staff members receive and process orders within the system.
   - A summary of orders allows for verification before finalizing.

4. **Payment System**
   - The system calculates the total order amount, including tax (7%) and service charge (10%).

## Getting Started

1. Clone the repository to your local machine.

   ```bash
   git clone https://github.com/b6428259/Sushi-Order-Management
   ```

2. Open the project in NetBeans.

3. Configure the database connection settings if required.

4. Run the application.

## Dependencies

- Java
- NetBeans
- Database system (e.g., MySQL)

## Contributors

- [Ronnasit Tauyton](https://github.com/b6428259)

## License

This project is licensed under the [MIT License](LICENSE.md).
