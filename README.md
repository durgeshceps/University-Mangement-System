# University-Mangement-System

create database bankmanagementsystem;

show databases;

use bankmanagementsystem;


create table signup(formno varchar(40), name  varchar(40),father_name varchar(20), dob varchar(20),gender varchar(20),email varchar(100),marital_status varchar(20), address varchar(200),city varchar(40),state varchar(20),pincode varchar(20));

show tables;

describe signup;
ALTER table signup MODIFY email VARCHAR(100);
select * from signup;

create table signuptwo ( formno varchar(20),religion varchar(20),category varchar(20), income varchar(20),education varchar(20), occupation  varchar(20),pan varchar(20),aadhar varchar(20),seniorcitizen varchar(20),existingaccount varchar(20) );

show tables;

select * from signuptwo;

create table signupThree ( formno varchar(20), accountType varchar(40), cardnumber varchar(40), pinnumber varchar(40), facility varchar(100) );
 create table login(formno varchar(20), cardnumber varchar(25), pinnumber varchar(10));
 show tables;
 
 select * from signupThree;
 
 select * from login;
 

 
 create table bank( pin varchar(10), date varchar(50), type  varchar(20), amount varchar(30) );


select * from bank;









