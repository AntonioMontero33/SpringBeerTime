insert into categoria (nombrecategoria) values ("Ron"), ("Whisky"),("Vodka");

insert into marca (nombremarca) values ("Cartavio"), ("Jack Daniels"), ("Absolut");

insert into local (nombrelocal,ubicacionlocal,ruclocal,contrasena) values ("Borrachos","Urb. Magsiterio segunda etapa","15487236","159"),("Roncito","Entel Peru C-8","89567214","753"),("Secala","Urb. La Florida C-9","89778865","999");

insert into usuario (dniusuario,nombreusuario,apellidousuario,usuario,contrasena,celular,correo,direccion) values ("12457896","Josept","Ccoyore","jose123","123","954123678","jose@hotmail.com","Urb. Magisterio segunda etapa"),("85742631","Pedro","Picapiedra","pedro123","321","978456632","picapiedra@hotmail.com","Urb. La Florida M-23"),("84752633","Pabel","Peña","pabelita123","32111","978484859","pabelita@hotmail.com","Urb. entel Peru M-22");

insert into reserva (fechareserva,estadoreserva,tieneusuario,tienelocal) values ("2021-02-17",TRUE,1,1),("2021-06-19",TRUE,2,2),("2021-04-18",TRUE,3,3);

insert into producto(nombreproducto, mililitrosproducto,descripcionproducto,volalcoholproducto,imagenproducto,tienemarca,tienecategoria) values ("Black",1000,"Ron Cartavio Black",27,"licor1",1,1),("Blanco",1000,"Ron blanco ","25","licor2",2,2),("Etiqueta Azul",1000,"Delicioso whisky",50,"licor3",3,3);

insert into productolocal (precioproductolocal,tieneproducto,tienelocal) values ("25",1,1),("35",2,2),("45",3,3);

insert into detallereserva (cantidaddetallereserva,tieneproductolocal,tienereserva) values (2,1,1),(1,2,2),(2,3,3);