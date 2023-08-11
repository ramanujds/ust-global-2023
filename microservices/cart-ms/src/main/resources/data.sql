drop table if exists cart_item CASCADE;
drop sequence if exists hibernate_sequence;
create sequence hibernate_sequence start with 1 increment by 1;
create table cart_item (cart_id integer not null, product_id varchar(255), product_name varchar(255), quantity integer not null, total_price float not null, primary key (cart_id));

insert into cart_item (product_id, product_name, quantity, total_price, cart_id) values ('p1001', 'iPhone 14', 1, 79990, 1)
