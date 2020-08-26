drop table  if exists `user`;
create table `test`(
    `id` char(8) not null default '' comment 'id',
    `name` varchar(50) comment '名称',
    primary key (`id`)
)engine=innodb default  charset=utf8mb4 comment '测试';

insert into `test` (id,name) values (1,'asdasd');
insert into `test` (id,name) values (2,'asdasasdasdd');