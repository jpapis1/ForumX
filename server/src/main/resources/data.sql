insert into Hobby (name, idHobby) values ('Football', 1)
insert into Hobby (name, idHobby) values ('Golf', 2)
insert into Hobby (name, idHobby) values ('Programming', 3)

insert into Status (name, idStatus) values ('Builder', 1)
insert into Status (name, idStatus) values ('Student', 2)
insert into Status (name, idStatus) values ('Teacher', 3)
insert into Status (name, idStatus) values ('Developer', 4)

insert into Client (email, firstName, lastName, password, idStatus, username, idClient) values ('ngreenstock3@myspace.com', 'Doretta', 'Chaize', 'rhZYIHw', 1, 'dorothy', 1)
insert into Client (email, firstName, lastName, password, idStatus, username, idClient) values ('blodingm@msn.com', 'Wilhelm', 'Cavell', 'aeg398yb', 1, 'will', 2)
insert into Client (email, firstName, lastName, password, idStatus, username, idClient) values ('sherington13@ow.ly', 'Isobel', 'Kemitt', 'oa79v91j', 2, 'kem', 3)
insert into Client (email, firstName, lastName, password, idStatus, username, idClient) values ('nFqjEYPoakIQq3@space.com', 'Randa', 'Paige', 'ae0b9baII', 3, 'rage', 4)


insert into Hobbies (idClient, idHobby) values (1, 1)
insert into Hobbies (idClient, idHobby) values (1, 2)

insert into Hobbies (idClient, idHobby) values (2, 3)

insert into Hobbies (idClient, idHobby) values (3, 3)

insert into Hobbies (idClient, idHobby) values (4, 1)
insert into Hobbies (idClient, idHobby) values (4, 2)
insert into Hobbies (idClient, idHobby) values (4, 3)

insert into Post (content, idClient, dateOfCreation, name, idPost) values ('Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.', 1, '2014-03-14 00:00:00', 'My very first article', 1)
insert into Post (content, idClient, dateOfCreation, name, idPost) values ('There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which dont look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isnt anything embarrassing hidden in the middle of text.', 1, '2015-05-16 00:00:00', 'Second article', 2)

insert into Post (content, idClient, dateOfCreation, name, idPost) values ('Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source.', 1, '2019-02-09 00:00:00', 'Whole story', 3)

insert into Post (content, idClient, dateOfCreation, name, idPost) values ('The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from de Finibus Bonorum et Malorum by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.', 4, '2019-02-10 00:00:00', 'The reckoning', 4)

insert into Post (content, idClient, dateOfCreation, name, idPost) values ('Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?', 4, '2019-03-20 00:00:00', 'The End', 5)

