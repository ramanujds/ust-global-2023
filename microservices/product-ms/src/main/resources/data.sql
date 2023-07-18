drop table if exists product CASCADE;
create table product (product_id varchar(255) not null, description varchar(255), name varchar(255), price float not null, primary key (product_id));

insert into product (description, name, price, product_id) values ('Samsung Galaxy S23 Ultra Smartphone - 12 GB - 256 GB','Samsung Galaxy S23 Ultra',125000.0,'p1002')
