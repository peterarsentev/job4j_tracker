create table if not exists items
(
    id      serial primary key,
    name    text,
    created timestamp without time zone not null default now()
);