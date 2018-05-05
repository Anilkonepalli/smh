
    select
        `id`,
        `branchName`,
        `location` 
    from
        `smhtest`.`branch`
        
  insert into branch (branchName,location) values('SMH','Anatapur');
  
  insert into ward (description,branch_id) values('ICU',1);
  
  insert into bed (bedNum,fee,isAvailability,ward_id) values(1,850,'Y',1);
  
  