Create Database ManagerDB
on
(
	name = 'ManageDB',
	filename = 'E:\��ζѧϰѧ������\twpxxxsttdata\ManageDB.mdf',
	size = 3MB,
	filegrowth = 25%
)
log on
(
	name = 'ManageDB_log',
	filename = 'E:\��ζѧϰѧ������\twpxxxsttdata\ManageDB_log.ldf',
	size = 2MB,
	filegrowth = 20%
)
go
use ManagerDB
go
create table t_person
(
	id int primary key identity(1,1) not null, -- ���к�
	pName varchar(20),--��Ա����
	pAge int not null, --��Ա����
	pGender varchar(2) check(pGender = '��' or pGender =  'Ů'),--��Ա�Ա��޶�Ϊ�л�Ů��
	pProvince varchar(20) null,--��Ա����ʡ��
	pCity varchar(30) null,--��Ա���ڳ���
	pMBP varchar(11) null, --��Ա�ֻ���
	pSubjects varchar(max) not null ,--��Աѧϰ��Ŀ
	pQId varchar(50) not null--��ԱQQ��
)
--��Ŀ��
create table Subjects
(
	id int identity(1,1) primary key, --��Ŀ���
	sbj varchar(50) not null check(sbj != ' ' or sbj != '') --��Ŀ����
)
--�γ����ͱ�
create table SubjectParent
(
	id int primary key identity(1,1) not null,--�γ����ͱ��
	sbjParent varchar(10),--�γ���������
	sbjId int foreign key references Subjects(id) null--��Ӧ�Ŀγ�
)
--ʡ�ݱ�
create table Province
(
	id int primary key identity(1,1) not null,--ʡ��id
	Province varchar(20)--ʡ������
)
--���б�
create table City
(
	id int primary key identity(1,1) not null,--����id
	t_city varchar(50),--��������
	pid int foreign key references Province(id) not null--�������ʡ��
)
--��¼��
create table p_login
(
	userid int primary key identity(10000,1) not null ,--��¼�˺�
	pid int foreign key references t_person(id),--�������ѧ����id���
	password varchar(16) not null,--��¼����
	ident int not null--��Ա���0Ϊ��ͨ��Ա��1Ϊ��ʦ��2Ϊ��ͨ����Ա��3Ϊ�ײ����Ա
)
--��Ա��ݱ�
create table ident
(
	id int primary key identity(0,1) not null,
	identityName varchar(20) unique not null
)
--========================================================--
--�ļ�����
create table fileTyp
(
	id int primary key identity(1,1) not null,
	fileType varchar(20) not null -- �ϴ�����
)
--�ļ����ͱ�
create table unfolder
(
	id int primary key identity(1,1) not null,
	typeid int foreign key references fileTyp(id), -- �ļ����ͱ�ţ���������ļ�����id
	fileName varchar(50) not null unique -- �ϴ��ļ��ĺ�׺��
)
--��������Ϣ��
create table servicemanager
(
	id int primary key identity(1,1) not null,
	serviceName varchar(100) not null, -- ����������
	serviceIp varchar(13) not null, -- ��������IP��ַ
	serviceStatue int check(serviceStatue = 1 or serviceStatue = 0) default(0) -- ��������״̬��1Ϊ���ã�0Ϊ����
)
--�������ռ��
create table servicelocalurl
(
	id int primary key identity(1,1) not null,
	savePath varchar(100) not null, -- ������·��
	pathHomeSize int not null, -- �̷�ʣ��ռ�
	pathHomedescr varchar(50) not null -- �����̷�������
)
--ͼƬ���ͱ�
create table fileIconName
(
	id int primary key identity(1,1) not null,
	iconTypeName varchar(10) not null -- ͼ���׺��
)
--ͼƬ��Ϣ��
create table fileIcon
(
	id int primary key identity(1,1) not null,
	fileIconSetPath varchar(max) not null, -- �ļ����ϴ�·����
	fileIconSavePath varchar(max) not null, -- �ļ�ͼ��ı���·��
	fileIconName varchar(100) not null, -- �ļ�ͼ������
	fileIconNameId int foreign key references fileIconName(id) -- ͼ��ĺ�׺����ţ��������ͼ���׺����id���ǿ�
)
--���״̬��
create table examineAndVerifyRank
(
	id int primary key identity(1,1) not null,
	passedStatus varchar(20) -- ���״̬
)
--�ļ���Ϣ��
create table fileMessage
(
	id int primary key identity(1,1),
	fileOfSubjectParentId int foreign key references SubjectParent(id), -- ϵ���ţ��������ϵ���id���ǿ�
	fileOfSubjectId int foreign key references Subjects(id), -- �γ̱�ţ�������ӿγ̱�id���ǿ�
	fileTypeId int foreign key references fileTyp(id), -- �ļ����ͱ�ţ���������ļ�����id���ǿ�
	filenameId int foreign key references unfolder(id), -- �ļ���׺������������ļ���׺��id���ǿ�
	fileText varchar(max) not null, -- �ļ�����
	fileUpperId int foreign key references t_person(id), -- �ϴ��ߣ�������ӳ�Աid���ǿ�
	fileSize int not null, -- �ļ���С
	fileStatueId int foreign key references examineAndVerifyRank(id) , -- �ϴ�״̬
	fileSaveDate datetime not null, -- �ϴ�����
	fileIconId int foreign key references fileIcon(id) , -- �ϴ�ͼ�꣬�������ͼ��id���ǿ�
	fileSaveIPId int foreign key references servicemanager(id) , -- �����ļ���������IP��ַ��������ӱ����������IP��ַ���
	specialty int check(specialty = 1 or specialty = 0), -- רҵ����Ϊ1����רҵ����Ϊ0
	passed int  check(passed = 0 or passed = 1 or passed = 2 or passed = 3) default(1), -- 1��ʾ����ˣ�2��ʾ����ͨ����3��ʾ��ȫͨ����0��ʾ��ͨ��
	passedDate datetime  --�������
)

--========================================================--

--������ͱ�
create table fileImportant
(
	id int primary key identity(1,1) not null,
	special varchar(50) not null unique -- �Ƿ�רҵ�ļ����
)
--�ļ�Ȩ�ޱ�
create table examineAndVerifyPower
(
	id int primary key identity(1,1) not null,
	passedStatusId int foreign key references examineAndVerifyRank(id), -- ��˵ȼ�
	identId int foreign key references ident(id), -- ��ӦȨ����ݣ������Ӧ�����Ϣ���������ǿ�
	special int foreign key references fileImportant(id) -- ��Ӧ�ļ�Ȩ�ر�ţ������Ӧ�ļ�Ȩ�ر��ǿ�
)
--�ļ������־��
create table fileStatusLog
(
	id int primary key identity(1,1),
	fileId int foreign key references fileMessage(id), -- �ļ����
	passedStatusId int foreign key references examineAndVerifyRank(id), -- ���״̬
	passedStatusRemark varchar(max), -- ���״̬��ԭ��ע
	remark varchar(max) -- ���ձ�ע�����δͨ��ʱ��עԭ��
)

--========================================================--
--�����Ϣ��
create table advertisement
(
	id int primary key identity(1,1) not null,
	personId int foreign key references t_person(id) not null, -- ��Ա��Ϣ��ţ������Ӧ��Ա��Ϣ����
	ident int foreign key references ident(id) check(ident = 1) not null, -- ��Ա��ݱ�ţ������Ӧ��Ա��¼����ݱ��
	theme varchar(40) not null, -- �������
	upperDate datetime not null, -- �ϴ����ʱ�䣬�ǿգ�Ĭ�ϵ�ǰʱ��
	startDate datetime, -- �������ʱ�䣬����Ϊ�գ�Ĭ�ϵ�ǰʱ��
	endDate datetime, -- ��浽��ʱ�䣬����Ϊ�գ����ټ��������
	statusId int foreign key references examineAndVerifyRank(id) -- ���״̬������������Ȩ�ޱ�id���ǿ�
)

--========================================================--
--Ȩ�޲�����
create table manageprower
(
	id int primary key identity(1,1) not null,
	disc varchar(50) not null unique -- ����Ȩ������
)
--Ȩ�ޱ�
create table prower
(
	id int primary key identity(1,1) not null,
	manage varchar(50) not null unique, -- ��Ӧ���ܱ�Ĺ���
	checkeds varchar(20) not null, -- ֱ�Ӵ����������Ȩ��
	objectnode varchar(20), -- ���ܵĸ��ڵ�
	childnode int foreign key references manageprower(id), -- 1Ϊֻ�����ѯ��2Ϊ�����ѯ�޸ģ�3Ϊ����CURD���� 
	changepersonId int foreign key references t_person(id), -- �޸�Ȩ�޵�ִ���ߣ������Ӧ��Ա��Ϣ���
	orderident int foreign key references ident(id), -- ��ִ��Ȩ�޲����Ľ�ɫ
	changedate datetime not null -- �޸Ľ�ɫ����Ȩ�޵�ʱ��
)