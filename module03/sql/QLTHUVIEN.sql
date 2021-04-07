use managerbook;
drop table if exists category;
create table category(
id_category int primary key auto_increment,
tinhcam varchar(255),
tieuthuyet varchar(255),
giaoduc varchar(255),
truyentranh varchar(255),
  id_book int  ,
  foreign key (id_book) references managerbook.book(id)

);
create table  book(
id int auto_increment primary key,
tensach  varchar(255),
tacgia varchar(255)

);
create table student(
id_student int auto_increment primary key,
name_student varchar(255),
number_student varchar(255),
address_student varchar(255),
mail_student varchar(255)

);
drop table if exists BorrowOrder;
create table BorrowOrder(
id int auto_increment primary key,
date_borrowed date,
date_pay date,
status_book varchar(255),
id_student int,
 foreign key (id_student) references managerbook.student(id_student)
);