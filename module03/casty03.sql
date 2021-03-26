create database Case_study_module3;
use Case_study_module3;
drop table if exists vitri;
create table if not exists ViTri(
id_vitri int primary key auto_increment ,
ten_vitri  varchar(50)
);

drop table if exists trinhdo;
create table if not exists trinhdo(
id_trinhdo int primary key auto_increment,
trinh_do varchar(50)
);
drop table if exists bophan;
create table  if not exists bophan(
id_bophan int primary key auto_increment,
ten_bophan varchar(50)
);
drop table if exists nhanvien;
create table if not exists NhanVien(
	id_nhanvien int primary key auto_increment,
    Hoten  varchar(255),
    id_vitri int,
    id_trinhdo int,
    id_bophan int,
    ngay_sinh date,
    so_cmnd int(9),
    luong float,
    sdt int(10),
    Email varchar(45),
    diachi varchar(255),
      foreign key( id_vitri)  references case_study_module3.vitri(id_vitri),
	foreign key( id_trinhdo)  references case_study_module3.trinhdo(id_trinhdo),
	foreign key( id_bophan)  references case_study_module3.bophan(id_bophan)
  
);
drop table if exists loai_KH;
create table if not exists loai_KH(
id_LoaiKH int primary KEY auto_increment,
ten_KH varchar(50)
);
 sp_rename 'loai_KH.ten_KH', 'tenloai_KH', 'COLUMN';


create table KH(
id_Kh int auto_increment primary key ,
id_loaiKH int,
Hovaten varchar(50),
ngay_sinh date,
so_cmnd int(9),
Email varchar(45),
diachi varchar(255),
foreign key (id_loaikh)references loai_KH(id_loaiKh)
);
create table loai_DV(
id_loaiDV int auto_increment primary key,
Ten_loaiDV varchar(50)
);
create table kieu_thue(
id_kieuthue int auto_increment primary key,
ten_kieuthue varchar(55),
Gia int

);
create table DV(
id_dichvu int primary KEY auto_increment,
ten_DV varchar(50),
dientich float,
sotang int,
songuoitoida int,
chiphithue long,
trangthai	varchar(50),
id_kieuthue int,
id_loaiDV int ,
foreign key (id_kieuthue) references kieu_thue(id_kieuthue),
foreign key (id_loaiDV) references loai_DV(id_loaiDV )
);
drop table if exists hopdong;
create table if not exists HopDong(
id_hopdong int primary key auto_increment,
id_nhanvien int,
id_Kh int,
id_dichvu int,
Ngaylamhopdong date,
ngayketthuc date,
tiencoc float,
tongtien double,
foreign key (id_nhanvien)references nhanvien(id_nhanvien),
foreign key(id_kh)references kh(id_kh),
foreign key(id_dichvu) references dv(id_dichvu)
);
create table dv_dikem(
id_dvdikem int auto_increment primary key,
ten_dvdikem varchar(50),
gia float,
donvi varchar(50),
trangthaikhadung varchar(50)

);
create table hopdongchitiet(
id_hopdongchitiet int auto_increment primary key,
id_hopdong INT,
id_dvdikem int,
soluong int,
foreign key (id_hopdong)references hopdong(id_hopdong),
foreign key(id_dvdikem)references dv_dikem(id_dvdikem)

);
select*FROM LOAI_DV;
insert into LOAI_DV (ten_loaidv)value("Villa"),("House"),("Room");
select *from dv;
select *from kieu_thue;
insert into kieu_thue(ten_kieuthue,gia)value("villa",500),("house",300),("Room",100);
 insert into dv(ten_dv,dienTich,sotang,songuoitoida,chiphithue,trangthai,id_kieuthue,id_loaidv)value ("villa",120,2,4,5000,"OK",1,1);

