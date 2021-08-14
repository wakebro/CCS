CREATE DATABASE ccs;

USE ccs;

CREATE TABLE dept (
	dept_no int AUTO_INCREMENT,
    name varchar(20) NOT NULL,
    CONSTRAINT PK PRIMARY KEY(dept_no)
);

CREATE TABLE member (
	name varchar(20) NOT NULL,
    no int NOT NULL AUTO_INCREMENT,
    id varchar(20) NOT NULL,
    pw varchar(20) NOT NULL,
    dept_no int NOT NULL,
    phone varchar(15),
    email varchar(30) NOT NULL,
    FOREIGN KEY(dept_no) REFERENCES dept(dept_no),
    PRIMARY KEY(no, id, name)
);
CREATE INDEX idx_member_id ON member(id);
/* 복합키에서 특정 부분키만 참조하기 위해 생성*/

CREATE TABLE commute (
    no int NOT NULL,
    attendance timestamp NOT NULL,
    leave_work timestamp NOT NULL,
    FOREIGN KEY(no) REFERENCES member(no)
);

CREATE TABLE notice (
    id varchar(20),
    title varchar(40)  NOT NULL,
    content varchar(2000) NOT NULL,
    hit int DEFAULT 0,
    date timestamp NOT NULL,
    no int auto_increment PRIMARY KEY,
    FOREIGN KEY(id) REFERENCES member(id)
);

/*부서 테이블 설정*/
ALter table dept auto_increment=1000;
INSERT INTO dept(name) VALUES('경영지원');
INSERT INTO dept(name) VALUES('인사');
INSERT INTO dept(name) VALUES('홍보마케팅');
INSERT INTO dept(name) VALUES('기획');
INSERT INTO dept(name) VALUES('디자인');