# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table "category_permission" (
  category_permission_id        bigserial not null,
  "user_id"                     bigint,
  "document_category_id"        bigint,
  constraint pk_category_permission primary key (category_permission_id)
);

create table "document" (
  document_id                   bigserial not null,
  "user_id"                     bigint,
  title                         varchar(255),
  content                       bytea,
  content_type                  varchar(255),
  file_name                     varchar(255),
  "document_category_id"        bigint,
  date_created                  timestamp,
  constraint pk_document primary key (document_id)
);

create table "document_category" (
  document_category_id          bigserial not null,
  "user_id"                     bigint,
  name                          varchar(255),
  is_permission_required        boolean,
  constraint uq_document_category_name unique (name),
  constraint pk_document_category primary key (document_category_id)
);

create table "document_comment" (
  comment_id                    bigserial not null,
  "user_id"                     bigint,
  content                       varchar(255),
  "document_id"                 bigint,
  date_created                  timestamp,
  constraint pk_document_comment primary key (comment_id)
);

create table "login_stats" (
  login_stats_id                bigserial not null,
  "user_id"                     bigint,
  agent                         varchar(255),
  date                          timestamp,
  ip                            varchar(255),
  constraint pk_login_stats primary key (login_stats_id)
);

create table "user" (
  user_id                       bigserial not null,
  email                         varchar(255),
  password_hash                 varchar(255),
  user_name                     varchar(255),
  user_surname                  varchar(255),
  date_creation                 timestamp,
  user_level                    integer,
  user_ban                      boolean,
  constraint uq_user_email unique (email),
  constraint pk_user primary key (user_id)
);

alter table "category_permission" add constraint fk_category_permission_user_id foreign key ("user_id") references "user" (user_id) on delete restrict on update restrict;
create index ix_category_permission_user_id on "category_permission" ("user_id");

alter table "category_permission" add constraint fk_category_permission_document_category_id foreign key ("document_category_id") references "document_category" (document_category_id) on delete restrict on update restrict;
create index ix_category_permission_document_category_id on "category_permission" ("document_category_id");

alter table "document" add constraint fk_document_user_id foreign key ("user_id") references "user" (user_id) on delete restrict on update restrict;
create index ix_document_user_id on "document" ("user_id");

alter table "document" add constraint fk_document_document_category_id foreign key ("document_category_id") references "document_category" (document_category_id) on delete restrict on update restrict;
create index ix_document_document_category_id on "document" ("document_category_id");

alter table "document_category" add constraint fk_document_category_user_id foreign key ("user_id") references "user" (user_id) on delete restrict on update restrict;
create index ix_document_category_user_id on "document_category" ("user_id");

alter table "document_comment" add constraint fk_document_comment_user_id foreign key ("user_id") references "user" (user_id) on delete restrict on update restrict;
create index ix_document_comment_user_id on "document_comment" ("user_id");

alter table "document_comment" add constraint fk_document_comment_document_id foreign key ("document_id") references "document" (document_id) on delete restrict on update restrict;
create index ix_document_comment_document_id on "document_comment" ("document_id");

alter table "login_stats" add constraint fk_login_stats_user_id foreign key ("user_id") references "user" (user_id) on delete restrict on update restrict;
create index ix_login_stats_user_id on "login_stats" ("user_id");


# --- !Downs

alter table "category_permission" drop constraint if exists fk_category_permission_user_id;
drop index if exists ix_category_permission_user_id;

alter table "category_permission" drop constraint if exists fk_category_permission_document_category_id;
drop index if exists ix_category_permission_document_category_id;

alter table "document" drop constraint if exists fk_document_user_id;
drop index if exists ix_document_user_id;

alter table "document" drop constraint if exists fk_document_document_category_id;
drop index if exists ix_document_document_category_id;

alter table "document_category" drop constraint if exists fk_document_category_user_id;
drop index if exists ix_document_category_user_id;

alter table "document_comment" drop constraint if exists fk_document_comment_user_id;
drop index if exists ix_document_comment_user_id;

alter table "document_comment" drop constraint if exists fk_document_comment_document_id;
drop index if exists ix_document_comment_document_id;

alter table "login_stats" drop constraint if exists fk_login_stats_user_id;
drop index if exists ix_login_stats_user_id;

drop table if exists "category_permission" cascade;

drop table if exists "document" cascade;

drop table if exists "document_category" cascade;

drop table if exists "document_comment" cascade;

drop table if exists "login_stats" cascade;

drop table if exists "user" cascade;

