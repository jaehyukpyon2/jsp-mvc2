create database jspmvc2;
use jspmvc2;
create table mvcboard (
	idx int primary key AUTO_INCREMENT, 
    name varchar(100) not null,
    title varchar(200) not null,
    content varchar(2000) not null,
    postdate date default (current_date),
    ofile varchar(100),
    sfile varchar(100),
    downcount int default 0 not null,
    pass varchar(100) not null,
    visitcount int default 0 not null);

insert
into mvcboard(name, title, content, pass)
values('변재혁', '제목1', '내용1', '1234');

insert
into mvcboard(name, title, content, pass)
values('변재혁', '제목2', '내용2', '1234');

insert
into mvcboard(name, title, content, pass)
values('변재혁', '제목3', '내용3', '1234');

insert
into mvcboard(name, title, content, pass)
values('변재혁', '제목4', '내용4', '1234');


insert
into mvcboard(name, title, content, pass)
values('변재혁', '제목4', '내용4', '1234');

insert
into mvcboard(name, title, content, pass)
values('변재혁', '안녕하세요!', '하하하1', '1234');

insert
into mvcboard(name, title, content, pass)
values('변재혁', '헤헤', '후후후', '1234');

select * from mvcboard order by idx desc;
delete from mvcboard;

select *
from mvcboard ;

select *
from mvcboard
where idx = 152
and ofile like '';