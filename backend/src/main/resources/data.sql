INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ('Bootcamp HTML', 'https://th.bing.com/th/id/OIP.XOcIn1C4klFDj1VH97Ve8gHaHa?pid=ImgDet&rs=1', 'https://th.bing.com/th/id/R863273bdecce8ed3824c2fe1d2567837?rik=DlSKderAy9W2%2fg&riu=http%3a%2f%2fucbugg.github.io%2flearn.ucbugg%2fimages%2fbasic-animation%2fimage021.png&ehk=MkQ0bdjnlyBowvmCU%2faIT%2brFltHYn0WMVcUVT05F9Hg%3d&risl=&pid=ImgRaw');

INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2021-11-20T03:00:00Z',TIMESTAMP WITH TIME ZONE '2022-11-20T03:00:00Z','1');
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2021-12-20T03:00:00Z',TIMESTAMP WITH TIME ZONE '2022-12-20T03:00:00Z','1');

INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Trilha HTML', 'Trilha principal do curso', 1, 'https://th.bing.com/th/id/OIP.XOcIn1C4klFDj1VH97Ve8gHaHa?pid=ImgDet&rs=1', 1, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Forum HTML', 'Tire suas dúvidas', 2, 'https://th.bing.com/th/id/OIP.XOcIn1C4klFDj1VH97Ve8gHaHa?pid=ImgDet&rs=1', 2, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Lives', 'Lives exclusivas para a turma', 3, 'https://th.bing.com/th/id/OIP.XOcIn1C4klFDj1VH97Ve8gHaHa?pid=ImgDet&rs=1', 0, 1);

INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capítulo 1', 'Nesse capítulo vamos começar', 1, 'https://th.bing.com/th/id/OIP.XOcIn1C4klFDj1VH97Ve8gHaHa?pid=ImgDet&rs=1', 1, null);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capítulo 2', 'Nesse capítulo vamos continuar', 2, 'https://th.bing.com/th/id/OIP.XOcIn1C4klFDj1VH97Ve8gHaHa?pid=ImgDet&rs=1', 1, 1);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capítulo 3', 'Nesse capítulo vamos finalizar', 3, 'https://th.bing.com/th/id/OIP.XOcIn1C4klFDj1VH97Ve8gHaHa?pid=ImgDet&rs=1', 1, 2);