# Sample data

# --- !Ups

INSERT INTO job(jobName, jobClass, status, groupId, cron)
  VALUES
    ('JobA','com.domain.Ajob' , 0, 1, '0/5 1/2 * * * ?'),
    ('JobB','com.domain.Bjob' , 0, 1, '0/15 0/2 * * * ?'),
    ('JobC','com.domain.Cjob' , 0, 2, '0 1/3 * * * ?'),
    ('JobD','com.domain.Djob' , 0, 3, '0 0/5 * * * ?');

INSERT INTO jobCondition(jobName, parentJobName)
  VALUES
    ('JobA','JobB'),
