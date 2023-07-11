select emp_no, first_name, last_name,date_format(hire_date,)
    from emplyees
    where first_name like '%mahe%' 
    or last_name like '%mahe%'
    order by hire_date desc;
    