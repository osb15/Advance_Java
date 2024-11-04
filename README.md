<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hibernate Associations Example</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
        }
        h1, h2, h3 {
            color: #333;
        }
        code {
            background-color: #f4f4f4;
            padding: 2px 4px;
            border-radius: 4px;
        }
        pre {
            background-color: #f4f4f4;
            padding: 10px;
            border-radius: 4px;
            overflow-x: auto;
        }
    </style>
</head>
<body>

    <h1>Hibernate Associations Example</h1>

    <p>This repository demonstrates basic Hibernate associations in Java, including:</p>
    <ul>
        <li>One-to-One</li>
        <li>One-to-Many</li>
        <li>Many-to-One</li>
        <li>Many-to-Many</li>
    </ul>

    <h2>Getting Started</h2>

    <h3>Prerequisites</h3>
    <ul>
        <li>Java 8 or higher</li>
        <li>Maven</li>
        <li>A relational database (e.g., MySQL, PostgreSQL)</li>
    </ul>

    <h3>Project Structure</h3>
    <pre><code>
hibernate-associations/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               ├── model/
│   │               ├── dao/
│   │               └── main/
│   └── resources/
│       └── hibernate.cfg.xml
└── pom.xml
    </code></pre>

    <h2>Associations Overview</h2>

    <h3>One-to-One</h3>
    <p>A one-to-one association means that one entity is associated with exactly one instance of another entity. For example, a <code>User</code> can have one <code>Profile</code>.</p>

    <h3>One-to-Many</h3>
    <p>A one-to-many association means that one entity can be associated with multiple instances of another entity. For example, a <code>Department</code> can have many <code>Employees</code>.</p>

    <h3>Many-to-One</h3>
    <p>A many-to-one association means that multiple instances of one entity can be associated with a single instance of another entity. For example, an <code>Employee</code> can belong to one <code>Department</code>.</p>

    <h3>Many-to-Many</h3>
    <p>A many-to-many association means that multiple instances of one entity can be associated with multiple instances of another entity. For example, a <code>Student</code> can enroll in many <code>Courses</code>, and each <code>Course</code> can have many <code>Students</code>.</p>

    <h2>Running the Application</h2>
    <ol>
        <li>Clone the repository:</li>
        <pre><code>git clone https://github.com/yourusername/hibernate-associations.git</code></pre>
        <li>Configure your database settings in <code>hibernate.cfg.xml</code>.</li>
        <li>Build and run the application:</li>
        <pre><code>mvn clean install
mvn exec:java -Dexec.mainClass="com.example.hibernate.main.Main"</code></pre>
    </ol>

    <h2>License</h2>
    <p>This project is licensed under the MIT License.</p>

</body>
</html>
