create table if not exists `customer`(
    `customer_id` int auto_increment primary key,
    `name` varchar(255) not null,
    `email` varchar(255) not null,
    `mobile_number` varchar(255) not null,
    `created_at` date not null,
    `created_by` varchar(255) not null,
    `updated_at` date default not null,
    `updated_by` varchar(255) not null
);

create table if not exists `account`(
    `account_number` int auto_increment primary key,
    `customer_id` int not null,
    `account_type` varchar(255) not null,
    `branch_address` varchar(255) not null,
    `created_at` date not null,
    `created_by` varchar(255) not null,
    `updated_at` date default not null,
    `updated_by` varchar(255) not null
);