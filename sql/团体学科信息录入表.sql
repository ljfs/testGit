use ManagerDB
go
select * from Subjects -- where id >= 17
select s.id '���' , sbj '�γ�����' ,sp.sbjParent '���' from SubjectParent sp,Subjects s where sp.id = s.spid or s.spid = null order by s.id
select * from SubjectParent

insert into  SubjectParent(sbjParent) values('��ѧ�γ�')
insert into  SubjectParent(sbjParent) values('����')
insert into  SubjectParent(sbjParent) values('����')
insert into  SubjectParent(sbjParent) values('�����')
insert into  SubjectParent(sbjParent) values('����')
insert into  SubjectParent(sbjParent) values('����')
insert into  SubjectParent(sbjParent) values('��ѧ')

update SubjectParent set sbjParent = '��ѧ�γ�' where id = 1 


insert into Subjects(sbj) values('����')
insert into Subjects(sbj) values('��ʽ̫��ȭ')
insert into Subjects(sbj) values('��ѧ����')
insert into Subjects(sbj) values('JAVA���')
insert into Subjects(sbj) values('C���Ա��')
insert into Subjects(sbj) values('C++���')
insert into Subjects(sbj) values('C#���')
insert into Subjects(sbj) values('��ѧ��ѧ')
insert into Subjects(sbj) values('��ѧ��ѧ')
insert into Subjects(sbj) values('��ѧ����')
insert into Subjects(sbj) values('SQLServer���ݿ�������')
insert into Subjects(sbj) values('���׾���')
insert into Subjects(sbj) values('������')
insert into Subjects(sbj) values('����')
insert into Subjects(sbj) values('�������ּ���')
insert into Subjects(sbj) values('���ֻ���')
insert into Subjects(sbj) values('Word2010�༭����')
insert into Subjects(sbj) values('MvBox����ʹ����¼�Ƽ���')
insert into Subjects(sbj) values('��׿�����������')
insert into Subjects(sbj) values('THML+CSS��ҳ���')
insert into Subjects(sbj) values('Javascript�������')
insert into Subjects(sbj) values('��������ۻ���')
insert into Subjects(sbj) values('������ѧ����')



update Subjects set spid = 2 where id = 1
update Subjects set spid = 3 where id = 2
update Subjects set spid = 1 where id = 3
update Subjects set spid = 4 where id = 4
update Subjects set spid = 4 where id = 5
update Subjects set spid = 4 where id = 6
update Subjects set spid = 4 where id = 7
update Subjects set spid = 1 where id = 8
update Subjects set spid = 4 where id = 11
update Subjects set spid = 7 where id = 12
update Subjects set spid = 5 where id = 13
update Subjects set spid = 5 where id = 14
update Subjects set spid = 5 where id = 15
update Subjects set spid = 5 where id = 16
update Subjects set spid = 5 where id = 18
update Subjects set spid = 4 where id = 19
update Subjects set spid = 4 where id = 20
update Subjects set spid = 4 where id = 21
update Subjects set spid = 6 where id = 22
update Subjects set spid = 6 where id = 23