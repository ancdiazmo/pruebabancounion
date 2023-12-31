--SCRIPT CREATION OF USER--
CREATE USER BANCOUNION IDENTIFIED BY "12345";
GRANT CONNECT TO BANCOUNION;
GRANT CREATE SESSION TO BANCOUNION;
GRANT CREATE ANY TABLE TO BANCOUNION;
GRANT UNLIMITED TABLESPACE TO BANCOUNION;
GRANT RESOURCE TO BANCOUNION;
ALTER USER BANCOUNION QUOTA UNLIMITED ON USERS;
ALTER USER BANCOUNION IDENTIFIED BY "12345";
SELECT DEFAULT_TABLESPACE FROM DBA_USERS WHERE USERNAME = 'BANCOUNION';


--SCRIPT DROP TABLE--
DROP TABLE BANCOUNION.EMPLOYEE;
DROP TABLE BANCOUNION.DEPARTMENT;


--SCRIPT CREATION DEPARTMENT TABLE--
CREATE TABLE BANCOUNION.DEPARTMENT (
	ID NUMBER GENERATED BY DEFAULT AS IDENTITY,
	NAME VARCHAR2(255) NULL
);
ALTER TABLE BANCOUNION.DEPARTMENT ADD CONSTRAINT "department_primary_key" PRIMARY KEY (ID);
DELETE FROM BANCOUNION.DEPARTMENT;
INSERT INTO BANCOUNION.DEPARTMENT (NAME) VALUES ('RRHH');
INSERT INTO BANCOUNION.DEPARTMENT (NAME) VALUES ('TI');
INSERT INTO BANCOUNION.DEPARTMENT (NAME) VALUES ('FINANZAS');
SELECT * FROM BANCOUNION.DEPARTMENT;


--SCRIPT CREATION EMPLOYEE TABLE--
CREATE TABLE BANCOUNION.EMPLOYEE (
	ID NUMBER GENERATED BY DEFAULT AS IDENTITY,
	NAME VARCHAR2(255) NULL,
	SALARAY NUMBER NULL,
	DEPARTMENT_ID NUMBER NOT NULL
);
ALTER TABLE BANCOUNION.EMPLOYEE ADD CONSTRAINT "employee_primary_key" PRIMARY KEY (ID);
ALTER TABLE BANCOUNION.EMPLOYEE ADD CONSTRAINT "employee_department_fk" FOREIGN KEY (DEPARTMENT_ID) REFERENCES BANCOUNION.DEPARTMENT (ID);
DELETE FROM BANCOUNION.EMPLOYEE;
INSERT INTO BANCOUNION.EMPLOYEE (NAME, SALARAY, DEPARTMENT_ID) VALUES ('Juan Camilo Diaz Correa', 1100000, 1);
INSERT INTO BANCOUNION.EMPLOYEE (NAME, SALARAY, DEPARTMENT_ID) VALUES ('Sandra Mora Arboleda', 1100000, 1);
INSERT INTO BANCOUNION.EMPLOYEE (NAME, SALARAY, DEPARTMENT_ID) VALUES ('Johana Andrea Perez Ramirez', 1100000, 2);
INSERT INTO BANCOUNION.EMPLOYEE (NAME, SALARAY, DEPARTMENT_ID) VALUES ('Santiago Molina Molina', 1100000, 3);
INSERT INTO BANCOUNION.EMPLOYEE (NAME, SALARAY, DEPARTMENT_ID) VALUES ('Paola Andrea Gonzales Castro', 1100000, 1);
INSERT INTO BANCOUNION.EMPLOYEE (NAME, SALARAY, DEPARTMENT_ID) VALUES ('Luis Mario Fernandez Montoya', 1100000, 1);
INSERT INTO BANCOUNION.EMPLOYEE (NAME, SALARAY, DEPARTMENT_ID) VALUES ('Pedro Correa Sanchez', 1100000, 2);
SELECT * FROM BANCOUNION.EMPLOYEE;

--SCRIPT TEST OF TABLES--
SELECT * FROM BANCOUNION.DEPARTMENT DEPARTMENT
INNER JOIN BANCOUNION.EMPLOYEE EMPLOYEE ON DEPARTMENT.ID = EMPLOYEE.DEPARTMENT_ID;





















