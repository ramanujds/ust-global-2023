drop table if exists product CASCADE;
create table product (product_id varchar(255) not null, product_description varchar(255), product_name varchar(255), product_price float not null, primary key (product_id));

insert into product (product_description, product_name, product_price, product_id) values ('Apple iPhone 14 Smartphone - 4 GB - 256 GB','iPhone 14',79990,'p1001');

insert into product (product_description, product_name, product_price, product_id) values ('Samsung Galaxy S23 Ultra Smartphone - 12 GB - 256 GB','Samsung Galaxy S23 Ultra',125000.0,'p1002');

insert into product (product_description, product_name, product_price, product_id) values ('Apple Macbook Pro 14 M2 Pro 16GB 512GB Space Grey','Macbook Pro 14',210000.0,'p1003');
