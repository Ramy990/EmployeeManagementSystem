# Employee Management System

## Student Information

- Full Name: Ramy nasr 
- Student ID:2300320

## Project Description

Employee Management System is a Java Object-Oriented Programming project based on the provided UML class diagram.

The project demonstrates:
- Abstract classes
- Inheritance
- Encapsulation
- Polymorphism
- Enum
- Composition/association between Department and Employee
- Lists and object management
- Salary calculation for different employee types

## Employee Types

### Employee
Abstract parent class containing common employee information such as:
- ID
- Name
- Gender
- Hire Date
- Department

It also defines the abstract `calculateSalary()` method.

### CommissionEmployee
Salary is calculated as:

`baseSalary + salesAmount * commissionRate`

### MonthlyEmployee
Salary is calculated as:

`monthlySalary + monthlySalary * bonusPercentage`

It also calculates additional vacation days based on years of service.

### HourlyEmployee
The first 40 hours are paid using the normal hourly rate. Hours above 40 are paid using the overtime rate.

### Department
A department contains a manager and a list of employees. It supports:
- Add employee
- Remove employee
- Find employee
- Calculate total payroll
- Print all employees

## Project Structure

```text
EmployeeManagementSystem/
├── src/
│   ├── Main.java
│   ├── model/
│   │   ├── Employee.java
│   │   ├── CommissionEmployee.java
│   │   ├── MonthlyEmployee.java
│   │   ├── HourlyEmployee.java
│   │   ├── Department.java
│   │   └── Gender.java
│   └── test/
│       └── MainTest.java
└── README.md
```

## How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA, NetBeans, Eclipse, or another Java IDE.
3. Make sure Java 8 or later is installed.
4. Run `Main.java`.
5. The program will create demo employees and demonstrate the department operations and salary calculations.

## GitHub

After creating the repository, run:

```bash
git init
git add .
git commit -m "Initial Employee Management System"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/YOUR-REPO-NAME.git
git push -u origin main
```

Replace `YOUR-USERNAME` and `YOUR-REPO-NAME` with your GitHub username and repository name.
