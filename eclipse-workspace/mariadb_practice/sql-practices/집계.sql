 -- aggregate
 
 -- select 에 집계함수가 projection된 쿼리 
 --  그룹함수 avg, max, min, count, sum, stddev, variance
 select avg(salary),sum(salary) from salaries;
 
 -- select에 그룹함수가 있으면 어떠한 컬럼도 select절에 오류지만 ...
 select emp_no, sum(salary) from salaries;
 
 -- 쿼리순서
 -- 1.from table 
 -- 2. where conditions (temporary)
 -- 3. 집계 (temp -> final)
 -- 4. output
 -- 에제 : 사번 10060사원이 평균 연봉?
 
 select sum(salary) from salaries 
	where emp_no='10060';

-- 4) group by
-- 사원별 평균 연봉?

select avg(salary) 
    from salaries
	group by emp_no;
-- 5)+ having
-- 평균월급 60000이상인 직원?
select emp_no,avg(salary)
    from salaries
    group by emp_no
    having avg(salary)>60000;
    
-- 6)order by (출력관련)
-- 맨뒤에~    
select emp_no,avg(salary)
    from salaries
    group by emp_no
    having avg(salary)>60000
    order by avg(salary) desc;
    
-- 주) 
-- 예 사번 10060인 직원 급여평균 급여종합
select emp_no, avg(salary), sum(salary)
    from salaries
    group by emp_no
    having emp_no='10060';


 