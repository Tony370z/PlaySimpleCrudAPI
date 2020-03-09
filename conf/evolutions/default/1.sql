# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table cliente (
  id                            integer auto_increment not null,
  dni                           varchar(255),
  nombre                        varchar(255),
  apellido                      varchar(255),
  tlf                           varchar(255),
  email                         varchar(255),
  constraint pk_cliente primary key (id)
);


# --- !Downs

drop table if exists cliente;

