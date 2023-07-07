-- inner join (equi-)

-- 예 현재 근무 직원과 직책?(+ 여성 Engineer??)
select a.emp_no, a.first_name, b.title
    from employees a, titles b
    where a.emp_no = b.emp_no
    and b.to_date = '9999-01-01'
    and a.gender = 'f'
    and b.title='Engineer';
    
-- ANSI/ISO SQL1999 JOIN    

-- 1) Natural join
-- 두 테이블에 이름이 같은 공통 칼럼이 있다면 ~
select a.first_name, b.title
    from employees a natural join titles b -- on a.emp_no = b.emp_no하여도 ...
    where b.to_date = '9999-01-01';
    
-- 2) Join Using
select count(*)
    from salaries a join titles b using(emp_no)
    where a.to_date = '9999-01-01'
    and b.to_date = '9999-01-01';