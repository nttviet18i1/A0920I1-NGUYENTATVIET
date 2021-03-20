create database luyen_tap;
use luyen_tap;
create table Khoa_hoc(
id int  ,
Ten varchar(50),
Tuoi int,
KhoaHoc varchar(50),
SoTien double
);
insert into Khoa_hoc(id, ten ,tuoi,khoahoc,sotien)value(1,'viet',21,'CNTT',300000),(2,'vy',19,'KTDN',320000),(3,'HUONG',21,'DL',200000),(3,'HUONG',21,'CNTT',500000);
select *from khoa_hoc where ten='Huong';
select sum(SOTIEN) as 'Tien of Huong'from Khoa_hoc
where ten='Huong';
select distinct( ten ) from khoa_hoc;