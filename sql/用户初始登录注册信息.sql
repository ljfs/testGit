use ManagerDB
go
select id '初始编号' , pName '成员姓名' from t_person
select * from p_login
select userid '账号' , pid '成员编号', ident '身份编号' from p_login
insert into p_login(pid,password,ident) values(22,'ljfxwf2015',4)
insert into p_login(pid,password,ident) values(7,'123456',3)

insert into p_login(pid,password,ident) values(1,'123456',0)
insert into p_login(pid,password,ident) values(2,'123456',0)

insert into p_login(pid,password,ident) values(3,'123456',0)
insert into p_login(pid,password,ident) values(4,'123456',0)
insert into p_login(pid,password,ident) values(5,'123456',0)
insert into p_login(pid,password,ident) values(6,'123456',0)
insert into p_login(pid,password,ident) values(8,'123456',0)
insert into p_login(pid,password,ident) values(9,'123456',0)
insert into p_login(pid,password,ident) values(10,'123456',0)
insert into p_login(pid,password,ident) values(11,'123456',0)
insert into p_login(pid,password,ident) values(12,'123456',0)
insert into p_login(pid,password,ident) values(13,'123456',0)
insert into p_login(pid,password,ident) values(14,'123456',0)
insert into p_login(pid,password,ident) values(15,'123456',0)
insert into p_login(pid,password,ident) values(16,'123456',0)
insert into p_login(pid,password,ident) values(17,'123456',0)
insert into p_login(pid,password,ident) values(18,'123456',0)
insert into p_login(pid,password,ident) values(19,'123456',0)
insert into p_login(pid,password,ident) values(20,'123456',0)
insert into p_login(pid,password,ident) values(21,'123456',0)
insert into p_login(pid,password,ident) values(23,'123456',0)
insert into p_login(pid,password,ident) values(24,'123456',0)
insert into p_login(pid,password,ident) values(25,'123456',0)
insert into p_login(pid,password,ident) values(26,'123456',0)
insert into p_login(pid,password,ident) values(27,'123456',0)
insert into p_login(pid,password,ident) values(28,'123456',0)
insert into p_login(pid,password,ident) values(29,'123456',0)
insert into p_login(pid,password,ident) values(30,'123456',0)
insert into p_login(pid,password,ident) values(31,'123456',0)
insert into p_login(pid,password,ident) values(32,'123456',0)
insert into p_login(pid,password,ident) values(33,'123456',0)
insert into p_login(pid,password,ident) values(34,'123456',0)
insert into p_login(pid,password,ident) values(35,'123456',0)
insert into p_login(pid,password,ident) values(36,'123456',0)
insert into p_login(pid,password,ident) values(37,'123456',0)
insert into p_login(pid,password,ident) values(38,'123456',0)
insert into p_login(pid,password,ident) values(39,'123456',0)
insert into p_login(pid,password,ident) values(40,'123456',0)
insert into p_login(pid,password,ident) values(41,'123456',0)
insert into p_login(pid,password,ident) values(42,'123456',0)
insert into p_login(pid,password,ident) values(43,'123456',0)
insert into p_login(pid,password,ident) values(44,'123456',0)
insert into p_login(pid,password,ident) values(45,'123456',0)
insert into p_login(pid,password,ident) values(46,'123456',0)
insert into p_login(pid,password,ident) values(47,'123456',0)
insert into p_login(pid,password,ident) values(48,'123456',0)
insert into p_login(pid,password,ident) values(49,'123456',0)
insert into p_login(pid,password,ident) values(50,'123456',0)
insert into p_login(pid,password,ident) values(51,'123456',0)
insert into p_login(pid,password,ident) values(52,'123456',0)
insert into p_login(pid,password,ident) values(53,'123456',0)
insert into p_login(pid,password,ident) values(54,'123456',0)


update p_login set ident = 1 where pid = 35

select  l.userid '登录编号' ,p.pName '姓名',p.pGender '性别',p.pAge '年龄',i.identityName '身份',p.pReputation '信誉度'  from t_person p , p_login l ,ident i where p.id = l.pid and l.ident = i.id and l.ident >=0 and p.pReputation != 0