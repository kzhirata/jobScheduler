# Contacts Schema

# --- !Ups

CREATE SEQUENCE job_id_seq;

CREATE TABLE job (
    id integer NOT NULL DEFAULT nextval('job_id_seq'),
    jobName varchar(255) not null,
    jobClass varchar(255) not null,
    status integer not null,
    groupId integer not null,
    cron varchar(255) not null,
    primary key (id)
);


CREATE SEQUENCE jobconditions_id_seq;

CREATE TABLE jobcondition (
    id integer NOT NULL DEFAULT nextval('jobconditions_id_seq'),
    jobName varchar(255) NOT NULL,
    parentJobName varchar(255) NOT NULL,
    primary key (id)
);


# --- !Downs

DROP TABLE job;
DROP SEQUENCE job_id_seq;
DROP TABLE jobconditions;
DROP SEQUENCE jobconditions_id_seq;

