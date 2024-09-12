create table if not exists person
(
    id varchar
        constraint person_pk primary key,
    output_file varchar not null,
    creation_datetime timestamp default current_timestamp not null
);
