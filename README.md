<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Advanced Java Programs</title>
</head>
<body>

<h1>Advanced Java Programs</h1>

<p>This repository contains various examples and exercises related to advanced Java topics, particularly focused on <strong>Hibernate</strong> ORM framework mappings and <strong>Hibernate Query Language (HQL)</strong>.</p>

<h2>Table of Contents</h2>
<ul>
    <li><strong>Hibernate One-to-One Mapping</strong>
        <ul>
            <li>Example code and tutorials on how to implement one-to-one relationships using Hibernate.</li>
        </ul>
    </li>
    <li><strong>Hibernate One-to-Many Mapping</strong>
        <ul>
            <li>Example code and tutorials on how to implement one-to-many relationships using Hibernate.</li>
        </ul>
    </li>
    <li><strong>Hibernate Basic Configuration</strong>
        <ul>
            <li>Configuration files and examples for setting up Hibernate in Java projects.</li>
        </ul>
    </li>
    <li><strong>Hibernate Query Language (HQL)</strong>
        <ul>
            <li>Examples demonstrating how to use HQL for querying entities in the database.</li>
        </ul>
    </li>
</ul>

<h2>Folder Structure</h2>
<ul>
    <li><strong>HIBERNATE_1</strong>: Contains basic setup and configuration of Hibernate.</li>
    <li><strong>Hibernate_One_To_One_Mapping</strong>: Demonstrates one-to-one mapping in Hibernate with step-by-step code examples.</li>
    <li><strong>Hibernate_One_To_Many_Mapping</strong>: Demonstrates one-to-many mapping in Hibernate with step-by-step code examples.</li>
    <li><strong>HQL</strong>: Contains example queries using HQL for different operations such as fetching, updating, and deleting entities.</li>
</ul>

<h2>Prerequisites</h2>
<ul>
    <li><strong>Java JDK</strong> (Version 8 or higher)</li>
    <li><strong>Maven</strong> or <strong>Gradle</strong> for dependency management</li>
    <li><strong>Hibernate Core Library</strong></li>
    <li><strong>MySQL</strong> or any other database management system for testing persistence</li>
</ul>

<h2>How to Run</h2>
<ol>
    <li>Clone the repository:
        <pre><code>git clone https://github.com/your_username/Advance_Java.git</code></pre>
    </li>
    <li>Navigate to the desired project folder (e.g., <em>Hibernate_One_To_One_Mapping</em>) and build the project:
        <pre><code>cd Hibernate_One_To_One_Mapping
mvn clean install</code></pre>
    </li>
    <li>Configure the <code>hibernate.cfg.xml</code> file to point to your database.</li>
    <li>Run the project from your IDE or command line.</li>
</ol>

<h2>Hibernate Query Language (HQL)</h2>
<p>HQL is an object-oriented query language similar to SQL but works with Hibernate's persistent objects and their properties.</p>
<p>Examples in the <strong>HQL</strong> folder include:</p>
<ul>
    <li>Basic Select Queries</li>
    <li>Joins and Associations</li>
    <li>Aggregation Functions</li>
    <li>Updating and Deleting Entities using HQL</li>
</ul>

<h2>Resources</h2>
<ul>
    <li><a href="https://hibernate.org/orm/" target="_blank">Official Hibernate Documentation</a></li>
    <li><a href="https://www.oracle.com/java/technologies/persistence-jsp.html" target="_blank">Java Persistence API (JPA)</a></li>
</ul>

</body>
</html>
