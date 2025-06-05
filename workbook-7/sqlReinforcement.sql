-- SQL Reinforcement

-- How to delete Database
DROP Database 			-- This deletes the database 
if exists School; 		-- if it exists (doesn't need this but it is an extra check)

-- Creats School Database
Create Database School;

-- Switch to the School Database
use school;

-- drop tables if they exist
drop table if exists StudentCourses;
drop table if exists Students;
drop table if exists Courses;

--  create Table of Students
create table Students(
StudentID int auto_increment primary key,
FirstName varchar(50) not null,
LastName  varchar(50) not null,
BirthDate      date,
EnrollmentDate date,
Email varchar(100)
);

-- create Table of Courses
create table Courses(
CourseID int auto_increment primary key,
CourseName varchar(100) not null,
CourseDescription text,
Credits int not null
);

-- Create the StudentCourses Table
create table StudentCourses(
StudentCourseID int auto_increment primary key,
StudentID int,
CourseID int,
EnrollmentDate date,
foreign key (StudentID) references Students(StudentID),
foreign key (CourseID) references Courses(CourseID)
);

insert into Students (FirstName, LastName, BirthDate, EnrollmentDate, Email)
values ('John',
		'Doe',
        '2001-03-13',
        '2025-02-02',
        'johndoe@gmail.com'
);

insert into Courses (CourseName, CourseDescription, Credits)
values('Introduction to Computer Science', 'A beginner course in Computer Science.', 3),
	  ('Calculus II', 'An Introduction to Calculus', 4);
      
insert into StudentCourses (StudentID, CourseID, EnrollmentDate)
values(1,1, '2025-05-25');