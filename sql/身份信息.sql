use ManagerDB
go
select * from ident order by id 
insert into ident(identityName) values('ѧ��')
insert into ident(identityName) values('��ʦ')
insert into ident(identityName) values('����Ա')
insert into ident(identityName) values('�ײ����Ա')
insert into ident(identityName) values('�������Ա')


update p_login set ident = 2 where userid =10011
update p_login set ident = 2 where userid =10021
update p_login set ident = 2 where userid =10041
update p_login set ident = 2 where userid =10017

select ps.pName '����',ps.pGender '�Ա�',ps.pAge '����', lg.userid '��¼�˺�' , it.identityName '���' from t_person ps, p_login lg,ident it where ps.id = lg.pid and lg.ident = it.id






drop table ident