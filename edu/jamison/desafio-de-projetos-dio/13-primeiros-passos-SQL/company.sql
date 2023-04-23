create schema if not exists company_constraints;
use company_constraints;

create table employee(
	Fname varchar(15) NOT NULL,
    Minit char,
    Lname varchar (15) NOT NULL,
    Ssn char(9) NOT NULL,
    Bdate DATE,
    Address varchar (30),
    sex char ,
    Salary decimal(10,2),
    Super_ssn char(9),
    Dno int NOT NULL,
    constraint chk_salary_employee check (Salary > 2000.0),
    constraint pk_employee primary key (Ssn)
);
    
alter table employee modify Dn int not null default 1;

desc employee;

create table departament(
	Dname varchar(15) NOT NULL,
    Dnumber int NOT NULL,
    Mgr_ssn char(9),
	Mgr_start_date date,
    Dept_create_date date,
    constraint chk_date_dpt check (Dept_create_date < Mgr_start_date),
    constraint pk_dept primary key (Dnumber),
    constraint unique_name_dpt unique (Dname),
    foreign key (Mgr_ssn) references employee(Ssn)
);

-- 'def', 'company_constraints', 'departament_ibfk_1', 'company_constraints', 'departament', 'FOREIGN KEY', 'YES'
-- modificar uma constraint: drop e add
alter table  departament drop constraint departament_ibfk_1;
alter table departament 
	add constraint fk_dept foreign key(Mgr_ssn) references employee(Ssn)
    on update cascade;

desc departament;

create table dept_locations(
	Dnumber int NOT NULL,
    Dlocation varchar(15) NOT NULL,
    constraint pk_dpt_location primary key (Dnumber, Dlocation),
    constraint fk_dpt_location foreign key (Dnumber) references departament(Dnumber)
);

alter table  dept_locations drop constraint fk_dpt_location;
alter table dept_locations
	add constraint fk_dept_locations foreign key(Dnumber) references departament(Dnumber)
    on delete cascade
    on update cascade;

create table project(
	Pname varchar(15) NOT NULL,
    Pnumber int NOT NULL,
    Plocation varchar (15),
    Dnum int NOT NULL,
    primary key (Pnumber),
    constraint unique_project unique (Pname),
    constraint fk_project foreign key (Dnum) references departament(Dnumber)
);

create table works_on(
	Essn char(9) NOT NULL,
    Pno int NOT NULL,
    Hours decimal(3,1) NOT NULL,
    primary key (Essn, Pno),
    constraint fk_works_on_Essn foreign key (Essn) references employee(Ssn),
    constraint fk_works_on_Pno foreign key (Pno) references project (Pnumber)
);


drop table dependent;
create table dependent(
	Essn char(9) NOT NULL,
    Dependent_name varchar (15) NOT NULL,
    Sex char,
    Bdate date,
    relationship varchar(8),
    primary key (Essn, Dependent_name),
    constraint fk_dependent foreign key (Essn) references employee(Ssn)
);

show tables;

desc dependent;

select * from information_schema.table_constraints
	where constraint_schema = 'company_constraints';