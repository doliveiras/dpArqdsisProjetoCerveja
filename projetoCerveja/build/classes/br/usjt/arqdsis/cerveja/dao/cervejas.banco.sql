# SQL command to create the table: 
# Remember to correct VARCHAR column lengths to proper values 
# and add additional indexes for your own extensions.

# If you had prepaired CREATE TABLE SQL-statement before, 
# make sure that this automatically generated code is 
# compatible with your own code. If SQL code is incompatible,
# it is not possible to use these generated sources successfully.
# (Changing VARCHAR column lenghts will not break code.)

CREATE TABLE cervejas (
      id bigint AUTO_INCREMENT NOT NULL,
      nomeCerveja varchar(255),
      tipo varchar(255),
      fabricante varchar(255),
      preço double,
PRIMARY KEY(id),
INDEX cervejas_id_INDEX (id));



             