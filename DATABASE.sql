create table QLgiay(
  Loai char(30),
    ma char(30),
  Mau nchar(20),
    size nchar(30),
  soluong varchar(20),
  gia char(30)
  )

select* from QLgiay
insert into QLgiay values('abc', '1234','xanhla','20','4','200000')
insert into QLgiay values('xyz', '2345','xanhduong','40','2','3000000')
insert into QLgiay values('ngauhung', '4657','xanhlam','39,40,41','2','555000')


delete QLgiay where ma=2132332 
delete QLgiay where ma=233
delete QLgiay where ma = 1212
delete QLgiay where ma=23
