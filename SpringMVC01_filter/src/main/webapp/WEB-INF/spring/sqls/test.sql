DROP SEQUENCE MYNOSEQ;
DROP TABLE MYBOARD;

CREATE SEQUENCE MYNOSEQ NOCACHE;
CREATE TABLE MYBOARD(
	MYNO NUMBER PRIMARY KEY,
	MYNAME VARCHAR2(1000) NOT NULL,
	MYTITLE VARCHAR2(2000) NOT NULL,
	MYCONTENT VARCHAR2(4000) NOT NULL,
	MYDATE DATE NOT NULL
);

INSERT INTO MYBOARD 
VALUES(MYNOSEQ.NEXTVAL, '관리자','스프링 테스트','SPRING MVC 어렵다...',SYSDATE);

SELECT * FROM MYBOARD;














