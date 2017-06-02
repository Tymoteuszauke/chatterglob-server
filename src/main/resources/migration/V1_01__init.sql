CREATE TABLE c_users (
    id int not null auto_increment primary key,
    username varchar(200),
    password varchar(500),
    mail varchar(100)
);

CREATE TABLE c_messages (
    id int not null auto_increment primary key,
    message varchar(1500),
    user_id int references c_users(id),
    constraint fk_message_user_id foreign key(user_id) references c_user(id)
);