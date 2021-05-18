-- create database  Furama_Resort;
use Furama_Resort;

create table position (
id_position int   primary key AUTO_INCREMENT,
position_name varchar(50)
);
alter table position modify id_position int  not null;

create table  education_degree(
education_degree_id int primary key auto_increment ,
education_degree_name varchar(50)
);
alter table education_degree modify education_degree_id int  not null;


create table division(
division_id int  primary key auto_increment,
division_name varchar(50) );
alter table division modify division_id int  not null;

create table  employee(
 employee_id  int auto_increment primary key,
	employee_birthday date,
    employee_id_card varchar(50),
	employee_salary double,
	employee_email varchar(45),
	employee_phone varchar(10),
	employee_address varchar(50),
     id_position int,
     division_id int,
     education_degree_id int,
     username varchar(25),
     
   foreign key( id_position )  references furama_resort.position( id_position ),
	foreign key(division_id)  references furama_resort.division(division_id),
	foreign key(education_degree_id)  references furama_resort.education_degree( education_degree_id),
    foreign key (username)references furama_resort.user_role(user_name)
);
alter table employee add column(employee_name varchar(50));

alter table employee modify employee_id int  not null;

create table  `role`( 
role_id int primary key auto_increment not null,
role_name  varchar(50)
);

create	table user_role(
role_id int auto_increment primary key not null,
user_name varchar(50),
foreign key(role_id) references furama_resort.`role`(role_id),
 foreign key(user_name) references furama_resort.`user`(user_name));
 
 ALTER TABLE user_role
ADD CONSTRAINT FK_user_role
FOREIGN KEY (PersonID) REFERENCES user_role(PersonID);

create table `user`(
user_name varchar(50) primary key not null,
pass_word varchar(50));

create	table attach_service(
attach_service_id int  primary key  auto_increment not null,
attach_service_name varchar(50),
attach_service_cost double,
attch_service_unit int,
attach_service_status varchar(50)

);
create table contract_detail(
contract_detail_id int ,
contrac_id int ,
attach_service_id int,
quantyti int,
foreign key (attach_service_id ) references furama_resort.attach_service(attach_service_id),
foreign key (contrac_id) references furama_resort.contract(contract_id)
);

drop table contract;
create  table contract(
contract_id int  primary key auto_increment not null,
contract_start_date datetime,
contract_end_date datetime,
contract_deposit double,
contract_total_money double,
employee_id  int,
customer_id int,
service_id int	,
foreign key (employee_id) references furama_resort.employee(employee_id)
);
alter  table contract
add foreign key (employee_id) references furama_resort.employee(employee_id);
alter  table contract
add foreign key (customer_id) references furama_resort.customer(customer_id);
alter  table contract
add foreign key (service_id ) references service(service_id );

create table customer_type(
customer_type_id int primary key auto_increment,
customer_type_name varchar(50)
);
create table customer(
customer_id int primary key auto_increment,
customer_type_id int,
customer_type_name varchar(50),
customer_birthday date,
customer_gender bit(1),
customer_id_card varchar(50),
customer_phone  varchar(45),
customer_email varchar(45),
customer_address varchar(50),
foreign key (customer_type_id) references furama_resort.customer_type(customer_type_id)
);
create table service_type(
service_type_id int,
service_type_name varchar(50));
create table rent_type(
rent_type_id int,
rent_type_name varchar(50),
rent_type_cost double
);
create table service(
service_id int,
service_name varchar(50),
service_area int ,
service_cost double,
servicr_max_people int,
rent_type_id int,
service_type_id int,
standar_room varchar(45),
desription_other_convenience varchar(45),
pool_area double,
number_of_floors int
);

alter table service add ( foreign key (service_type_id ) references service_type(service_type_id ),
foreign key (rent_type_id) references rent_type(rent_type_id));



 