create table notice(

id INT,
title varchar2(45),
content varchar2(50),
regdate Date,
hit int,
pub number(1,0),
memberID int



);

    
--alter table notice drop column memberid;
--
alter table notice add pub number(1,0) ;
--
--alter table notice add memberid int;


insert into notice values ( 1,2,3,sysdate,5,6);