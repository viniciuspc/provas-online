**Comandos SQL para criação das tabelas no banco**

create table usuario<br>
(<br>
id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),<br>
nome varchar(30) NOT NULL,<br>
login varchar(25) NOT NULL,<br>
senha varchar(10) NOT NULL,<br>
tipo integer NOT NULL,<br>
CONSTRAINT primary_key PRIMARY KEY (id)<br>
)<br>