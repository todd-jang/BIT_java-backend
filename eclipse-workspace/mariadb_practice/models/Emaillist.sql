desc emaillist;

-- insert

insert into emaillist values(null, '둘', '리', 'dooley@gmail.com');
insert into emaillist values(null, '이콜', '마', 'michol@gmai.com');


-- findAll

select no, first_name, last_name, email 
    from emaillist;
    

-- delete
delete no, first_name, last_name, email 
    from emaillist 
    where email = 'dooley@gmail.com';