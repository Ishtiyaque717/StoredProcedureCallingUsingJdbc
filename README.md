# StoredProcedureCalling
## _this project is created to call StoredProcedrue_

i have written one sp which is having one field as firstName and we have written a logic to read that firstName

```sh
********  SP   ***********
DELIMITER //
create procedure Employee()
BEGIN
select * from employee;
END//
DELIMITER ;
```

```sh
********  Calling Sp   ***********
call Employee();
```
```sh
********  Creating Employee Table   ***********
create table employee(id int, firstName varchar(50), address varchar(250));
```
```sh
********  Insert data in Employee Table   ***********
insert into employee values(1,"JackMa","China");
insert into employee values(2,"Bill Gates","America");
insert into employee values(3,"Elon Musk","South Africa");
insert into employee values(4,"Ambani","India");
insert into employee values(5,"Adani","Gujrat");
insert into employee values(6,"george Soros","Moscow");
```
