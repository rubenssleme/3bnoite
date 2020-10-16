/* Cria��o do banco de dados */
CREATE DATABASE EXERCICIO;

/* usando o  banco de dados */
USE EXERCICIO;

/* cria��o da base de dados */
CREATE TABLE TBLFUNCIONARIOS(
 CODIGO	INT IDENTITY NOT NULL,
 NOME			NVARCHAR(20),
 SOBRENOME		NVARCHAR(20),
 DATANASC				DATE,
 CPF				NCHAR(12),
 ENDERECO		NVARCHAR(50),
 CEP				NCHAR(12),
 CIDADE			NVARCHAR(50),
 TELEFONE		NVARCHAR(20),
 CODIGODEPARTAMENTO		INT,
 FUNCAO			NVARCHAR(20),
 SALARIO MONEY,
 ); 

 SELECT * FROM TBLFUNCIONARIOS;
 
/* cria��o da base de dados */
CREATE TABLE TBLDEPARTAMENTO(
CODIGO			 INT NOT NULL,
NOME			NVARCHAR(20),
LOCAL  			NVARCHAR(20),
CODIGOGERENTE  INT,
);

SELECT * FROM TBLDEPARTAMENTO;

/*INSERTS DA TABELA TBLDEPARTAMENTOS*/
INSERT INTO TBLDEPARTAMENTO VALUES(1,'COMPRA','DEPTOCOMPRAS',2);
INSERT INTO TBLDEPARTAMENTO VALUES(2,'VENDAS','DEPTOVENDAS',3);
INSERT INTO TBLDEPARTAMENTO VALUES(3,'EMPRESTIMO','DEPTOEMPRESTIMO',4);
INSERT INTO TBLDEPARTAMENTO VALUES(4,'NEGOCIA��O','DEPTONEGOCI��O',5);
INSERT INTO TBLDEPARTAMENTO VALUES(5,'VENDASEMB','DEPTOVENDASEMB',6);


/*INSERTS DA TABELA TBLFUNCIONARIOS*/
INSERT INTO TBLFUNCIONARIOS 
VALUES('MARCELO','FONTANA','1975-06-14','25361705861','RUA AMADOR BUENO 225','13035030','CAMPINAS','19991128818',2,'COMPRADOR','800.00');

INSERT INTO TBLFUNCIONARIOS 
VALUES('ADRUBAL','TEIXEIRA','1980-05-14','25361705866','RUA DAS ROSA 25','13085030','S�O PAULO','11888888888',3,'ANALISTA','1500.00');

INSERT INTO TBLFUNCIONARIOS 
VALUES('SALVATORE','ECALONE','1976-06-16','25361705862','RUA DAS ORQUIDEAS','13035202','CAMPINAS','19991128818',5,'VENDAS','2500.00');

INSERT INTO TBLFUNCIONARIOS 
VALUES('ADURBALINO','FONTANA','1975-06-14','25361705861','RUA AMADOR BUENO 225','13035030','CAMPINAS','19991128818',2,'COMPRADOR','3500.00');

INSERT INTO TBLFUNCIONARIOS 
VALUES('RUBENS','LEME','1974-06-12','25361705861','RUA AMADOR BUENO 225','13035030','CAMPINAS','19991128818',5,'VENDEDOR','5500.00');

INSERT INTO TBLFUNCIONARIOS 
VALUES('PAULO','LEME','1974-06-12','25361705861','RUA AMADOR BUENO 225','13035030','CAMPINAS','19991128818',5,'PROFESSOR','500.00');

INSERT INTO TBLFUNCIONARIOS 
VALUES('CARLOS','','1974-06-12','25361705861','RUA AMADOR BUENO 225','13035030','CAMPINAS','19991128818',5,'PROFESSOR','500.00');

INSERT INTO TBLFUNCIONARIOS 
VALUES('VINICIUS','','1974-06-12','25361705861','RUA AMADOR BUENO 225','13035030','CAMPINAS','19991128818',5,'PROFESSOR','500.00');

UPDATE  TBLFUNCIONARIOS 
SET SALARIO = '495.00'
WHERE NOME='MARCELO';

/*EXERCICIOS  */

/*EXER 01  */
SELECT NOME,SOBRENOME FROM TBLFUNCIONARIOS ORDER BY SOBRENOME;

/*EXER 02  */
SELECT * FROM TBLFUNCIONARIOS ORDER BY CIDADE;

/*EXER 03  */
SELECT NOME,SOBRENOME FROM TBLFUNCIONARIOS ORDER BY NOME,SOBRENOME ASC;

/*EXER 04  */
SELECT * FROM TBLFUNCIONARIOS WHERE SALARIO > '1000.00' ORDER BY NOME,SOBRENOME;

/*EXER 05  */
SELECT DATANASC,NOME FROM TBLFUNCIONARIOS  ORDER BY DATANASC DESC;

/*EXER 06  */
SELECT NOME,SOBRENOME,ENDERECO,CIDADE,TELEFONE FROM TBLFUNCIONARIOS  ORDER BY NOME ;

/*EXER 07  */
SELECT  SUM(SALARIO) AS FOLHAPAGTO FROM TBLFUNCIONARIOS ;

/*EXER 08  */
SELECT T1.NOME, T2.NOME, T1.FUNCAO FROM TBLFUNCIONARIOS T1, TBLDEPARTAMENTO T2 WHERE T1.CODIGODEPARTAMENTO = T2.CODIGO;

/*EXER 09  */
SELECT T1.NOME, T2.NOME FROM TBLDEPARTAMENTO T1, TBLFUNCIONARIOS T2 WHERE T1.CODIGOGERENTE = T2.CODIGO;

/*EXER 10  */
SELECT  T1.NOME, SUM(T2.SALARIO) AS FOLHAPAGTO FROM TBLDEPARTAMENTO T1, TBLFUNCIONARIOS T2 WHERE T1.CODIGO = T2.CODIGODEPARTAMENTO GROUP BY T1.NOME,SALARIO;

/*EXER 11  */
SELECT T1.NOME,T2.NOME FROM TBLFUNCIONARIOS T1 ,TBLDEPARTAMENTO T2 WHERE T1.CODIGODEPARTAMENTO = T2.CODIGO AND FUNCAO = 'COMPRADOR'

/*EXER 12  */
SELECT COUNT(CODIGO) AS QTDEFUNCIONARIO FROM TBLFUNCIONARIOS;

/*EXER 13  */
SELECT AVG (SALARIO) AS MEDIASALARIO FROM TBLFUNCIONARIOS;

/*EXER 14  */


/*EXER 15  */
SELECT NOME FROM TBLFUNCIONARIOS WHERE SOBRENOME = <>;

/*EXER 16  */
SELECT T1.NOME, T2.NOME AS NOMEDEPTO FROM TBLFUNCIONARIOS T1, TBLDEPARTAMENTO T2 WHERE T1.CODIGODEPARTAMENTO = T2.CODIGO ORDER BY T1.NOME ;

/*EXER 17  */
SELECT NOME FROM TBLFUNCIONARIOS WHERE CIDADE='CAMPINAS' AND FUNCAO ='PROFESSOR';

/*EXER 18  */
SELECT T1.NOME FROM TBLFUNCIONARIOS T1, TBLDEPARTAMENTO T2 WHERE T1.CODIGO=T2.CODIGO AND LOCAL ='DEPTOCOMPRAS';

/*EXER 19  */
SELECT T1.NOME, T2.NOME FROM TBLFUNCIONARIOS T1, TBLDEPARTAMENTO T2 WHERE T1.CODIGODEPARTAMENTO = T2.CODIGO AND SALARIO > (SELECT SALARIO FROM TBLFUNCIONARIOS WHERE FUNCAO ='PROFESSOR');

/*EXER 20  */
SELECT CODIGO, NOME FROM TBLFUNCIONARIOS WHERE CODIGO = 1;